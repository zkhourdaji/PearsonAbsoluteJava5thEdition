package chapter6.programmingProjects;

import java.util.Random;
import java.util.Scanner;

/**
 * This class represents a memory game.
 * 
 * A memory game is a card game, which a set of duplicate cards are laid
 * face down and two cards are flipped face up each turn.
 * If they match, they stay face up, if they don't they go back face down.
 * 
 * The objective of the game is to flip all cards face up by finding their matches.
 * 
 * You start the game by simply creating an object of this class,
 * and calling the method startGame();
 * 
 * The cards will be displayed in the console. The "*" represents a face down card.
 * The user inputs two sets of coordinates for the two cards to flip face up.
 * The cards are then flipped, if they match they stay face up. 
 * If the cards don't match, they go back face down.
 * 
 * @author ZaferSamir
 *
 */

public class MemoryGame {


	private Card cards[][];


	/**
	 * Creates a 4 by 4 card arrangement.
	 */
	public MemoryGame() {
		this.cards = new Card[4][4];
	}

	/**
	 * Shuffles the cards on the arrangement, 
	 * by selecting two cards and swapping their positions repeatedly.
	 */
	private void shuffle() {

		Random r = new Random();

		// shuffles them 10 times
		for (int i = 0; i < 100; i++){

			// pick random coordinates
			int r1 = r.nextInt(4);
			int r2 = r.nextInt(4);
			int r3 = r.nextInt(4);
			int r4 = r.nextInt(4);

			// selects two cards from the 2D array.
			Card card1 = this.cards[r1][r2];
			Card card2 = this.cards[r3][r4];

			// swap their positions.
			this.cards[r1][r2] = card2;
			this.cards[r3][r4] = card1;

		}

	}

	/**
	 * Display the 4 by 4 card arrangement, with the selected cards face up.
	 * 
	 * -If they coordinates are all 0, the card arrangement 
	 * is displayed with all the cards face down.
	 * 
	 * -If both coordinates represent the same card they print a message to the user
	 * asking to input two different sets of coordinates.
	 * 
	 * @param x1 First card's X coordinate
	 * @param y1 First card's Y coordinate
	 * @param x2 Second card's X coordinate
	 * @param y2 Second card's Y coordinate
	 */
	private void display(int x1, int y1, int x2, int y2) {

		if (x1 == x2 && y1 == y2 && x1 != 0){
			System.out.println("You can not pick one card.");
			System.out.println("Please input two different coordinate set to flip two cards");
			return;
		}


		// formatting
		System.out.println("   1  2  3  4");
		System.out.println("  ------------");


		for (int i = 0; i < cards.length; i++){
			for (int j = 0; j < cards.length; j++){
				if (j == 0)
					System.out.print((i + 1) + "|");
				if (this.cards[i][j].isFaceUp())
					System.out.print(" " + this.cards[i][j] + " ");
				else if (x1 - 1 == j && y1 - 1 == i)
					System.out.print(" " + this.cards[i][j] + " ");
				else if (x2 - 1 == j && y2 - 1 == i)
					System.out.print(" " + this.cards[i][j] + " ");
				else //(x == 0 && y == 0)
					System.out.print( " * " );

			}

			// formatting
			if (i < 3)
				System.out.println("\n |");
			else
				System.out.println("\n");
		}

	}

	/**
	 * Creates a total of 8 pairs of cards.
	 */
	private void createCards(){

		int cardNumber = 1;

		for (int i = 0; i < cards.length; i++){
			for (int j = 0; j < cards.length; j++){
				this.cards[i][j] = new Card(cardNumber);
				cardNumber++;
				if (cardNumber >= 9)
					cardNumber = 1;
			}
		}

	}

	/**
	 * Starts the game by displaying the card arrangement, 
	 * then asking the user to input the coordinates of the cards they would like flipped up.
	 * 
	 */
	public void startGame(){

		Scanner keyboard = new Scanner(System.in);
		this.createCards();
		this.shuffle();
		this.display(0, 0, 0, 0);

		while (true){

			// get valid user input
			int[] userInput = this.inputTwoCoordinates();
			
			int x1 = userInput[0];
			int y1 = userInput[1];
			int x2 = userInput[2];
			int y2 = userInput[3];

			/*
			 * if the user selected either one or both cards which are already face up,
			 * a message will let the user know. And the game will ask the user for new input
			 */
			if (this.cards[y1 - 1][x1 - 1].isFaceUp() 
					|| this.cards[y2 - 1][x2 - 1].isFaceUp()){
				System.out.println("Card(s) is already face up...");
				continue;
			}

			// display the arrangement with the selected cards face up
			this.display(x1, y1, x2, y2);

			/*
			 * Flip and keep the cards face up only if the number of both 
			 * cards are equal AND they're not the same card
			 */
			if (this.cards[y1 - 1][x1 - 1].equals(this.cards[y2 - 1][x2 - 1])
					&& this.cards[y1 - 1][x1 - 1] != this.cards[y2 - 1][x2 - 1]){


				this.cards[y1 - 1][x1 - 1].turnFaceUp();
				this.cards[y2 - 1][x2 - 1].turnFaceUp();
				System.out.println("You found a match!");

			}

			// check if the user win
			if (this.youWin()){
				System.out.println("YOU WIN!");
				System.exit(0);
			}


		}

	}

	/**
	 * Ask the user to input two coordinates (four number)
	 * x1, y1, x2, y2.
	 * 
	 * If the user input invalid numbers, the game will print a message.
	 * and ask for valid input.
	 * 
	 * valid input must be from 1 to 4.
	 * 
	 * @return return an array of integers containing the coordinates.
	 */
	private int[] inputTwoCoordinates() {

		Scanner keyboard = new Scanner(System.in);

		while (true){

			System.out.println("Input a valid x1 and y1, x2 and y2");
			System.out.println("Must be beteween 1 and " + this.cards.length);
			int x1 = keyboard.nextInt();
			int y1 = keyboard.nextInt();
			int x2 = keyboard.nextInt();
			int y2 = keyboard.nextInt();

			if (x1 < 5 && x1> 0
					&& y1 < 5 && y1 > 0
					&& x2 < 5 && x2 > 0
					&& y2 < 5 && y2 >0){
				
				int[] userInput = new int[4];
				userInput[0] = x1;
				userInput[1] = y1;
				userInput[2] = x2;
				userInput[3] = y2;
				
				return userInput;
				
			}
			else
				System.out.println("INVALID INPUT");
			

		}

	}

	/**
	 * The user win when all the cards are face up.
	 * 
	 * @return true if the user wins, false otherwise.
	 */
	private boolean youWin(){

		int faceUpCards = 0;

		for (int i = 0; i < this.cards.length; i++){
			for (int j = 0; j < this.cards.length; j++){
				if (this.cards[i][j].isFaceUp())
					faceUpCards++;
			}
		}
		if (faceUpCards == this.cards.length * 4){
			return true;
		}
		return false;
	}

}

