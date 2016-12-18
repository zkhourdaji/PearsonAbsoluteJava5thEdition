package chapter5.ProgrammingProjects;

import java.util.Scanner;

public class FractionMain {

	public static void main(String[] args) {
		
		boolean keepGoing = true;
		Scanner keyboard = new Scanner(System.in);
		int numerator, denomenator;
		String fractionString;
		Fraction fraction1;
		
		System.out.println("type a fraction i.e. 1/2");
		fractionString = keyboard.nextLine();
		System.out.println(fractionString);
		
		fraction1 = new Fraction(Integer.parseInt(fractionString.split("/")[0]),
				Integer.parseInt(fractionString.split("/")[1]));
		
		while (keepGoing){
			Fraction fraction2;
			
			System.out.println("Type a fraction or type quit");
			String answer = keyboard.nextLine();
			if (answer.equalsIgnoreCase("quit"))
				break;
			else{
				fraction2 = new Fraction(Integer.parseInt(answer.split("/")[0]),
						Integer.parseInt(answer.split("/")[1]));
			}
			
			if (fraction1.equals(fraction2))
				System.out.println("Both fractions are equal");
			else
				System.out.println("they are not equal");
				
				
				
		}
		
	
	}
}
