package chapter8.programmingProjects.movie;

public abstract class Movie {
	
	private String mpaaRating; //motin picture rating
	private int id;
	private String title;
	private final double lateFeePerDay = 2;

	public Movie(String movieName, String motionPictureRating, int id) {
		this.title = movieName;
		this.mpaaRating = motionPictureRating;
		this.id = id;
	}
	
	
	public abstract double calculateLateFees(int lateDaysNumber);
	
	@Override
	public boolean equals(Object obj) {
		
		if (obj == null)
			return false;
		else if (obj.getClass() != this.getClass())
			return false;
		else{
			Movie otherMovie = (Movie) obj;
			return (this.id == otherMovie.id);
		}
		
	}
	
	@Override
	public String toString() {
		return "Movie Title: " + this.title + ", Rating: " + this.mpaaRating;
	}
	
	
	
	public String getMpaaRating() {
		return mpaaRating;
	}
	public void setMpaaRating(String mpaaRating) {
		this.mpaaRating = mpaaRating;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	

}
