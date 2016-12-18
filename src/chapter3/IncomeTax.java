package chapter3;

import java.util.Scanner;

public class IncomeTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		double netIncome, tax, fivePercentTax, tenPercentTax;
		
		System.out.println("Enter net income. \n" + "Do not include a dollar sign or any commas.");
		netIncome = keyboard.nextDouble();
		
		if (netIncome <= 15000) {
			tax = 0;
		} 
		else if ((netIncome > 15000) && (netIncome <= 30000)) {
			// tax = 5% of amount over $15k
			tax = (0.05 * (netIncome - 15000));
		}else { // netIncome > $30k
			// fiverPercentTax = 5% of income from $15k to $30k
			fivePercentTax = 0.05 * 15000;
			// tenPercentTax = 10% of income above $30k
			tenPercentTax = 0.10 * (netIncome - 30000);
			tax = (fivePercentTax + tenPercentTax);
		}
		
		System.out.printf("Tax due = $%.2f", tax);

	}

}
