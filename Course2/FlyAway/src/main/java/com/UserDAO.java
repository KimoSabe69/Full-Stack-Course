package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {
	private String databaseURL = "jdbc:mysql://localhost:3306/FlyAway";
	private String databaseUsername = "root";
	private String databasePassword = "Ks18021997";
	private String databaseDriver = "com.mysql.cj.jdbc.Driver";
	private String message;
	private boolean approved = false;
	private ResultSet results;
	
	
	public void dbLoad(String databaseDriver) {
		try {
			Class.forName(databaseDriver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Connection dbConnect() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(databaseURL, databaseUsername, databasePassword);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
	
	public String insert(User user) {
		dbLoad(databaseDriver);
		Connection connection = dbConnect();
		String query = "INSERT INTO users (Firstname, Surname, Email, Cell, Password) VALUES (?,?,?,?,?)";
		PreparedStatement ps;
		
		try {
			ps = connection.prepareStatement(query);
			ps.setString(1, user.getFirstname());
			ps.setString(2, user.getSurname());
			ps.setString(3, user.getEmail());
			ps.setString(4, user.getCell());
			ps.setString(5, user.getPassword());
			int approved = ps.executeUpdate();
			if (approved ==1) {
				this.approved = true;
			}
			this.message = "\n\ndata entered successfully\n";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			this.message = "data not entered";
		}
		return this.message;
	}
	
	public String verify(User member) {
		dbLoad(databaseDriver);
		Connection connection = dbConnect();
		String query = "SELECT * FROM users WHERE Email = ? AND Password = ?";
		PreparedStatement ps;
		this.message = "Logged in successfully";
		try {
			ps = connection.prepareStatement(query);
			ps.setString(1, member.getEmail());
			ps.setString(2, member.getPassword());
			this.results  = ps.executeQuery();
			this.approved = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			this.message = "User does not exist";
		}
		return this.message;
	}

	public ResultSet getResults() {
		return results;
		}
	public boolean getApproved() {
		return approved;
		}

}
