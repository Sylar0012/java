package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DeptDao {

	public int 근무지수정(String dname, String loc, int deptno) {
		int result = -1;
		try {

			// 1. SQL 작성
			StringBuilder sql = new StringBuilder();
			sql.append("UPDATE dept SET dname = ?, loc = ? WHERE deptno = ?");

			// 2. DB세션
			Connection conn = DBConnection.connection();

			// 3. 문장완성
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
			// ? 는 1부터 시작

			pstmt.setString(1, dname);
			pstmt.setString(2, loc);
			pstmt.setInt(3, deptno);

			// 4. 문장 전송
			result = pstmt.executeUpdate(); // 문장 전송 및 commit해줌.

			// result = 1 행하나 변경, 0 변경안됨, -1 오류

		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public int 근무지삭제(int deptno) {
		int result = -1;
		try {

			// 1. SQL 작성
			StringBuilder sql = new StringBuilder();
			sql.append("DELETE FROM dept WHERE deptno = ?");

			// 2. DB세션
			Connection conn = DBConnection.connection();

			// 3. 문장완성
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
			// ? 는 1부터 시작
			pstmt.setInt(1, deptno);

			// 4. 문장 전송
			result = pstmt.executeUpdate(); // 문장 전송 및 commit해줌.

			// result = 1 행하나 변경, 0 변경안됨, -1 오류

		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public int 근무지추가(Dept dept) {
		int result = -1;

		try {
			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO dept ");
			sql.append("VALUES(?,?,?)");

			Connection conn = DBConnection.connection();
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());

			pstmt.setInt(1, dept.getDeptno());
			pstmt.setString(2, dept.getDname());
			pstmt.setString(3, dept.getLoc());

			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;

	}

	public ArrayList<Dept> 근무지정보() {
		ArrayList<Dept> depts = new ArrayList<>();
		try {

			Connection conn = DBConnection.connection();

			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM dept");

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				Dept dept = new Dept();
				dept.setDeptno(rs.getInt("deptno"));
				dept.setDname(rs.getString("dname"));
				dept.setDname(rs.getString("dname"));
				depts.add(dept);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return depts;

	}

}
