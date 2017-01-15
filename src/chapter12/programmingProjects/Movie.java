package chapter12.programmingProjects;

public class Movie {
	
	private String title;
	//private int minutes;   // unused (maybe a type)
	private int year;
	protected double price;
	
	
	public static void main(String[] args) {
		
		Movie movie1 = new Movie("Silicon Valley", 2012, 30);
		Movie movie2 = new Movie("Titanic", 1995, 10);
		Movie movie3 = new Movie("Angry Birds", 2014, 15);
		
		movie1.printDescription();
		movie2.printDescription();
		movie3.printDescription();
	}
	
	public Movie(String title, int year, double price) {
		this.title = title;
		this.year = year;
		this.price = price;
		
	}
	
	
	public String getTitle(){
		return this.title;
	}
	
	public void setTitle(String title){
		this.title = title;
	}
	
	public void printDescription(){
		System.out.println(this);
	}
	
	
	@Override
	public String toString() {
		return ("Movie Title: " + this.title + "\n"
				+ "Year Released: " + this.year + "\n"
				+ "Price: $" + this.price + "\n");
	}

}
