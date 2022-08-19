package board.domain.board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import board.dto.BoardListDto;


public class BoardDao {

private Connection conn;	
	
	public BoardDao(Connection conn) {
		this.conn = conn;
	}

	public int insert(Board board) {
		int result = -1;
		
		try {
			
			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO board ");
			sql.append("VALUES(board_SEQ.NEXTVAL, ? , ?, ?");
			
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
			
			pstmt.setString(1,board.getTitle());
			pstmt.setString(2,board.getContent());
			pstmt.setInt(3,board.getMemberId());

			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;		
	}
	
	public int updateByid(int id, Board board) {
		int result = -1;
		try {
			StringBuilder sql = new StringBuilder();
			sql.append("UPDATE board SET title = ?, content = ?, memberId = ? ");
			sql.append("WHERE id = ?");	
	
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
		
			pstmt.setString(1,board.getTitle());
			pstmt.setString(2,board.getContent());
			pstmt.setInt(3,board.getMemberId());
			pstmt.setInt(4,id);
			
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
			sql.append("DELETE FROM board WHERE id = ?");

			PreparedStatement pstmt = conn.prepareStatement(sql.toString());

			pstmt.setInt(1, id);

			result = pstmt.executeUpdate(); 

		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public Board findById(int id) {
		Board board = new Board();
		try {
			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM board WHERE id = ?" );
			pstmt.setInt(1, id);

			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				board.setId(rs.getInt("id"));
				board.setTitle(rs.getString("title"));
				board.setContent(rs.getString("content"));
				board.setMemberId(rs.getInt("memberId"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return board;


	}
	
	public ArrayList<Board> findAll(){
		ArrayList<Board> boards = new ArrayList<>();
		try {
			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM Board ORDER BY id DESC " );
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				Board board = new Board();
				board.setId(rs.getInt("id"));
				board.setTitle(rs.getString("title"));
				board.setContent(rs.getString("content"));
				board.setMemberId(rs.getInt("memberId"));
				boards.add(board);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return boards;
	}
	
	public  ArrayList<BoardListDto> BoardList(){
		ArrayList<BoardListDto> boardLists = new ArrayList<>();
		try {
			StringBuilder sql = new StringBuilder();
			sql.append("SELECT b.id, b.title, m.username, ");
			sql.append("(SELECT count(*) FROM comments WHERE boardId = b.id) count ");
			sql.append("FROM board b inner join member m ");
			sql.append("on b.memberID = m.id ");

			PreparedStatement pstmt = conn.prepareStatement(sql.toString());

			ResultSet rs  =  pstmt.executeQuery();


			while (rs.next()) {
				BoardListDto dto = new BoardListDto();
				dto.setId(rs.getInt("id"));
				dto.setTitle(rs.getString("title"));
				dto.setUsername(rs.getString("username"));
				dto.setCount(rs.getInt("count"));
				boardLists.add(dto);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return boardLists;
	}

}
