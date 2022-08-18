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
		// 1. 재고확인 ( 재고가 0보다 큰가? product findbyid 의 qty확인)
		
		// 2. 주문하기 ( order insert )
		// 3. 재고 -1 하기 ( product updateByToQty )
		
	}

	@Override
	public void 주문취소하기(int id) {
		// 1. order를 deleteByid
		
		// 2. 재고 +1 하기 
		
	}

	@Override
	public ArrayList<OrderRespDto> 고객별주문목록보기(int customerid) {
		return ordersDao.findByIdToOrderList(customerid);
	}

}
