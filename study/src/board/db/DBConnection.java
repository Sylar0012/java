package board.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	public static Connection connection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SCOTT", "TIGER");
			conn.setAutoCommit(false);
			return conn;		

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
