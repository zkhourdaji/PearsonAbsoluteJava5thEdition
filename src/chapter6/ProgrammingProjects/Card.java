package chapter6.ProgrammingProjects;

/**
 * This class represent a single Card.
 * A Card has two properties. Its number, and status (whether its face up or down).
 * 
 * @author ZaferSamir
 *
 */
public class Card {

	
	private int numberOfCard;
	private boolean faceUp = false;
	
	
	/**
	 * This constructor takes in an integer, 
	 * and set it to the number of the card.
	 * 
	 * @param number Card number
	 */
	public Card(int number) {

		this.numberOfCard = number;
	}
	
	/**
	 * Copy constructor. Takes in another object of type Card,
	 * and set the card number and the status 
	 * to the original object number and status.
	 * 
	 * @param original Card object to copy
	 */
	
	public Card(Card original) {
		this.numberOfCard = original.numberOfCard;
		this.faceUp = original.faceUp;
		
	}
	
	/**
	 * 
	 * @return return true if the card is face up
	 */
	public boolean isFaceUp(){
		return this.faceUp;
	}
	
	public boolean isFaceDown(){
		return !this.faceUp;
	}
	
	/**
	 * Turn the card face down.
	 */
	
	public void turnFaceDown(){
		this.faceUp = false;
	}
	
	/**
	 * Turn the card face up.
	 */
	public void turnFaceUp(){
		this.faceUp = true;
	}
	
	
	/**
	 * print out the number of the card as a string.
	 */
	public String toString() {
		return this.numberOfCard + "";
	}
	
	
	/**
	 * 
	 * @return the number of the card as an integer
	 */
	public int getCardNumber(){
		return this.numberOfCard;
	}
	
	/**
	 * Note that two cards are equal only if they match the card number,
	 * regardless of their status (face up or face down)
	 * 
	 * @param otherCard Card object to check for equality to.
	 * 
	 * @return return true if the two card are equal, otherwise return false.
	 */
	public boolean equals(Card otherCard) {
		
		return this.numberOfCard == otherCard.numberOfCard;
	}
	
	
}
