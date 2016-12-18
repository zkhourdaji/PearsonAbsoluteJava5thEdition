package chapter4.ProgrammingProjects;

import java.util.Scanner;

public class StudentRecord {

	private double quiz1, quiz2, quiz3;
	private double midtermExam;
	private double finalExam;
	private double overallScore;
	private char gradeLetter;



	private void calculateGrade(){
		double quizesTotal = quiz1 + quiz2 + quiz3;
		double quizesPercentageScore = quizesTotal * 25 / 30;
		double midTermPercentageScore = this.midtermExam * 35 / 100;
		double finalExamPercentageScore = this.finalExam * 40 / 100;

		this.overallScore  = quizesPercentageScore 
				+ midTermPercentageScore 
				+ finalExamPercentageScore;

		if (this.overallScore >= 90)
			this.gradeLetter = 'A';
		else if (this.overallScore >= 80)
			this.gradeLetter = 'B';
		else if (this.overallScore >= 70)
			this.gradeLetter = 'C';
		else if (this.overallScore >= 60)
			this.gradeLetter = 'D';
		else if (this.overallScore < 60)
			this.gradeLetter = 'F';
		else
			this.gradeLetter = 'X';

		System.out.println("Score calculated...");

	}
	
	public void inputScores(){

		Scanner keyboard = new Scanner(System.in);
		boolean quizesOkay = false;
		double q1, q2, q3, midterm, finalExam;

		while (!quizesOkay){

			System.out.println("Input your first, second, third quiz, midterm exam and final exam.");
			System.out.println("Seperate them by a space, or a new line.");
			try {
				q1 = keyboard.nextDouble();
				q2 = keyboard.nextDouble();
				q3 = keyboard.nextDouble();
				midterm = keyboard.nextDouble();
				finalExam = keyboard.nextDouble();

			} catch (Exception e) {
				System.out.println("Invalid Input, Try again");
				keyboard.nextLine();
				continue;
			}
			if (quizOkay(q1) && quizOkay(q2) && quizOkay(q3)
					&& examOkay(midterm) && examOkay(finalExam)){
				this.quiz1 = q1;
				this.quiz2 = q2;
				this.quiz3 = q3;
				this.midtermExam = midterm;
				this.finalExam = finalExam;
				quizesOkay = true;
			}
			else{
				System.out.println("Invalid Scores. Please try again.");
			}
		}

		keyboard.close();
		calculateGrade();

	}



	private boolean examOkay(double score){
		if (score >= 0 && score <= 100)
			return true;
		else 
			return false;
	}
	private boolean quizOkay(double score){
		if (score >= 0 && score <= 10)
			return true;
		else 
			return false;

	}

	public boolean equals(StudentRecord otherStudentRecord) {
		return( this.overallScore == otherStudentRecord.overallScore );

	}


	public String toString() {

		return "Quiz1: " + this.quiz1 + "\n"
				+ "Quiz2: " + this.quiz2 + "\n"
				+ "Quiz3: " + this.quiz3 + "\n"
				+ "Midterm Exam: " + this.midtermExam + "\n"
				+ "Final Exam: " + this.finalExam + "\n\n"
				+ "Overall Score: " + this.overallScore +"\n"
				+ "Final Grade: " + this.gradeLetter;
	}

}
