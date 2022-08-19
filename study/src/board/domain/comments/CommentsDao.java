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

	// 1. 댓글 작성
	public int insert(Comments comments) {
		int result = -1;

		try {
			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO comments ");
			sql.append("VALUES(comments_seq.nextval,?,?,?)");

			PreparedStatement pstmt = conn.prepareStatement(sql.toString());

			pstmt.setString(1, comments.getContent());
			pstmt.setString(2, comments.getContent());
			pstmt.setInt(3, comments.getMembersId());

			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	// 2. 댓글 수정
	public int updateById(int id, Comments comments) {
		int result = -1;
		try {
			StringBuilder sql = new StringBuilder();
			sql.append("UPDATE comments SET content = ? ");
			sql.append("WHERE id = ?");	
	
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
		
			pstmt.setString(1, comments.getContent());
			pstmt.setInt(2, id);
			
			result = pstmt.executeUpdate(); 


		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;

	}
	// 3. 댓글 삭제
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
	// 4. 댓글 한개 보기
	public Comments findById(int id) {
		Comments comments = new Comments();
		try {
			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM comments WHERE id = ?");
			pstmt.setInt(1, id);

			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				comments.setId(rs.getInt("id"));
				comments.setContent(rs.getString("content"));
				comments.setBoardsId(rs.getInt("boardsId"));
				comments.setMembersId(rs.getInt("memberId"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return comments;
		

	}
	// 5. 댓글 모두 보기
	public ArrayList<Comments> findAll() {
		ArrayList<Comments> commentes = new ArrayList<>();
		try {
			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM comments ORDER BY id DESC ");
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				Comments comments = new Comments();
				comments.setId(rs.getInt("id"));
				comments.setContent(rs.getString("content"));
				comments.setBoardsId(rs.getInt("boardsId"));
				comments.setMembersId(rs.getInt("memberId"));
				commentes.add(comments);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return commentes;
	}
}


