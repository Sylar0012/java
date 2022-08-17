package service;

import java.sql.Connection;
import java.util.ArrayList;

public class MyApp {

	public static void main(String[] args) {
		Connection conn = DBConnection.connection();
		EmpDao empDao = new EmpDao(conn);
		DeptDao deptDao = new DeptDao(conn);
		
		// DI
		MyService myService = new MyService(empDao, deptDao, conn);
		
		//given 데이터	
		Dept dept = new Dept(80,"TF팀","부산");
		ArrayList<Integer> empnos = new ArrayList<>();
		empnos.add(739);
		empnos.add(7499);
		
		myService.TF팀창설(dept, empnos);
	}

}
