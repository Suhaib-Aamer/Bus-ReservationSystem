package BusReservation;

import java.sql.*;

public class Bus {
	int BusNo;
	boolean Ac;
	int capacity;
	
	public static void displayBuses() throws SQLException
	{
		Connection con = DBConnection.getConnection();
		Statement st = con.createStatement();
		String Q = "Select * from bus";
		ResultSet rs = st.executeQuery(Q);
		
		while(rs.next())
		{
			System.out.print("Bus no: "+ rs.getInt(1)+"\n");
			System.out.print("AC: "+rs.getBoolean(2)+"\n");
			System.out.println("Capacity: "+rs.getInt(3)+"\n");
		}
	}
	
	public static int getCapacity(int BusNo) throws SQLException
	{
		Connection con = DBConnection.getConnection();
		Statement st = con.createStatement();
		String Q = "select capacity from bus where "+BusNo;
		
		ResultSet rs = st.executeQuery(Q);
		rs.next();
		return rs.getInt(1);
	}
	
}
