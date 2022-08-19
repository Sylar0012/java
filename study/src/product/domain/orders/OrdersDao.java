package product.domain.orders;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import product.dto.OrderRespDto;

public class OrdersDao {
	
	private Connection conn;	
	
	public OrdersDao(Connection conn) {
		this.conn = conn;
	}
	

	public int insert(Orders orders) {
		int result = -1;

		try {
			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO orders ");
			sql.append("VALUES(product_seq.nextval,?,?)");

			PreparedStatement pstmt = conn.prepareStatement(sql.toString());

			pstmt.setInt(1, orders.getCustomerid());
			pstmt.setInt(2, orders.getProductid());


			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public int insert(int customerid, int productid) {
		int result = -1;

		try {
			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO orders ");
			sql.append("VALUES(product_seq.nextval,?,?)");

			PreparedStatement pstmt = conn.prepareStatement(sql.toString());

			pstmt.setInt(1, customerid);
			pstmt.setInt(2, productid);


			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public Orders findById(int id) {
		Orders orders = new Orders();
		try {
			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM orders WHERE id = ?" );
			pstmt.setInt(1, id);

			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				orders.setId(rs.getInt("id"));
				orders.setCustomerid(rs.getInt("customerid"));
				orders.setProductid(rs.getInt("productid"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return orders;


	}
	
	public ArrayList<Orders> findAll() {
		ArrayList<Orders> ordersList = new ArrayList<>();
		try {
			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM orders ORDER BY id DESC " );
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				Orders orders = new Orders();
				orders.setId(rs.getInt("id"));
				orders.setCustomerid(rs.getInt("customerid"));
				orders.setProductid(rs.getInt("productid"));
				ordersList.add(orders);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return ordersList;
	}
	

	
	public int updateById(int id, Orders orders) {
		int result = -1;
		try {
			StringBuilder sql = new StringBuilder();
			sql.append("UPDATE orders SET customerid = ?, productid = ? ");
			sql.append("WHERE id = ?");	
	
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
		
			pstmt.setInt(1, orders.getCustomerid());
			pstmt.setInt(2, orders.getProductid());
			pstmt.setInt(3, id);
			
			result = pstmt.executeUpdate(); 


		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;

	}
	
	public int deleteById(int id) {
		int result = -1;
		try {

			StringBuilder sql = new StringBuilder();
			sql.append("DELETE FROM orders WHERE id = ?");

			PreparedStatement pstmt = conn.prepareStatement(sql.toString());

			pstmt.setInt(1, id);

			result = pstmt.executeUpdate(); 

		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
		
	}
	
	public ArrayList<OrderRespDto> findByIdToOrderList(int customerid) {
		ArrayList<OrderRespDto> dtoList = new ArrayList<>();
		try {
			StringBuilder sql = new StringBuilder();
			sql.append("select o.id, c.username, p.name, p.price "); 
			sql.append("FROM orders o ");
			sql.append("INNER JOIN customer c ");
			sql.append("on o.customerid = c.id ");
			sql.append("INNER JOIN product p ");
			sql.append("on o.productid = p.id ");
			sql.append("WHERE c.id = ? ");
			
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
			
			pstmt.setInt(1, customerid);
			
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				OrderRespDto dto = new OrderRespDto();
				dto.setId(rs.getInt("id"));
				dto.setUsername(rs.getString("username"));
				dto.setName(rs.getString("name"));
				dto.setPrice(rs.getInt("price"));
				dtoList.add(dto);			
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return dtoList;
		
	}


}
