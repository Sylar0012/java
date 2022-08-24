package arc.domain.arc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;



public class ArcDao {
	private Connection conn;

	public ArcDao(Connection conn) {
		this.conn = conn;
	}

	public int insert(Arc arc) {
		int result = -1;

		try {

			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO arc ");
			sql.append("VALUES (arc_SEQ.NEXTVAL, ? , ?, ? )");

			PreparedStatement pstmt = conn.prepareStatement(sql.toString());

			pstmt.setString(1, arc.getItemname());
			pstmt.setInt(2, arc.getItemqty());
			pstmt.setString(3, arc.getItemfrom());

			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	public int updateByid(int id, Arc arc) {
		int result = -1;
		try {
			StringBuilder sql = new StringBuilder();
			sql.append("UPDATE arc SET itemname = ?, itemqty = ?, itemfrom = ? ");
			sql.append("WHERE id = ?");	
	
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
		
			pstmt.setString(1, arc.getItemname());
			pstmt.setInt(2, arc.getItemqty());
			pstmt.setString(3, arc.getItemfrom());
			pstmt.setInt(4,id);
			
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
			sql.append("DELETE FROM arc WHERE id = ?");

			PreparedStatement pstmt = conn.prepareStatement(sql.toString());

			pstmt.setInt(1, id);

			result = pstmt.executeUpdate(); 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public Arc findById(int id) {
		Arc arc = new Arc();
		try {
			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM arc WHERE id = ?" );
			pstmt.setInt(1, id);

			ResultSet rs = pstmt.executeQuery();
			
			if (rs.next()) {
				arc.setId(rs.getInt("id"));
				arc.setItemname(rs.getString("itemname"));
				arc.setItemqty(rs.getInt("itemqty"));
				arc.setItemfrom(rs.getString("itemfrom"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return arc;
		

	}
	
	public ArrayList<Arc> findAll(){
		ArrayList<Arc> arcs = new ArrayList<>();
		try {
			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM arc ORDER BY id DESC " );
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				Arc arc = new Arc();
				arc.setId(rs.getInt("id"));
				arc.setItemname(rs.getString("itemname"));
				arc.setItemqty(rs.getInt("itemqty"));
				arc.setItemfrom(rs.getString("itemfrom"));
				arcs.add(arc);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return arcs;
	}
}
