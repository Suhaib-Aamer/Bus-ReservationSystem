package BusReservation;

import java.sql.*;
import java.util.*;

public class BusAdmin {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub	
		Bus.displayBuses();
		
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter '1' to Book and '2' to Exit");
			int inp = sc.nextInt();
			if(inp == 1)
			{
				Booking booking = new Booking(sc);
				boolean isAvailable = Booking.isAvailable();
				
				System.out.println("Booked: "+isAvailable);
				if(isAvailable)
				{
					int row = Booking.addBooking(booking);
					if(row>0)
					{
						System.out.println("Booking Confirmed "+booking.PassengerName);
					}
					else
					{
						System.out.print("Something is Wrong!");
					}
				}
				else
				{
					System.out.println("Booking's full, book for another date!");
				}
			}
			else 
			{
				break;
			}			
		}
		sc.close();
	}

}
