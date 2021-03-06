package com.lti.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.lti.model.Product;

public class ProductDao {

		public void insert(Product product) {
			Connection conn = null;
			PreparedStatement stmt = null;
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "HR", "HR");
				String sql = "INSERT INTO tbl_product VALUES(?, ?, ?, ?)";
				stmt = conn.prepareStatement(sql);
				stmt.setInt(1, product.getId());
				stmt.setString(2, product.getName());
				stmt.setDouble(3, product.getPrice());
				stmt.setInt(4, product.getQuantity());
				stmt.executeUpdate();
			}
			catch(ClassNotFoundException | SQLException e) {
				e.printStackTrace();				
			}
			
			finally {
				try { conn.close(); } catch(Exception e) { }
			}
	}
	

}