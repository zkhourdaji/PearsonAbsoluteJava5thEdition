package chapter10.programmingProjects;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Names {

	public static void main(String[] args) {

		Scanner boysFile = null, girlsFile = null;
		Scanner keyboard = new Scanner(System.in);
		String [] girlNames, boyNames;
		int [] numberOfGirlNamings, numberOfBoyNamings;

		try {
			boysFile = new Scanner(
					new FileInputStream("boynames.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("boy names: file not found exception");
		}

		try {
			girlsFile = new Scanner(
					new FileInputStream("girlnames.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("girl names: file not found exception");
		}

		boyNames = new String[1000];
		girlNames = new String[1000];
		numberOfBoyNamings = new int[1000];
		numberOfGirlNamings = new int[1000];

		for (int i = 0; i < boyNames.length; i++){
			boyNames[i] = boysFile.next();
			numberOfBoyNamings[i] = boysFile.nextInt();
		}

		for (int i = 0; i < girlNames.length; i++){
			girlNames[i] = girlsFile.next();
			numberOfGirlNamings[i] = girlsFile.nextInt();
		}

		System.out.println("input a name");
		String name = keyboard.next();
		System.out.println("you entered the name " + name);
		boolean boyNameFound = false, girlNameFound = false;

		
		for (int i = 0; i < girlNames.length; i++){
			if (girlNames[i].equalsIgnoreCase(name)){
				System.out.println(name + " is ranked " + (i+1) + " in popularity"
						+ " among girls with " + numberOfGirlNamings[i]);
				girlNameFound = true;
			}

		}
		if (!girlNameFound)
			System.out.println(name + " is not ranked among the top 1000 girl names");
		

		for (int i = 0; i < boyNames.length; i++){
			if (boyNames[i].equalsIgnoreCase(name)){
				System.out.println(name + " is ranked " + (i+1) + " in popularity"
						+ " among boys with " + numberOfBoyNamings[i]);
				boyNameFound = true;
			}
		}
		if (!boyNameFound)
			System.out.println(name + " is not ranked among the top 1000 boy names");
		
	}

}
