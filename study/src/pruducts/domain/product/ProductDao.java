package pruducts.domain.product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import product.domain.Customer.Customer;

public class ProductDao {
	private Connection conn;

	public ProductDao(Connection conn) {
		this.conn = conn;
	}
	
	// 1. 상품 정보 추가
	public int insert(Product product) {
		int result=-1;
		try {
			StringBuilder sql = new StringBuilder();
			sql.append("insert into product ");
			sql.append("values(product_seq, ?, ?, ?)");	
	
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
		
			pstmt.setString(1, product.getName());
			pstmt.setInt(2, product.getPrice());
			pstmt.setInt(3, product.getQty());
			
			result = pstmt.executeUpdate(); 


		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;

	}
	
	// 2.상품 한개 정보
	public Product findById(int id) {
		Product product = new Product();
		try {
			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM product WHERE id = ?" );
			pstmt.setInt(1, id);

			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				product.setId(rs.getInt("id"));
				product.setName(rs.getString("name"));
				product.setPrice(rs.getInt("price"));
				product.setQty(rs.getInt("qty"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return product;

	}
	
	// 3. 모든 상품 찾기
	public ArrayList<Product> findAll() {
		ArrayList<Product> products = new ArrayList<>();
		try {
			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM product ORDER BY id DESC " );
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				Product product = new Product();
				product.setId(rs.getInt("id"));
				product.setName(rs.getString("name"));
				product.setPrice(rs.getInt("price"));
				product.setQty(rs.getInt("qty"));
				products.add(product);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return products;
	}
	// 4. 상품 정보 변경
	public int updateById(int id, Product product) {
		int result = -1;
		try {
			StringBuilder sql = new StringBuilder();
			sql.append("UPDATE product SET name = ?, price = ?, qty =? ");
			sql.append("WHERE id = ?");	
	
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
		
			pstmt.setString(1, product.getName());
			pstmt.setInt(2, product.getPrice());
			pstmt.setInt(3, product.getQty());
			pstmt.setInt(4, id);
			
			result = pstmt.executeUpdate(); 


		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;

	}
	
	// 5. 상품 정보 삭제
	public int deleteById(int id) {
		int result = -1;
		try {

			StringBuilder sql = new StringBuilder();
			sql.append("DELETE FROM product WHERE id = ?");

			PreparedStatement pstmt = conn.prepareStatement(sql.toString());

			pstmt.setInt(1, id);

			result = pstmt.executeUpdate(); 

		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
		
	}
}

