package BusReservation;

import java.sql.*;

public class DBConnection {
	private static final String url = "jdbc:mysql://localhost:3306/BusReservation";
	private static final String uName = "root";
	private static final String pWord = "Aamer@786";
	
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url, uName, pWord);
	}
}
