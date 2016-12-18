package chapter4.ProgrammingProjects;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class BoxOfProduce {


	private static int salsaVerdeFlyersRemaining = 5;

	private boolean containsSalsaVergeFlyer = false;

	private String bundle1, bundle2, bundle3;
	// works for java 8, doesnt seem to work for java 7
	List<String> lines = Files.readAllLines(
			Paths.get("src/chapter4/ProgrammingProjects/fruits"));

	public BoxOfProduce() throws IOException {

		this.setRandomBundles();
	}


	private void setRandomBundles() throws IOException{

		Random random = new Random();

		this.setBundle1(lines.get( random.nextInt(5) ));
		this.setBundle2(lines.get( random.nextInt(5) ));
		this.setBundle3(lines.get( random.nextInt(5) ));		
	}

	private void checkForFreeFlyer(){
		if ((bundle1.equals("Tomatillo")
				|| bundle2.equals("Tomatillo")
				|| bundle3.equals("Tomatillo") ) 
				&& BoxOfProduce.salsaVerdeFlyersRemaining > 0){
			BoxOfProduce.salsaVerdeFlyersRemaining--;
			this.containsSalsaVergeFlyer = true;
		}

	}

	private void substitude(int bundleNumber){

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Which one would you like to substitude it with?");
		System.out.println("type a number...");
		System.out.println(lines);

		int fruitWanted = keyboard.nextInt() - 1;

		if (bundleNumber == 1)
			this.setBundle1(lines.get(fruitWanted));
		else if (bundleNumber == 2)
			this.setBundle2(lines.get(fruitWanted));
		else if (bundleNumber == 3)
			this.setBundle3(lines.get(fruitWanted));
		System.out.println("New Box");




	}

	public void askUser(Scanner keyboard){

		boolean bundleIsGood = false;

		do {
			System.out.println("Would you like to substitude any of the bundle fruits?");
			String answer = keyboard.next();
			if (answer.equalsIgnoreCase("yes")){
				System.out.println("Which bundle number would you like to change? 1, 2 or 3 ?");
				int substitudeBundle = keyboard.nextInt();
				if (substitudeBundle <= 3 && substitudeBundle >= 0){
					this.substitude(substitudeBundle);
					System.out.println(this);
				}
				else
					System.out.println("invalid number. Must be between 1 and 3.");

			}
			else if (answer.equalsIgnoreCase("no")){

				System.out.println("Okay. Bundles are not changed.");
				bundleIsGood = true;
			}

		} while (!bundleIsGood);
		this.checkForFreeFlyer();

		System.out.println(this);
		//keyboard.close();

	}

	public String toString() {
		if (this.containsSalsaVergeFlyer){
			return "Bundle1: " + this.bundle1 + "\n"
					+ "Bundle2: " + this.bundle2 + "\n"
					+ "Bundle3: " + this.bundle3 + "\n"
					+ "Salsa Verde Recipe! \n";
		}
		else
			return "Bundle1: " + this.bundle1 + "\n"
			+ "Bundle2: " + this.bundle2 + "\n"
			+ "Bundle3: " + this.bundle3 + "\n";


	}


	public String getBundle1() {
		return bundle1;
	}


	public void setBundle1(String bundle1) {
		this.bundle1 = bundle1;
	}


	public String getBundle2() {
		return bundle2;
	}


	public void setBundle2(String bundle2) {
		this.bundle2 = bundle2;
	}


	public String getBundle3() {
		return bundle3;
	}


	public void setBundle3(String bundle3) {
		this.bundle3 = bundle3;
	}
}
