package chapter2.programmingProjects;

import java.util.Scanner;

public class ProgrammingProject3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int firstNumber, secondNumber;
		int sum, product, difference;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter two integers: ");
		firstNumber = keyboard.nextInt();
		secondNumber = keyboard.nextInt();
		
		sum = firstNumber + secondNumber;
		product = firstNumber * secondNumber;
		difference = firstNumber - secondNumber;
		
		System.out.println("You entered the numbers " + firstNumber + " and " + secondNumber);
		System.out.println(firstNumber + " + " + secondNumber + " = " + sum);
		System.out.println(firstNumber + " * " + secondNumber + " = " + product);
		System.out.println(firstNumber + " - " + secondNumber + " = " + difference);
		
		keyboard.close();
		
	}

}
