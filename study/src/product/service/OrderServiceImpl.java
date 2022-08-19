package product.service;

import java.sql.Connection;
import java.util.ArrayList;

import product.dto.OrderRespDto;
import product.domain.orders.OrdersDao;
import product.domain.product.ProductDao;

public class OrderServiceImpl implements OrderService{
	
	private Connection connection;
	private ProductDao productDao;
	private OrdersDao ordersDao;
	
	public OrderServiceImpl(Connection connection, ProductDao productDao, OrdersDao ordersDao) {
		this.connection = connection;
		this.productDao = productDao;
		this.ordersDao = ordersDao;
	}

	@Override
	public void 주문하기(int customerid, int productid) {
		int result= -1;
		// 1. 재고확인 ( 재고가 0보다 큰가? product findbyid 의 qty확인)
		if (0<productDao.findById(1).getQty()) {
			result += ordersDao.insert(customerid, productid);
			System.out.println(result);
			result += productDao.updateByIdToQtyMinus(productid);
			System.out.println(result);
		}
		try {
			if(result == 1) {
				connection.commit();
				System.out.println("커밋");
			}else {
				connection.rollback();
				System.out.println("롤백");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void 주문취소하기(int id) {
		int result = -1;
		// 1. order를 deleteByid
		result += ordersDao.deleteById(id);
		// 2. 재고 +1 하기 
		result += productDao.updateByIdToQtyPuls(id);
		try {
			if(result == 1) {
				connection.commit();
			}else {
				connection.rollback();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public ArrayList<OrderRespDto> 고객별주문목록보기(int customerid) {
		return ordersDao.findByIdToOrderList(customerid);
	}


}
