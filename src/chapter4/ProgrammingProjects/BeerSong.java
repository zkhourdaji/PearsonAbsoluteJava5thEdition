package chapter4.programmingProjects;

public class BeerSong {

	private int bottlesOfBeerOnTheWall = 0;

	public BeerSong(int numberOfBeers) {

		if (numberOfBeers < 0)
			numberOfBeers = 0;

		else if (numberOfBeers > 99)
			numberOfBeers = 99;

		this.bottlesOfBeerOnTheWall = numberOfBeers;
	}

	public void printSong(){

		int i = this.bottlesOfBeerOnTheWall;

		while (i >= 0){
			
			if (i == 0){
				System.out.println( numberToEnglish(i) + " bottles of beer on the wall,");
				System.out.println( numberToEnglish(i) + " bottles of beer,");
			}
			else{
				System.out.println( numberToEnglish(i) + " bottles of beer on the wall,");
				System.out.println( numberToEnglish(i) + " bottles of beer,");
				System.out.println( "Take one down, pass it around,");
				System.out.println( numberToEnglish(i) + " bottles of beer on the wall,");
				System.out.println();
			}
			i--;

		}
	}

	private String numberToEnglish(int number){

		String returnedString = "";

		String zero = "Zero", 
				one = "One",
				two = "Two",
				three = "Three",
				four = "Four",
				five = "Five",
				six = "Six",
				seven = "Seven",
				eight = "Eight",
				nine = "Nine",
				ten = "Ten",
				twenty = "Twenty",
				thirty = "Thirty",
				fourty = "Fourty",
				fifty = "Fifty",
				sixty = "Sixty",
				seventy = "Seventy",
				eighty = "Eighty",
				ninty = "Ninty";

		if (number == 0)
			return zero;

		else if (number - 90 >= 0){
			returnedString += ninty;
			number -= 90;
		}
		else if (number - 80 >= 0){
			returnedString += eighty;
			number -= 80;
		}
		else if (number - 70 >= 0){
			returnedString += seventy;
			number -= 70;
		}
		else if (number - 60 >= 0){
			returnedString += sixty;
			number -= 60;
		}
		else if (number - 50 >= 0){
			returnedString += fifty;
			number -= 50;
		}
		else if (number - 40 >= 0){
			returnedString += fourty;
			number -= 40;
		}
		else if (number - 30 >= 0){
			returnedString += thirty;
			number -= 30;
		}
		else if (number - 20 >= 0){
			returnedString += twenty;
			number -= 20;
		}
		else if (number - 10 >= 0){
			returnedString += ten;
			number -= 10;
		}


		if (number - 9 >= 0){
			returnedString += nine;
			number -= 9;
		}
		else if (number - 8 >= 0){
			returnedString += eight;
			number -= 8;
		}
		else if (number - 7 >= 0){
			returnedString += seven;
			number -= 7;
		}
		else if (number - 6 >= 0){
			returnedString += six;
			number -= 6;
		}
		else if (number - 5 >= 0){
			returnedString += five;
			number -= 5;
		}
		else if (number - 4 >= 0){
			returnedString += four;
			number -= 4;
		}
		else if (number - 3 >= 0){
			returnedString += three;
			number -= 3;
		}
		else if (number - 2 >= 0){
			returnedString += two;
			number -= 2;
		}
		else if (number - 1 >= 0){
			returnedString += one;
			number -= 1;
		}



		return returnedString;

	}


}
