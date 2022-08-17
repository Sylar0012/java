package db;

import java.util.ArrayList;

public class DeptApp {
	public static void main(String[] args) {
		DeptDao deptDao = new DeptDao();
		ArrayList<Dept> depts = deptDao.근무지정보();
		
		
		 //Dept dept = new Dept( 50, "Aaaa", "aaaa" );
		// deptDao.근무지추가(dept);
		//int result = deptDao.근무지삭제(50);
		//System.out.println(result);
		//System.out.println(depts.get(1).getDeptno());
		deptDao.근무지수정("qqqqq", "vvvvv",50);
		
		
	}
}
