package chapter2.ProgrammingProjects;

import java.util.Scanner;

public class ProgrammingProject4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int miles, milesPerGallon;
		double gasPrice, costToTravel;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("How many miles do you want to travel?");
		miles = keyboard.nextInt();
		System.out.println("Input miles per gallon rate of fuel consumption: ");
		milesPerGallon = keyboard.nextInt();
		System.out.println("How much does a gallon of gas cost?");
		gasPrice = keyboard.nextDouble();
		
		costToTravel = miles * (gasPrice / milesPerGallon );
		System.out.println("Your cost to travel is " + costToTravel);
		
		

	}

}
