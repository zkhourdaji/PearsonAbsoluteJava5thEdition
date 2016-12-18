package chapter6.ProgrammingProjects;

import java.util.Scanner;

public class Dive {

	private float difficulty; // from 1.2 to 3.8
	private float [] judgesScores = new float [7];
	private float finalScore;

	public Dive(float difficulty) {

		if (difficulty < 1.2 || difficulty > 3.8){
			System.out.println("Difficulty beyond range... Aborting");
			System.exit(0);
		}
		this.difficulty = difficulty;
		this.judgesScores();
	}

	
	public String toString() {
		
		String scores = "";
		
		for (int i = 0; i < judgesScores.length; i++){
			scores += "Judge number: " + (i + 1) + " score: " + judgesScores[i] + "\n";
		}
		return "Difficulty: " + this.difficulty + "\n" + scores;
	}
	
	public void display(){
		
		this.calculateFinalScore();
		System.out.println(this);
		System.out.println("Final score: " + this.finalScore);
		
	}
	

	private void judgesScores(){
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Input the scores for the 7 Judges. Scores must be between 0 and 10");
		
		for (int i = 0; i < 7; i++){
			
			do {
				System.out.println("Input a valid score for judge number " + (i + 1));
				this.judgesScores[i] = keyboard.nextFloat();
			} while (this.judgesScores[i] < 0 || this.judgesScores[i] > 10);
		}
		
	}
	
	private void calculateFinalScore(){
		
		float min, max, sum = 0;
		min = this.judgesScores[0];
		max = this.judgesScores[0];
		
		for (float i : judgesScores){
			if (i < min)
				min = i;
			if (i > max)
				max = i;
			
		}
		
		System.out.println("min " + min);
		System.out.println("Max " + max);
		
		for (float i : judgesScores){
			sum += i;
		}
		
		// get rid of the maximum and the minimum scores
		sum -= min;
		sum -= max;
		
		this.finalScore = (sum * this.difficulty) * 0.6f;
		System.out.println("sum: " + sum);
		
	}



}
