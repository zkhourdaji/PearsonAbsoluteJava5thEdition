package chapter2;

import java.io.FileInputStream;
import java.util.Scanner;

public class TextFileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner fileIn = null;
		
		try {
			// Attempt to open the file
			fileIn = new Scanner(
					new FileInputStream("player.txt"));
			
		} catch (Exception e) {
			// TODO: handle exception
			
			System.out.println("File not found.");
			System.exit(0);
		}

		int highscore;
		String name;
		
		System.out.println("Text left to read? " + fileIn.hasNextLine());
		highscore = fileIn.nextInt();
		fileIn.nextLine();
		name = fileIn.nextLine();
		
		System.out.println("Name : " + name);
		System.out.println("Highscore: " + highscore);
		System.out.println("Text left to read? " + fileIn.hasNextLine());
		
		fileIn.close();
	}

}
