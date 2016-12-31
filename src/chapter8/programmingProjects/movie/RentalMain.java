package chapter8.programmingProjects.movie;

import java.util.Random;

public class RentalMain {

	public static void main(String[] args) {

		int numberOfMovies = 10;

		Rental[] rentalsArray = new Rental[numberOfMovies];
		
		Movie[] movieArray = new Movie[numberOfMovies];
		String[] movieNames = new String[numberOfMovies];
		String[] ratings = {"G", "PG", "PG-13", "R", "NC-17"};
		Random r = new Random();
		int daysLate;
		double fee;
		
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

		for (int i = 0; i < rentalsArray.length; i++){
		
			switch(r.nextInt(3)){

			case 0:
				rentalsArray[i] = new Rental(new Drama(movieNames[i], ratings[r.nextInt(4)], i), 
						r.nextInt(10) + 1, r.nextInt(50));
				break;

			case 1:
				rentalsArray[i] = new Rental(new Comedy(movieNames[i], ratings[r.nextInt(4)], i), 
						r.nextInt(10) + 1, r.nextInt(50));				break;

			case 2:
				rentalsArray[i] = new Rental(new Action(movieNames[i], ratings[r.nextInt(4)], i), 
						r.nextInt(10) + 1, r.nextInt(50));				break;
			}
			
			System.out.println(rentalsArray[i]);
			System.out.println("-----------------------------------------------");
			
		}

		
	}
}
