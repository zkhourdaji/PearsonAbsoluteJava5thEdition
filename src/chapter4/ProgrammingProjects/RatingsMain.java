package chapter4.programmingProjects;

public class RatingsMain {

	public static void main(String[] args) {

		String path = "src/chapter4/ProgrammingProjects/sampleRatings";
		
		Ratings ratings = new Ratings(path);
		ratings.calculateAverage();
		
	}

}
