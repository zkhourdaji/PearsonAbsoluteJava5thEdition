package chapter4.ProgrammingProjects;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class BoxOfProduceMain {

	public static void main(String[] args) throws IOException {

		Scanner keyboard = new Scanner(System.in);
		BoxOfProduce box;
		boolean keepGoing = true;
		int boxNumber = 1;


		while (keepGoing){
			box = new BoxOfProduce();
			System.out.println("Box number " + boxNumber);
			System.out.println(box);
			box.askUser(keyboard);
			
			System.out.println("Type quit if you want to quit..");
			if (keyboard.next().equalsIgnoreCase("quit"))
				break;
			boxNumber++;
		}
	}
}
