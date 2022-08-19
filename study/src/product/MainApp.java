package product;

import java.sql.Connection;
import java.util.ArrayList;

import product.db.DBconnection;
import product.dto.OrderRespDto;
import product.domain.Customer.CustomerDao;
import product.domain.orders.OrdersDao;
import product.domain.product.ProductDao;
import product.service.OrderServiceImpl;

public class MainApp {
	public static void main(String[] args) {
		Connection conn = DBconnection.connection();
		
		CustomerDao customerDao = new CustomerDao(conn);
		ProductDao productDao = new ProductDao(conn);
		OrdersDao ordersDao = new OrdersDao(conn);
		
		OrderServiceImpl orderService = new OrderServiceImpl(conn, productDao,ordersDao);
		
		
//		 int customerid = 1; ArrayList<OrderRespDto> orderRespDtoList =
//		  orderService.고객별주문목록보기(customerid);
//		  
//		  for (int i = 0; i < orderRespDtoList.size(); i++) {
//		  System.out.println(orderRespDtoList.get(0).getId());
//		  System.out.println(orderRespDtoList.get(0).getUsername());
//		  System.out.println(orderRespDtoList.get(0).getName());
//		 System.out.println(orderRespDtoList.get(0).getPrice()); }
//		 
		
		//orderService.주문하기(1, 1);
		orderService.주문취소하기(1);
		
		
		
	}
}
