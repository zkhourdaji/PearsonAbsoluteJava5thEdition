package chapter9.programmingProjects.nIntegers;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Integers numbers = null;
		Scanner keyboard = new Scanner(System.in);
		boolean done = false;
		
		System.out.println("Input the number of integers");

		// get the number of integers
		while(!done){
			
			try {
				numbers = new Integers(keyboard.nextInt());
				done = true;
			
			} catch (NegativeNumberException e) {
				System.out.println("Must be a positive number. Please try again");
			} catch(InputMismatchException e){
				keyboard.nextLine();
				System.out.println("Thats not a number, please try again");
			}
		}
		
		numbers.enterNumbers();
		numbers.display();
	}

}
