package board.domain.members;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;



public class MembersDao {
	private Connection conn;

	public MembersDao(Connection conn) {
		this.conn = conn;
	}
	// 1. 회원가입
	public int insert(Members members) {
		int result = -1;

		try {
			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO members ");
			sql.append("VALUES(members_seq.nextval,?,?)");

			PreparedStatement pstmt = conn.prepareStatement(sql.toString());

			pstmt.setString(1, members.getUsername());
			pstmt.setString(2, members.getPassword());


			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	// 2. 회원 수정
	public int updateById(int id, Members members) {
		int result = -1;
		try {
			StringBuilder sql = new StringBuilder();
			sql.append("UPDATE members SET username = ?, password = ?");
			sql.append("WHERE id = ?");	
	
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
		
			pstmt.setString(1, members.getUsername());
			pstmt.setString(2, members.getPassword());
			pstmt.setInt(3, id);
			
			result = pstmt.executeUpdate(); 


		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;

	}
	// 3. 회원 탈퇴
	public int deleteById(int id) {
		int result = -1;
		try {

			StringBuilder sql = new StringBuilder();
			sql.append("DELETE FROM members WHERE id = ?");

			PreparedStatement pstmt = conn.prepareStatement(sql.toString());

			pstmt.setInt(1, id);

			result = pstmt.executeUpdate(); 

		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
		
	}
	// 4. 회원 한명 보기
	public Members findById(int id) {
		Members members = new Members();
		try {
			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM members WHERE id = ?");
			pstmt.setInt(1, id);

			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				members.setId(rs.getInt("id"));
				members.setUsername(rs.getString("username"));
				members.setPassword(rs.getString("password"));

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return members;
		

	}
	// 5. 회원 모두 보기
	public ArrayList<Members> findAll() {
		ArrayList<Members> memberes = new ArrayList<>();
		try {
			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM members ORDER BY id DESC ");
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				Members members = new Members();
				members.setId(rs.getInt("id"));
				members.setUsername(rs.getString("username"));
				members.setPassword(rs.getString("password"));
				memberes.add(members);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return memberes;
	}
}
	

