package Multithreading;

public class BookTheaterSeats {
	int toatalSeats=10;
	synchronized public void bookSeat(int seats) {
		if(toatalSeats>=seats) 
		{
			System.out.println("seat booked");
			toatalSeats=toatalSeats-seats;
		}
		else {
			System.out.println("tickets are not booked");
		}
	}

}
