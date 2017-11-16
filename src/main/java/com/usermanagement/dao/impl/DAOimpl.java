package com.usermanagement.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.usermanagement.dao.UserDAO;
import com.usermanagement.db.connection.DBconn;
import com.usermanagement.model.User;

public class DAOimpl implements UserDAO {
	DBconn db = new DBconn();

	@Override
	public void insert(User t) {

		try (Connection conn = db.getConnection()) {
			final String insertQuery = "INSERT INTO User(fname,lname,address)VALUES(?,?,?)";
			PreparedStatement ps = conn.prepareStatement(insertQuery);
			ps.setString(1, t.getFname());
			ps.setString(2, t.getLname());
			ps.setString(3, t.getAddress());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void selectId(int id) {
		User u=new User();
		try (Connection conn = db.getConnection()) {
			final String selectQuery = "SELECT * FROM User WHERE id=? ";
			PreparedStatement ps = conn.prepareStatement(selectQuery);
			ps.setInt(1, id);
			//t.getFname();
			//t.getLname();
			//t.getAddress();
			final ResultSet rs = ps.executeQuery();
			
			if( rs!=null ) {
				update(u);
				System.out.println("updated");
				   
				}
			
			else{
				System.out.println("Id not found");
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void update(User t) {

		try (Connection conn = db.getConnection()) {

			final String updateQuery = "UPDATE User SET fname=?,lname=?,address=? where id=?";
			PreparedStatement ps = conn.prepareStatement(updateQuery);
			ps.setString(1, t.getFname());
			ps.setString(2, t.getLname());
			ps.setString(3, t.getAddress());
			ps.setInt(4, t.getId());

			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void delete(User t) {
		try (Connection conn = db.getConnection()) {
			final String updateQuery = "DELETE FROM User WHERE address=? ";
			PreparedStatement ps = conn.prepareStatement(updateQuery);
			ps.setString(1, t.getAddress());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public List display() {
		List<User> userList = new ArrayList();
		try (Connection conn = db.getConnection()) {
			final String displayQuery = "SELECT * FROM User ";
			PreparedStatement ps = conn.prepareStatement(displayQuery);
			final ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				User us = new User();
				us.setId(rs.getInt("id"));
				us.setFname(rs.getString("fname"));
				us.setLname(rs.getString("lname"));
				us.setAddress(rs.getString("address"));

				userList.add(us);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return userList;

	}

}