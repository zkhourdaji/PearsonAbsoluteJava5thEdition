package chapter17.programmingProjects.TicTacToe;

import javax.swing.JButton;

public class TicTacToeLogic {

	private String currentPlayer;
	private final String PLAYER1 = "Player1", 
			PLAYER2 = "Player2";

	public TicTacToeLogic() {

		this.currentPlayer = PLAYER1;
	}


	public void nextPlayerTurn(){

		if (this.currentPlayer == this.PLAYER1){
			this.currentPlayer = this.PLAYER2;
		}
		else if (this.currentPlayer == this.PLAYER2){
			this.currentPlayer = this.PLAYER1;
		}
	}

	/*
	 * returns true if there is a winner,
	 * other wise return false
	 */
	public boolean isThereAWinner(JButton[][] buttons){

		for (int i = 0; i < buttons.length; i++){
			// check for horizantal wins

			if (// makes sure that the button is clicked
					!buttons[i][0].getText().equals("") &&
					buttons[i][0].getText().equals(buttons[i][1].getText()) 
					&& buttons[i][1].getText().equals(buttons[i][2].getText())){
				return true;

			}
		}

		for (int j = 0; j < buttons.length; j++){
			// check for vertical wins
			if (// makes sure that the button is clicked
					!buttons[0][j].getText().equals("")
					&&buttons[0][j].getText().equals(buttons[1][j].getText()) 
					&& buttons[1][j].getText().equals(buttons[2][j].getText())){
				return true;

			}
		}

		// check for diagonal win (from left to right)
		if (// makes sure that the button is clicked
				!buttons[0][0].getText().equals("")
				&&buttons[0][0].getText().equals(buttons[1][1].getText())
				&& buttons[1][1].getText().equals(buttons[2][2].getText())){
			return true;
		}

		// check for diagonal win (from right to left) 
		if (// makes sure that the button is clicked
				!buttons[0][2].getText().equals("")
				&&buttons[0][2].getText().equals(buttons[1][1].getText())
				&& buttons[1][1].getText().equals(buttons[2][0].getText())){
			return true;
		}

		// no one won yet
		return false;
	}

	/*
	 * Returns true if all the buttons are pressed
	 * and there is no winner.
	 * otherwise return false
	 */
	public boolean gameIsDraw(JButton[][] buttons){

		if (this.isThereAWinner(buttons)){
			return false;
		}

		else {

			for (int i = 0; i < buttons.length; i++){
				for (int j = 00; j < buttons.length; j++){

					/*
					 * this means there is more buttons to press
					 * so its not a draw
					 */
					if (buttons[i][j].getText().equals("")){
						return false;
					}
				}
			}
			// there is no more buttons to press
			return true;
		}


	}

	public String getCurrentPlayer() {
		return currentPlayer;
	}


}
