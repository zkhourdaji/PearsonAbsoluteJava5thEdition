package chapter6;

import java.util.Scanner;


public class GradeBook {

	private int numberOfStudents;
	private int numberOfQuizzes;

	private int [][] grade;
	private double [] studentAverage;
	private double [] quizAverage;

	public GradeBook(int [][] a) {

		if (a.length == 0 || a[0].length == 0){
			System.out.println("Empty grade records. Aborting");
			System.exit(0);
		}

		numberOfStudents = a.length;
		numberOfQuizzes = a[0].length;
		fillGrade(a);
		fillStudentAverage();
		fillQuizAverage();

	}

	public GradeBook(GradeBook book) {
		this.numberOfStudents = book.numberOfStudents;
		this.numberOfQuizzes = book.numberOfQuizzes;
		this.fillGrade(book.grade);
		this.fillStudentAverage();
		this.fillQuizAverage();;
	}

	public GradeBook() {

		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter number of students:");
		this.numberOfStudents = keyboard.nextInt();
		
		System.out.println("Enter number of quizzes:");
		this.numberOfQuizzes = keyboard.nextInt();
		
		grade = new int[numberOfStudents][numberOfQuizzes];
		
		for (int studentNumber = 1;  
				studentNumber <= this.numberOfStudents; studentNumber++) {
			for (int quizNumber = 1;
					quizNumber <= numberOfQuizzes; quizNumber++){
				System.out.println("Enter score for student number " + studentNumber);
				System.out.println("on quiz number " + quizNumber);
				grade[studentNumber - 1][quizNumber -1] = keyboard.nextInt();
			}
		}
		this.fillStudentAverage();
		this.fillQuizAverage();
	}

	private void fillQuizAverage() {
		
		this.quizAverage = new double[this.numberOfQuizzes];
		
		for (int quizNumber = 1; quizNumber <= numberOfQuizzes;
				quizNumber++){
			double sum = 0;
			for (int studentNumber = 1;
					studentNumber <= this.numberOfStudents; studentNumber++){
				sum = sum + grade[studentNumber - 1][quizNumber - 1];
			}
			quizAverage [quizNumber - 1] = sum / numberOfStudents;
		}
			

	}

	private void fillStudentAverage() {

		this.studentAverage = new double [numberOfStudents];
		
		for (int studentNumber = 1;
				studentNumber <= this.numberOfStudents; studentNumber++){
			double sum = 0;
			for (int quizNumber = 1;
					quizNumber <= this.numberOfQuizzes; quizNumber++){
				sum = sum + grade[studentNumber - 1][quizNumber - 1];
			}
				this.studentAverage[studentNumber - 1] = sum / numberOfQuizzes;
				
			
		}
	}

	private void fillGrade(int[][] a) {

		this.grade = new int[this.numberOfStudents][this.numberOfQuizzes];
		for (int studentNumber = 1;
				studentNumber <= numberOfStudents; studentNumber++){
			for (int quizNumber = 1;
					quizNumber <= numberOfQuizzes; quizNumber++){
				this.grade[studentNumber][quizNumber] = a[studentNumber][quizNumber];
			}
		}
	}
	
	public void display(){
		for (int studentNumber = 1;
				studentNumber <= this.numberOfStudents; studentNumber++){
			System.out.print("Student " + studentNumber + " Quizzes: ");
			
			for (int quizNumber = 1; quizNumber <= this.numberOfQuizzes; quizNumber++){
				System.out.print(grade[studentNumber - 1][quizNumber - 1] + " ");
				System.out.println(" Ave = " + studentAverage[studentNumber - 1]);
			}
			
			System.out.println("Quiz averages: ");
			for (int quizNumber = 1; quizNumber <= numberOfQuizzes; quizNumber++){
				System.out.println("Quiz " + quizNumber + " Ave = " + quizAverage[quizNumber - 1] + " ");
				
			}
			System.out.println();
		}
	}
	

}
