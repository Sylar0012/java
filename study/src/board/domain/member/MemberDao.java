package board.domain.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class MemberDao {
	
	private Connection conn;	
	
	public MemberDao(Connection conn) {
		this.conn = conn;
	}

	public int insert(Member member) {
		int result = -1;
		
		try {
			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO MEMBER ");
			sql.append("VALUES(MEMBER_SEQ.NEXTVAL, ? , ?");
			
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
			
			pstmt.setString(1,member.getUsername());
			pstmt.setString(2,member.getPassword());
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;		
	}
	
	public int updateByid(int id, Member member) {
		int result = -1;
		try {
			StringBuilder sql = new StringBuilder();
			sql.append("UPDATE member SET username = ?, password = ? ");
			sql.append("WHERE id = ?");	
	
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
		
			pstmt.setString(1, member.getUsername());
			pstmt.setString(2, member.getPassword());
			pstmt.setInt(3, id);
			
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
			sql.append("DELETE FROM member WHERE id = ?");

			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
			pstmt.setInt(1, id);

			result = pstmt.executeUpdate(); 

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
		
	}
		
	public Member findById(int id) {
		
		Member member = new Member();
		
		try {
			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM member WHERE id = ?" );
			pstmt.setInt(1, id);

			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				member.setId(rs.getInt("id"));
				member.setUsername(rs.getString("username"));
				member.setPassword(rs.getString("password"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return member;


	}
	
	public ArrayList<Member> findAll(){
		ArrayList<Member> members = new ArrayList<>();
		
		try {
			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM customer ORDER BY id DESC " );
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				Member member = new Member();
				member.setId(rs.getInt("id"));
				member.setUsername(rs.getString("username"));
				member.setPassword(rs.getString("password"));
				members.add(member);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return members;
	}
}
