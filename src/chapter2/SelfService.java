package chapter2;

import java.util.Scanner;

public class SelfService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard=  new Scanner(System.in);
		
		System.out.println("Enter a number of items purchased");
		System.out.println("followed by the cost of one item.");
		System.out.println("Do not use a dollar sign.");
		
		int count = keyboard.nextInt();
		double price = keyboard.nextDouble();
		double total = count * price;
		
		System.out.printf("%d items at $%.2f eaceh .%n", count, price);
		System.out.printf("Total amount due $%.2f%n", total);
		
		System.out.println("Please take your merchandise.");
		System.out.printf("Place $%.2f in an envelope %n", total);
		System.out.println("and slide it under the office door.");
		System.out.println("Thank you for using the self-service line");
		
		
		keyboard.close();
	}

}
