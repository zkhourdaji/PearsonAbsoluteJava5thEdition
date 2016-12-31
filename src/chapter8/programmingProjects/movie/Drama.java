package chapter8.programmingProjects.movie;

public class Drama extends Movie {

	public Drama(String movieName, String motionPictureRating, int id) {
		super(movieName, motionPictureRating, id);
	}

	private final double lateFeePerDay = 2;
	
	
	
	@Override
	public String toString() {
		return super.toString() + ", Genre: " + "Drama";
	}
	
	
	
	@Override
	public double calculateLateFees(int numberOfDays) {
		return (this.lateFeePerDay * numberOfDays);
		
	}

}
