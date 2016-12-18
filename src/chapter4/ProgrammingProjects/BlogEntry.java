package chapter4.ProgrammingProjects;

import java.util.StringTokenizer;

import chapter4.Date;

public class BlogEntry {

	private String username = "";
	private String text = "";
	private Date  date = null;


	public BlogEntry(String username, String text, Date date) {

		this.username = username;
		this.text = text;
		this.date = date;
	}


	// pre-condition: all instance variables are defined

	public void displayEntry(){
		System.out.println("Username: " + this.username);
		System.out.println("Date: " + this.date);
		System.out.println(this.text);
		System.out.println();

	}

	// returns the first 10 words from the text
	// or the entire text if less than 10 words
	public String getSummary(){

		StringTokenizer textTokenizer = new StringTokenizer(this.text);
		String firstTenWords = "";
		
		if (textTokenizer.countTokens() < 10){
			displayEntry();
		}
		else {
			System.out.println("Username: " + this.username);
			System.out.println("Date: " + this.date);
			
			for (int i = 0; i < 10; i++){
				firstTenWords += textTokenizer.nextToken() + " ";
			}
		}
		return firstTenWords;

	}


}
