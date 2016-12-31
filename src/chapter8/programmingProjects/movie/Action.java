package chapter8.programmingProjects.movie;

public class Action extends Movie {

	private final double lateFeePerDay = 3;
	
	public Action(String movieName, String motionPictureRating, int id) {
		super(movieName, motionPictureRating, id);
	}
	
	@Override
	public String toString() {
		return super.toString() + ", Genre: " + "Action";
	}
	
	
	@Override
	public double calculateLateFees(int numberOfDays) {
		return (this.lateFeePerDay * numberOfDays);
		
	}

}
