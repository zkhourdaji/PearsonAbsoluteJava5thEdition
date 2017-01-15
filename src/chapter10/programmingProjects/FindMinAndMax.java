package chapter10.programmingProjects;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FindMinAndMax {

	public static void main(String[] args) {


		Scanner readFromFile = null;
		int min, max = 0;

		try {
			readFromFile = new Scanner(
					new FileInputStream(
							new File("random1000Numbers.txt")));

		} catch (FileNotFoundException e) {
			System.out.println("random1000Numbers.txt: file not found exception");
		}

		int firstNumber = readFromFile.nextInt();
		min = firstNumber;
		min = firstNumber;

		while(readFromFile.hasNextInt()){
			int number = readFromFile.nextInt();

			if (number > max){
				max = number;
			}
			if (number < min){
				min = number;
			}

		}

		readFromFile.close();

		System.out.println("the smallest number is " + min);
		System.out.println("the largest number is " + max);
	}
}
