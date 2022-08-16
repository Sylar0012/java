package db;

import java.util.ArrayList;

public class EmpApp {

	public static void main(String[] args) {

		EmpDao empDao = new EmpDao();
		ArrayList<Emp> emps = empDao.직원목록보기();
		// Emp emp = empDao.직원한건보기(7369);
		// System.out.println(emp.getEname()
		/*
		 * Emp emp = new Emp( 7777, "metacoding", "MANAGER", 7369, 500, 0, 10 );
		 * empDao.직원추가(emp);
		 */
		int result = empDao.직원삭제(7839);
		System.out.println(result);
		empDao.직원수정(3000, 1000, 7499);
				
	}

}
