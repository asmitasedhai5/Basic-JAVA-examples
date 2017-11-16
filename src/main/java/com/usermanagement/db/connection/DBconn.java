package com.usermanagement.db.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DBconn {
	
	public static void main(String[] args) {

		try (Connection conn = getConnection()) {
			final Statement stmt = conn.createStatement();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	

	public static Connection getConnection()throws SQLException {
	  return DriverManager.getConnection(
	 "jdbc:mysql://localhost:3306/practice",
	 "root",
	  ""
	  );

  }
}
