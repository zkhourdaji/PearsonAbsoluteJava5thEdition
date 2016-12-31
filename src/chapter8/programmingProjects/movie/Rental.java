package chapter8.programmingProjects.movie;

import java.text.NumberFormat;

public class Rental {
	
	private Movie rentedMovie;
	private int customerID;
	private int numberOfDaysLate;
	

	public Rental(Movie movie, int customerID, int numberOfLateDays) {
		
		this.rentedMovie = movie;
		this.customerID = customerID;
		this.numberOfDaysLate = numberOfLateDays;
	}
	
	public double calculateLateFees(){
		return rentedMovie.calculateLateFees(this.numberOfDaysLate);
	}
	
	@Override
	public String toString() {
		
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		
		return ("Customer ID: " + this.customerID + "\nCustomer is " 
	+ this.numberOfDaysLate + " days late.\n" + this.rentedMovie
	+ "\nCustomer late fee is " + formatter.format(this.calculateLateFees()));
	}
	
	
}
