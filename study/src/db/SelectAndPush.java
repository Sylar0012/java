package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class SelectAndPush {

	// 통신은 하지 않지만 통신을 한다고 가정
	static void send(ArrayList<Emp> datas) {
		// 내부는 안적음
	}

	static Connection connection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", // protocol name @ ip
																									// 주소 : 포트 :DB의 이름
					"SCOTT", // id
					"TIGER" // password
			);
			return conn;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) {
		ArrayList<Emp> emps = new ArrayList<>();
		try {
			// 1 DB연결
			Connection conn = connection();

			// 2 문장완성
			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM emp");

			// 3 문장 전송
			ResultSet rs = pstmt.executeQuery();

			// 4 커서 false때 까지 내리기
			while (rs.next()) {// 14바퀴
				Emp emp = new Emp();
				emp.setEmpno(rs.getInt("empno"));
				emp.setEname(rs.getString("ename"));
				emp.setJob(rs.getString("job"));
				emp.setMgr(rs.getInt("mgr"));
				emp.setHiredate(rs.getTimestamp("hiredate"));
				emp.setSal(rs.getInt("sal"));
				emp.setComm(rs.getInt("comm"));
				emp.setDeptno(rs.getInt("deptno"));
				emps.add(emp);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		int size = emps.size();
		// 데이터 확인
		for (int i = 0; i < size; i++) {
			System.out.println(emps.get(i).getEmpno());
		}

		// 데이터 전송하기
		send(emps);

	}

}
