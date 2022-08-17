package service;

import java.sql.Connection;
import java.util.ArrayList;

public class MyService {

	private EmpDao empDao;
	private DeptDao deptDao;
	private Connection conn;

	public MyService() {
	}

	public MyService(EmpDao empDao, DeptDao deptDao, Connection conn) {
		this.empDao = empDao;
		this.deptDao = deptDao;
		this.conn = conn;
	}

	// 1. 직원 목록
	public ArrayList<Emp> 직원목록() {
		return empDao.직원목록보기();
	}

	// 2. 직원 상세보기
	public Emp 직원목록(int empno) {
		return empDao.직원한건보기(empno);
	}

	// 3. 직원 추가
	public void 직원추가(Emp emp) {
		int Result = empDao.직원추가(emp);
		try {
			if( Result == 1) {
				conn.commit();
			}else {
				conn.rollback();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 4. 부서 추가
	public void 부서추가(Dept dept) {
		int Result = deptDao.부서추가(dept);
		try {
			if( Result == 1) {
				conn.commit();
			}else {
				conn.rollback();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 5. TF팀 창설
	public void TF팀창설(Dept dept, ArrayList<Integer> empnos) {
		int count =0;
		
		count = count +  deptDao.부서추가(dept);
		for (int i = 0; i < empnos.size(); i++) {
			count = count + empDao.직원수정(empnos.get(i), dept.getDeptno());
		}
		try {
			if(count == empnos.size() +1) {
				conn.commit();
				System.out.println("커밋됨");
			}else {
				conn.rollback();
				System.out.println("롤백됨");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
