package chapter8.programmingProjects.movie;

import java.util.Random;

public class MovieMain {

	public static void main(String[] args) {

		int numberOfMovies = 10;

		Movie[] movieArray = new Movie[numberOfMovies];
		String[] movieNames = new String[numberOfMovies];
		String[] ratings = {"G", "PG", "PG-13", "R", "NC-17"};
		movieNames[0] = "Marvin's Room";
		movieNames[1] = "Tucker and Dale vs Evil";
		movieNames[2] = "Quills";
		movieNames[3] = "The Man from Earth";
		movieNames[4] = "The Quest";
		movieNames[5] = "The Nine Lives of Fritz the Cat";
		movieNames[6] = "Airport";
		movieNames[7] = "Paper Man";
		movieNames[8] = "Atlas Shrugged: Part I";
		movieNames[9] = "Jeff, Who Lives at Home";



		Random r = new Random();
		int daysLate;
		double fee;
		
		for (int i = 0; i < movieArray.length; i++){

			switch(r.nextInt(3)){

			case 0:
				movieArray[i] = new Drama(movieNames[i], ratings[r.nextInt(4)], r.nextInt(5) + 1);
				break;

			case 1:
				movieArray[i] = new Comedy(movieNames[i], ratings[r.nextInt(4)], r.nextInt(5) + 1);
				break;

			case 2:
				movieArray[i] = new Action(movieNames[i], ratings[r.nextInt(4)], r.nextInt(5) + 1);
				break;
			}
			
			System.out.println(movieArray[i]);
			daysLate = r.nextInt(101);
			fee = movieArray[i].calculateLateFees(daysLate);
			System.out.println("you are " + daysLate + " days late," + "late fee is " + fee);
			System.out.println("-------------------------------------------------");
		}
		
	

	}

}
