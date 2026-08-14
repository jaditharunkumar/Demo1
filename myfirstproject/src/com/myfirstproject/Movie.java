package com.myfirstproject;

public class Movie {

	String movieName;
	int releasedYear;
	int ticketPrice;
	
	public void MovieTicketDetails() {
		System.out.println("*****MovieTicketDetails*******");
		System.out.println("MovieName: "+movieName);
		System.out.println("ReleasedYear: "+releasedYear);
		System.out.println("TicketPrice: "+ticketPrice);
	}
	
	public static void main(String[] args) {
		
		Movie m1 = new Movie();
		m1.movieName = "Vishwanath & sons";
		m1.releasedYear = 2026;
		m1.ticketPrice = 50;
		m1.MovieTicketDetails();
		
		
		
		Movie m2 = new Movie();
		
		m2.movieName = "Surya son of krishnan";
		m2.releasedYear = 2014;
		m2.ticketPrice = 50;
		m2.MovieTicketDetails();
		

		Movie m3 = new Movie();
		
		m3.movieName = "Ghajini";
		m3.releasedYear = 2015;
		m3.ticketPrice = 50;
		m3.MovieTicketDetails();
		
		
	}

}
