package board.domain.comments;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;



public class CommentsDao {
	private Connection conn;	
	
	public CommentsDao(Connection conn) {
		this.conn = conn;
	}

	public int insert(Comments comments) {
		int result = -1;
		
		try {
			
			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO comments ");
			sql.append("VALUES(COMMENTS_SEQ.NEXTVAL, ? , ?, ?");
			
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
			
			pstmt.setString(1,comments.getContent());
			pstmt.setInt(2,comments.getMemberId());
			pstmt.setInt(3,comments.getBoardId());

			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;		
	}
	
	public int updateByid(int id, Comments comments) {
		int result = -1;
		try {
			StringBuilder sql = new StringBuilder();
			sql.append("UPDATE comments SET content = ?, memberId = ?, boardId = ? ");
			sql.append("WHERE id = ?");	
	
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
		
			pstmt.setString(1,comments.getContent());
			pstmt.setInt(2,comments.getMemberId());
			pstmt.setInt(3,comments.getBoardId());
			pstmt.setInt(4,comments.getId());
			
			result = pstmt.executeUpdate(); 


		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public int deleteById(int id) {
		int result = -1;
		try {

			StringBuilder sql = new StringBuilder();
			sql.append("DELETE FROM comments WHERE id = ?");

			PreparedStatement pstmt = conn.prepareStatement(sql.toString());

			pstmt.setInt(1, id);

			result = pstmt.executeUpdate(); 

		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public Comments findById(int id) {
		Comments comments = new Comments();
		try {
			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM comments WHERE id = ?" );
			pstmt.setInt(1, id);

			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				comments.setId(rs.getInt("id"));
				comments.setContent(rs.getString("content"));
				comments.setMemberId(rs.getInt("memberId"));
				comments.setBoardId(rs.getInt("boardId"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return comments;


	}
	
	public ArrayList<Comments> findAll(){
		ArrayList<Comments> comments = new ArrayList<>();
		try {
			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM comments ORDER BY id DESC " );
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				Comments comment = new Comments();
				System.out.println("1");
				comment.setId(rs.getInt("id"));
				comment.setContent(rs.getString("content"));
				comment.setMemberId(rs.getInt("memberId"));
				comment.setBoardId(rs.getInt("boardId"));
				comments.add(comment);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return comments;
	}
}

