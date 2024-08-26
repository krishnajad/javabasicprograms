package Multithreading;

public class BookSeats extends Thread {
	int seats;
	BookTheaterSeats t;
	BookSeats(BookTheaterSeats t,int seats){
		this.t=t;
		this.seats=seats;
	}
	
	public void run() {
		
		t.bookSeat(seats);
		
	}

	public static void main(String[] args) {
		 BookTheaterSeats t = new BookTheaterSeats();
		 BookSeats k=new BookSeats(t,4);
		
		 k.start();
		 BookSeats j=new BookSeats(t,9);
		 j.start();
		
	}

}
