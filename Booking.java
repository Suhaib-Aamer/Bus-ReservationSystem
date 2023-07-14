package BusReservation;

import java.util.*;
import java.sql.*;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Booking {
	String PassengerName;
	static int BusNo;
	static Date date;
	
	Booking(Scanner sc)
	{
		System.out.println("Enter name of the Passenger: ");
		PassengerName = sc.next();
		
		System.out.println("Enter the bus number: ");
		BusNo = sc.nextInt();
		
		System.out.println("Enter the date dd-mm-yyyy: ");
		String tempDate = sc.next();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		
		try {
			date = sdf.parse(tempDate);
		}
		catch(ParseException e)
		{
			e.printStackTrace();
		}
	}
	
	public static boolean isAvailable() throws SQLException
	{
			int capacity = Bus.getCapacity(BusNo);
			Connection con = DBConnection.getConnection();
			java.sql.Date sqlDate = new java.sql.Date(date.getTime());
			String Q = "select count(*) from booking where bus_no = ? and travel_date = ? ";
			
			PreparedStatement pdt = con.prepareStatement(Q);
			
			pdt.setInt(1,BusNo);
			
			pdt.setDate(2,sqlDate);
			
			ResultSet rs = pdt.executeQuery();
			rs.next();
			int booked = rs.getInt(1);
			if(booked<capacity)
			{
				return true;
			}
			return false;
	}
	
	public static int addBooking(Booking Bking) throws SQLException
	{
		Connection con = DBConnection.getConnection();
		String Q = "insert into booking(passenger_name, bus_no, travel_date) value(?,?,?)";
		PreparedStatement pdt = con.prepareStatement(Q);
		java.sql.Date sqlDate = new java.sql.Date(date.getTime());
		
		pdt.setString(1,Bking.PassengerName);
		pdt.setInt(2, Booking.BusNo);
		pdt.setDate(3, sqlDate);
		
		int row = pdt.executeUpdate();
		return row;
	}
}
