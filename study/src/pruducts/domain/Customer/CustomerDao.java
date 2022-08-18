package pruducts.domain.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import product.domain.Customer.Customer;

public class CustomerDao {
	private Connection conn;

	public CustomerDao(Connection conn) {
		this.conn = conn;
	}
	
	// 1. 고객 정보 추가
	public int insert(Customer customer) {
		int result=-1;
		try {
			StringBuilder sql = new StringBuilder();
			sql.append("insert into customer ");
			sql.append("values(customer_seq, ?, ?, ?)");	
	
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
		
			pstmt.setString(1, customer.getUsername());
			pstmt.setString(2, customer.getPassword());
			pstmt.setString(3, customer.getEmail());
			
			result = pstmt.executeUpdate(); 


		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;

	}
	
	// 2.고객 한명 정보
	public Customer findById(int id) {
		Customer customer = new Customer();
		try {
			PreparedStatement pstmt = 
					conn.prepareStatement("SELECT * FROM customer WHERE id = ?" );
			pstmt.setInt(1, id);

			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				customer.setId(rs.getInt("id"));
				customer.setUsername(rs.getString("username"));
				customer.setPassword(rs.getString("password"));
				customer.setEmail(rs.getString("email"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return customer;

	}
	
	// 3. 모든 고객 찾기
	public ArrayList<Customer> findAll() {
		ArrayList<Customer> customers = new ArrayList<>();
		try {
			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM customer ORDER BY id DESC " );
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				Customer customer = new Customer();
				customer.setId(rs.getInt("id"));
				customer.setUsername(rs.getString("username"));
				customer.setPassword(rs.getString("password"));
				customer.setEmail(rs.getString("email"));
				customers.add(customer);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return customers;
	}
	// 4. 고객정보 변경
	public int updateById(int id, Customer customer) {
		int result = -1;
		try {
			StringBuilder sql = new StringBuilder();
			sql.append("UPDATE customer SET username = ?, password = ?, email =? ");
			sql.append("WHERE id = ?");	
	
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
		
			pstmt.setString(1, customer.getUsername());
			pstmt.setString(2, customer.getPassword());
			pstmt.setString(3, customer.getEmail());
			pstmt.setInt(4, id);
			
			result = pstmt.executeUpdate(); 


		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;

	}
	
	// 5. 고객 정보 삭제
	public int deleteById(int id) {
		int result = -1;
		try {

			StringBuilder sql = new StringBuilder();
			sql.append("DELETE FROM customer WHERE id = ?");

			PreparedStatement pstmt = conn.prepareStatement(sql.toString());

			pstmt.setInt(1, id);

			result = pstmt.executeUpdate(); 

		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
		
	}
}
