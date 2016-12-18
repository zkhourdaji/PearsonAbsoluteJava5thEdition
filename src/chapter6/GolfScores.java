package chapter6;

import java.util.Scanner;

public class GolfScores {

	public static final int MAX_NUMBER_SCORES = 10;

	/**
	 * Shows differences between each of a list of golf scores and their 
	 * averages
	 */

	public static void main(String[] args) {

		double [] score = new double[MAX_NUMBER_SCORES];
		int numberUsed = 0;
		
		System.out.println("This program reads golf scores and shows");
		System.out.println("How much each differs from teh average.");
		System.out.println("Enter golf scores:");
		numberUsed = fillArray(score);
		showDifference(score, numberUsed);
	}

	public static int fillArray(double[] a){
		
		System.out.println("Enter up to " + a.length + " nonnegative numbes.");
		System.out.println("Mark the end of the list with a negative number.");
		
		Scanner keyboard = new Scanner(System.in);
		
		double next;
		int index = 0;
		next = keyboard.nextDouble();
		
		while ((next >= 0) && (index < a.length)){
			a[index] = next;
			index++;
			next = keyboard.nextDouble();
			// index is the number of array indexed variables used so far.
		}
		// index is the total number of array indexed variables used.
		
		if (next >= 0)
			System.out.println("Could only read in " + a.length + " input values.");
		
		return index;
		
	}

	public static double computeAverage(double[] a, int numberUsed){

		double total = 0;

		for (int index = 0; index < numberUsed; index++)
			total = total + a[index];
		
		if (numberUsed > 0)
			return total/numberUsed;
		else{
			System.out.println("Error: Trying to average 0 numbers.");
			System.out.println("computerAverage returns 0.");
			return 0;
		}
			

	}

	public static void showDifference(double[] a, int numberUsed){

		double average = computeAverage(a, numberUsed);
		System.out.println("Average of the " + numberUsed + " scores = " + average);

		System.out.println("The scores are:");
		for (int index = 0; index < numberUsed; index++){
			System.out.println(a[index] + " differs from average by " + (a[index] - average));
		}
	}


}
