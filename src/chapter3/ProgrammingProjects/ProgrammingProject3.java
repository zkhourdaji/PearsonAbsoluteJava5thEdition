package chapter3.programmingProjects;

import java.util.Scanner;

public class ProgrammingProject3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		int motherHeight, fatherHeight;
		char genderOrExit = ' ';
		double childHeight = 0;
		
		while (true) {
			System.out.println("to exit type 'exit'.");
			System.out.println("Input 'f' for female, and 'm' for male.");
			genderOrExit = keyboard.next().toLowerCase().charAt(0);
			
			if (genderOrExit == 'e'){
				keyboard.close();
				System.exit(0);
			}
			
			System.out.println("Input values as feet and inches.");
			System.out.println("What is the height of the mother?");
			motherHeight = (keyboard.nextInt() * 12) + keyboard.nextInt();
			System.out.println("What is the height of the father?");
			fatherHeight = (keyboard.nextInt() * 12) + keyboard.nextInt();
			
			if (genderOrExit == 'm')
				childHeight = ((motherHeight * 13/12) + fatherHeight) / 2;
			else if (genderOrExit == 'f')
				childHeight = ((fatherHeight * 12/13) + motherHeight) / 2;
			
			System.out.println(childHeight);
			System.out.println(childHeight / 12);
			System.out.println(childHeight % 12);
			System.out.println("child height is " + childHeight / 12 + " " + childHeight % 12);
			
		}
	}

}
