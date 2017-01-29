package chapter17.programmingProjects.pigLatin;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class PigLatinGUI extends JFrame 
implements ActionListener {

	public final int WIDTH = 750;
	public final int HEIGHT = 300;
	public final int NUMBER_OF_DIGITS = 30;

	private JTextArea inputTextArea;
	private JTextArea outputTextArea;
	private JButton submit;
	
	public PigLatinGUI() {

		this.setTitle("Pig Latin");
		this.setSize(WIDTH, HEIGHT);
		this.setLayout(new FlowLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.setResizable(false);

		this.inputTextArea = new JTextArea("Input words here", 10, 25);
		this.inputTextArea.setLineWrap(true);
		
		this.outputTextArea = new JTextArea(10,25);
		this.outputTextArea.setEditable(false);
		this.outputTextArea.setLineWrap(true);

		this.submit = new JButton("Submit");
		this.submit.addActionListener(this);
		
		this.add(this.inputTextArea);
		this.add(this.submit);
		this.add(this.outputTextArea);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		

		if (e.getActionCommand().equals("Submit")){
			
			// clears the output text area first
			this.outputTextArea.setText("");
			
			System.out.println("button clicked");
			StringTokenizer input = new StringTokenizer(
					this.inputTextArea.getText());
			
			ArrayList<Word> words = new ArrayList<Word>();
			
			while (input.hasMoreTokens()){
				
				try {
					words.add(new Word(input.nextToken()));
				} catch (BadWordException e1) {
					System.out.println(e1.getMessage());
				}
			}
			
			for (int i = 0; i < words.size(); i++){
				this.outputTextArea.setText(this.outputTextArea.getText() 
						+ words.get(i).translteToPigLatin() + " ");
			}
			
		}
		
	}


}
