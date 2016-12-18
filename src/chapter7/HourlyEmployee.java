package chapter7;

import chapter4.Date;

public class HourlyEmployee extends Employee {

	private double wageRate;
	private double hours; // for the month

	public HourlyEmployee() {
		super();
		wageRate = 0;
		hours = 0;
	}

	public HourlyEmployee(String theName, Date theDate, 
			double theWageRate, double theHours){

		super(theName, theDate);

		if ((theWageRate >= 0 ) && (theHours >= 0)){
			this.wageRate = theWageRate;
			this.hours = theHours;
		}
		else{
			System.out.println("Fatal error: creating an illegal hourly employee.");
			System.exit(0);
		}

	}


	public HourlyEmployee(HourlyEmployee originalObject){

		super(originalObject);
		this.wageRate = originalObject.wageRate;
		this.hours = originalObject.hours;
	}

	public double getRate(){
		return this.wageRate;
	}

	public double getHours(){
		return this.hours;
	}

	/**
	 * returns the pay for the month.
	 */
	public double getPay(){
		return this.wageRate * this.hours;
	}

	public void setHours(double hoursWorked){

		if (hoursWorked >= 0)
			this.hours = hoursWorked;
		else{
			System.out.println("Fatal error: negatibe hours worked.");
			System.exit(0);
		}


	}

	public void setRate(double newWageRate){

		if (newWageRate >= 0)
			this.wageRate = newWageRate;
		else{
			System.out.println("Fatal error, negative wage rate");
			System.exit(0);
		}
	}


	public String toString() {
		return (this.getName() + " " + this.getHireDate().toString()
				+ "\n$" + this.wageRate + " per hour for " + this.hours + " hours.");

	}


	public boolean equals(HourlyEmployee otherObject) {

		return (this.getName().equals(otherObject.getName())
				&& this.getHireDate().equals(otherObject.getHireDate())
				&& this.wageRate == otherObject.wageRate
				&& this.hours == otherObject.hours);
	}

}
