package chapter14;

import java.util.Scanner;

public class GenericPairDemo {
	
	public static void main(String[] args) {
		
		Pair<String> secretPair = new Pair<String>("Happy", "Day");
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter two words:");
		
		String word1 = keyboard.next();
		String word2 = keyboard.next();
		
		Pair<String> inputPair = new Pair<String>(word1, word2);
		
		if (inputPair.equals(secretPair)){
			System.out.println("you guessed the secret words");
			System.out.println("in the correct order!");
		}
		else{
			System.out.println("you guessed incorrectly");
			System.out.println("You guessed:");
			System.out.println(inputPair);
			System.out.println("the secret words are");
			System.out.println(secretPair);
		}
		
	}

}
