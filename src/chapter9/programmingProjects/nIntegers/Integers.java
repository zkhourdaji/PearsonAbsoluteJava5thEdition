package chapter9.programmingProjects.nIntegers;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Integers {

	private int[] numbers;
	private double average;

	public Integers(int numberOfIntegers) throws NegativeNumberException {

		if (numberOfIntegers < 0){
			throw new NegativeNumberException("N must be positive");
		}
		this.numbers = new int[numberOfIntegers];
	}

	public void display(){

		System.out.print("Numbers are: ");
		for (int i = 0; i < this.numbers.length; i++){
			// printing the last number without a comma
			if (i == this.numbers.length - 1)
				System.out.print(this.numbers[i]);
			else
				System.out.print(this.numbers[i] + ", ");
		}
		System.out.println();
		System.out.println("Average is " + this.average);
	}

	private void calculateAverage(){

		int sum  = 0;

		for (int i = 0; i < this.numbers.length; i++){
			sum += this.numbers[i];
		}

		this.average = ((double) sum) / this.numbers.length;
	}


	public void enterNumbers(){

		Scanner keyboard = new Scanner(System.in);
		boolean done = false;

		System.out.println("enter " + this.numbers.length + " numbers");

		for (int i = 0; i < this.numbers.length; i++){

			while(!done){

				try{
					int number = keyboard.nextInt();
					this.numbers[i] = number;
					System.out.println("you entered " + number);
					done = true;

				} catch(InputMismatchException e){
					keyboard.nextLine();
					System.out.println("Thats not a number, please try again");
				}

			}
			done = false;

		}
		this.calculateAverage();

	}


}
