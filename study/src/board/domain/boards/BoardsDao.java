package board.domain.boards;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import board.dto.BoardTitleDto;

public class BoardsDao {

	private Connection conn;

	public BoardsDao(Connection conn) {
		this.conn = conn;
	}

	// 1. 글 작성
	public int insert(Boards boards) {
		int result = -1;

		try {
			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO boards ");
			sql.append("VALUES(boards_seq.nextval,?,?,?)");

			PreparedStatement pstmt = conn.prepareStatement(sql.toString());

			pstmt.setString(1, boards.getTitle());
			pstmt.setString(2, boards.getContent());
			pstmt.setInt(3, boards.getMemberId());

			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	// 2. 글 수정
	public int updateById(int id, Boards boards) {
		int result = -1;
		try {
			StringBuilder sql = new StringBuilder();
			sql.append("UPDATE boards SET title = ?, content = ?");
			sql.append("WHERE id = ?");

			PreparedStatement pstmt = conn.prepareStatement(sql.toString());

			pstmt.setString(1, boards.getTitle());
			pstmt.setString(2, boards.getContent());
			pstmt.setInt(3, id);

			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;

	}

	// 3. 글 삭제
	public int deleteById(int id) {
		int result = -1;
		try {

			StringBuilder sql = new StringBuilder();
			sql.append("DELETE FROM boards WHERE id = ?");

			PreparedStatement pstmt = conn.prepareStatement(sql.toString());

			pstmt.setInt(1, id);

			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;

	}

	// 4. 글 한개 보기
	public Boards findById(int id) {
		Boards boards = new Boards();
		try {
			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM boards WHERE id = ?");
			pstmt.setInt(1, id);

			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				boards.setId(rs.getInt("id"));
				boards.setTitle(rs.getString("title"));
				boards.setContent(rs.getString("content"));
				boards.setMemberId(rs.getInt("memberId"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return boards;

	}

	// 5. 글 모두 보기
	public ArrayList<Boards> findAll() {
		ArrayList<Boards> boardes = new ArrayList<>();
		try {
			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM boards ORDER BY id DESC ");
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				Boards boards = new Boards();
				boards.setId(rs.getInt("id"));
				boards.setTitle(rs.getString("title"));
				boards.setContent(rs.getString("content"));
				boards.setMemberId(rs.getInt("memberId"));
				boardes.add(boards);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return boardes;
	}

	// 6. 게시글 목록보기
	public ArrayList<BoardTitleDto> BoardsList(BoardTitleDto a ){
		ArrayList<BoardTitleDto> boardsList = new ArrayList<>();

		try {
			StringBuilder sql = new StringBuilder();
			sql.append("SELECT b1.id id, b1.title title, m1.username username,  ");
			sql.append("(SELECT count(*)FROM comments WHERE boardsId = ? ");
			sql.append("FROM boards b1 INNER JOIN members m1 ");
			sql.append("ON b1.memberId = ?");
			
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
			pstmt.setInt(1, a.getId());
			pstmt.setInt(2, a.getUsername());
			
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				BoardTitleDto boardTitleDto = new BoardTitleDto();
				boardTitleDto.setId(rs.getInt("id"));
				boardTitleDto.setTitle(rs.getString("title"));
				boardTitleDto.setUsername(rs.getString("username"));
				boardTitleDto.setCount(rs.getInt("count"));
				boardsList.add(boardTitleDto);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return boardsList;
		}
		
}


