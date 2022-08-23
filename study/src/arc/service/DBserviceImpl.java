package arc.service;

import java.sql.Connection;
import java.util.ArrayList;

import arc.domain.arc.Arc;
import arc.domain.arc.ArcDao;

public class DBserviceImpl implements DBservice {

	private Connection connection;
	private ArcDao arcDao;

	public DBserviceImpl(Connection connection, ArcDao arcDao) {
		this.connection = connection;
		this.arcDao = arcDao;

	}

	@Override
	public void 추가(Arc arc) {
		int result = 0;
		result += arcDao.insert(arc);
		try {
			if (result == 1) {
				connection.commit();
				System.out.println("사용한 아이템 추가 커밋");
			} else {
				connection.rollback();
				System.out.println("사용한 아이템 추가 롤백");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void 수정(int id, Arc arc) {
		int result = 0;
		result += arcDao.updateByid(id, arc);

		try {
			if (result == 1) {
				connection.commit();
				System.out.println("사용한 아이템 데이터 수정 커밋");
			} else {
				connection.rollback();
				System.out.println("사용한 아이템 데이터 수정 롤백");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void 삭제(int id) {
		int result = 0;
		result += arcDao.deleteById(id);

		try {
			if (result == 1) {
				connection.commit();
				System.out.println("사용 아이템 데이터 삭제 커밋");
			} else {
				connection.rollback();
				System.out.println("사용 아이템 데이터 삭제 롤백");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void 한개검색(int id) {
		arcDao.findById(id);

		System.out.println("ID 	   ITEMNAME        QTY         FROM ");
		System.out.printf(arcDao.findById(id).getId() + " \t");
		System.out.printf(arcDao.findById(id).getItemname() + " \t");
		System.out.printf(arcDao.findById(id).getItemqty() + " \t");
		System.out.printf(arcDao.findById(id).getItemfrom() + " \n");
	}

	@Override
	public void 전부검색() {
		System.out.println("ID 	   ITEMNAME        QTY         FROM ");
		ArrayList<Arc> arcSize = arcDao.findAll();
		for (int i = 0; i < arcSize.size(); i++) {
			System.out.print(arcSize.get(i).getId() + " \t");
			System.out.print(arcSize.get(i).getItemname() + " \t");
			System.out.print(arcSize.get(i).getItemqty() + " \t");
			System.out.print(arcSize.get(i).getItemfrom() + " \n");
		}
	}



}
