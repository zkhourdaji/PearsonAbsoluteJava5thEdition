package chapter8.programmingProjects.movie;

public class Comedy extends Movie {

	private final double lateFeePerDay = 2.5;
	
	public Comedy(String movieName, String motionPictureRating, int id) {
		super(movieName, motionPictureRating, id);
	}
	
	
	@Override
	public String toString() {
		return super.toString() + ", Genre: " + "Comedy";
	}
	
	
	@Override
	public double calculateLateFees(int numberOfDays) {
		return (this.lateFeePerDay * numberOfDays);
		
	}

}
