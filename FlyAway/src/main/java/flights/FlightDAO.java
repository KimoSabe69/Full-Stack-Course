package flights;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.User;

public class FlightDAO {
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
	
	public String verify(Plan plan) {
		dbLoad(databaseDriver);
		Connection connection = dbConnect();
		String query = "SELECT * FROM flights WHERE Source = ? AND destination = ? AND departure = ? AND arrival= ?";
		PreparedStatement ps;
		this.message = "\nFlights retreived successfully\n";
		try {
			ps = connection.prepareStatement(query);
			ps.setString(1, plan.getSource());
			ps.setString(2, plan.getDestination());
			ps.setString(3, plan.getDeparture());
			ps.setString(4, plan.getArrival());
			this.results  = ps.executeQuery();
			this.approved = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			this.message = "\nNo available flights\n";
		}
		return this.message;
	}

}
