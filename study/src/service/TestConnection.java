package service;

import java.sql.Connection;

public class TestConnection {

	public static void main(String[] args) {
		
		Connection conn1 = DBConnection.connection();
		Connection conn2 = DBConnection.connection();
		
		System.out.println(conn1.hashCode());
		System.out.println(conn2.hashCode());
		
	}
	
}
