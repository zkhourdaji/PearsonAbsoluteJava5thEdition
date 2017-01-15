package chapter10.programmingProjects;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

public class DeleteExtraBlanks {

	public static void main(String[] args) {

		Scanner readFromFile = null;
		File temp = new File(generateRandomFileName());
		PrintWriter printWriter = null;
		File originalFile = new File("extraBlanks.txt");

		try {
			readFromFile = new Scanner(
					new FileInputStream(originalFile));

		} catch (FileNotFoundException e) {
			System.out.println("extraBlanks.txt: file not found exception");
		}

		while(temp.exists()){
			System.out.println(temp + " exists");
			System.out.println("creating another random file name");
			temp = new File(generateRandomFileName());
		}

		try{
			if (temp.createNewFile()){
				System.out.println("temp successfully created");
			}
		}
		catch(IOException e){
			System.out.println("Unable to create temp file: IO exception");

		}

		try {
			printWriter = new PrintWriter(
					new FileOutputStream(temp));
		} catch (FileNotFoundException e) {
			System.out.println("cant write to temp: file not found exception");
		}

		while (readFromFile.hasNextLine()){

			String line = readFromFile.nextLine();
			// if the line is empty then just ignore it
			if (!line.trim().isEmpty()){
				StringTokenizer st = new StringTokenizer(line);
				int numberOfTokens = st.countTokens();
				// prints the tokens to the temp file; this eliminates extra white space
				for (int i = 0; i < numberOfTokens; i++){
					printWriter.print(st.nextToken() + " ");
				}
				// this makes sure that tokens on seperate lines stay there
				// this prints an extra line at the end
				// which I will remove when copied back to original text file
				if (readFromFile.hasNextLine()){
					printWriter.print("\n");
				}
			}
		}


		printWriter.close();
		readFromFile.close();
		
		try {
			readFromFile = new Scanner(
					new FileInputStream(temp));
			printWriter = new PrintWriter(new FileOutputStream(originalFile));
		} catch (FileNotFoundException e) {
			System.out.println("cant read from temp or cant write to original"
					+ "; file not found exception");
		}
		
		while (readFromFile.hasNextLine()){
			String line = readFromFile.nextLine();
			
			if (!line.trim().isEmpty()){
				printWriter.print(line.trim() + "\n");
			}
			
		}
		
		printWriter.close();
		readFromFile.close();
		
		if (temp.delete()){
			System.out.println("delelted temp");
		}
		else{
			System.out.println("unable to delete temp");
		}

		//		for (int i = 0; i < 10; i++){
		//			System.out.println(generateRandomFileName());
		//		}

	}

	/*
	 * generate random file name consist of 10 random letters
	 */
	private static String generateRandomFileName(){

		Random r = new Random();
		String [] stringArray = new String[10];
		String returnedString = "";

		for (int i = 0; i < stringArray.length; i++){
			stringArray[i] = Character.toString((char) (r.nextInt(25) + 97));
			returnedString += stringArray[i];
		}

		return returnedString + ".txt";


	}

}
