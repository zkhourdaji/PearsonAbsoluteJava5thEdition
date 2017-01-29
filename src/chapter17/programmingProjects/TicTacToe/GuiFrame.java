package chapter17.programmingProjects.TicTacToe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GuiFrame extends JFrame implements ActionListener{
	
	private JLabel display;
	private JButton[][] buttons;
	private TicTacToeLogic game;
	
	
	public GuiFrame() {
		
		this. game = new TicTacToeLogic();
		this.setTitle("Tic Tac Toe");
		this.setSize(400,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setLayout(new BorderLayout());
		display = new JLabel("Player1 turn ");
		
		Font bigFont = new Font("display font", Font.PLAIN, 35);
		display.setFont(bigFont);
		
		this.add(display, BorderLayout.NORTH);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(3,3));
		
		this.buttons = new JButton[3][3];
		
		for (int i = 0; i < this.buttons.length; i++){
			for (int j = 0; j < this.buttons.length; j++){
				this.buttons[i][j] = new JButton();
				this.buttons[i][j].setActionCommand(i + "" + j);
				this.buttons[i][j].addActionListener(this);
				this.buttons[i][j].setFont(bigFont);
				mainPanel.add(this.buttons[i][j]);
			}
		}
		
		this.add(mainPanel, BorderLayout.CENTER);
		
		this.setVisible(true);
		
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton buttonClicked = (JButton) e.getSource();
		
		if (game.isThereAWinner(this.buttons) 
				|| game.gameIsDraw(this.buttons)){
			return;
		}
	
		if (buttonClicked.getText() != ""){
			System.out.println("button already clicked: " + e.getActionCommand());
		}
		
		else{
			
			switch(game.getCurrentPlayer()){
			
			case ("Player1"):
				buttonClicked.setText("X");
				break;
			
			case ("Player2"):
				buttonClicked.setText("O");
				break;
			}
			
		}
		
		if (game.isThereAWinner(this.buttons)){
			this.display.setText(game.getCurrentPlayer() + " Wins");
		}
		else if (game.gameIsDraw(this.buttons)){
			this.display.setText("Game is Draw");
		}
		else{
			game.nextPlayerTurn();
			display.setText(game.getCurrentPlayer() + " turn");
		}
		
	}
	

}
