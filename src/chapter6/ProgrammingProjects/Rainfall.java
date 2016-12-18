package chapter6.ProgrammingProjects;

import java.util.Scanner;

public class Rainfall {

	private String cityName;
	private double[] averageMonthRainfall; // for 12 months
	private double[] actualMonthRainfall; 
	//private int[] months = {1,2,3,4,5,6,7,8,9,10,11,12};


	public Rainfall(String cityName) {

		this.cityName = cityName;
		this.averageMonthRainfall = new double[12];
		this.actualMonthRainfall = new double[12];
	}


	/**
	 * ask the user to input the average monthly rainfall
	 * and the actual monthly rainfall.
	 */
	public void inputValues(){

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Type in the average montly rainfall "
				+ "(from january to december in order) for " + this.cityName);

		for (int i = 0; i < this.averageMonthRainfall.length; i++){
			System.out.println("Input average rainfall for month " + (i + 1));
			this.averageMonthRainfall[i] = keyboard.nextDouble();
		}

		System.out.println("What is the current month? (use number)");
		int currentMonthIndex = keyboard.nextInt() - 1;
		System.out.println("Input the actual rainfall starting from your current month to the previous 12 months");

		int monthsInput = 0;

		for (int index = currentMonthIndex; monthsInput < 12; index--){

			if (index < 0)
				index = 11;
			System.out.println("Input for month " + (index + 1));
			this.actualMonthRainfall[index] = keyboard.nextDouble();
			monthsInput++;


		}


	}

	/**
	 * prints out a nicely formatted table that shows the 
	 * average monthly rainfall for each month and the actual
	 * monthly rainfall for each month.
	 */
	public void display(){



		String [] monthsString = {"Jaunuary", "Febuary", "March", "April", "May", 
				"June", "July", "August", "September", "October", "November", "December"};

		String[][] display = new String[3][13];
		display [0][0] = "    ";
		display[1][0] = "Average Rainfall";
		display [2][0] = "Actual Rainfall";

		for (int i = 1; i < display[0].length; i++){
			display[0][i] = monthsString[i - 1];
			display[1][i] = String.valueOf(this.averageMonthRainfall[i-1]);
			display[2][i] = String.valueOf(this.actualMonthRainfall[i-1]);

		}

		for (int i = 0; i < display.length; i++){

			for (int j = 0; j < display[0].length; j++){
				
				if ((i == 0 && j == 0)
						|| (i == 1 && j == 0)
						|| (i == 2 && j == 0))
					System.out.printf("%-19s", display[i][j]);
				else
					System.out.printf("%-10s", display[i][j]);

			}
			System.out.println();
		}

	}


	public String toString() {
		return "";
	}


	public boolean equals(Object arg0) {
		return false;
	}




}
