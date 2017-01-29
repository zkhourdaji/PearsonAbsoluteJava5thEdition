package chapter14.programmingProjects;

import java.util.ArrayList;
import java.util.Scanner;

public class Diving {
	
	public static void main(String[] args) {
		
		double difficulty; // between 1.2 to 3.8
		double finalScore;
		final int numberOfJudges = 7;
		
		ArrayList<Double> scores = new ArrayList<Double>();
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Input a degree of difficulty, "
				+ "must be between 1.2 to 3.8");
		difficulty = keyboard.nextDouble();
		
		if (difficulty < 1.2 || difficulty > 3.8){
			System.out.println("Invalid difficulty.. Aborting");
			System.exit(1);
		}
		
		System.out.println("Input the 7 judges scores when prompted");
		
		for (int i = 0; i < numberOfJudges; i++){
			System.out.println("Input the score from judge number " + (i + 1));
			scores.add(keyboard.nextDouble());
		}
		
		System.out.println("Scores inputted are: ");
		for (Double d : scores){
			System.out.print(d.toString() + ", ");
		}
		System.out.println();
		
		double min = scores.get(0), max = scores.get(0);
		
		for (Double d : scores){
			
			if (d < min){
				min = d;
			}
			else if (d > max){
				max = d;
			}
		}
		
		scores.remove(scores.indexOf(min));
		scores.remove(scores.indexOf(max));
		
		System.out.println("Removed : " + min + " and " + max);
		
		for (Double d : scores){
			System.out.print(d.toString() + ", ");
		}
		System.out.println();
		
		double addedScores = 0;
		
		for (Double d : scores){
			addedScores += d;
		}
		
		finalScore = addedScores * difficulty * 0.6;
		
		System.out.println("Final score is : " + finalScore);
		
	}

}
