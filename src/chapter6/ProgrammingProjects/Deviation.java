package chapter6.ProgrammingProjects;

public class Deviation {

	public static void main(String[] args) {
		
		double[] partiallyFilledDoubles = new double[10];
		int numberUsed = 2;
		
		partiallyFilledDoubles[0] = 10.0;
		partiallyFilledDoubles[1] = 111.0;

		double answer = calculateDeviation(partiallyFilledDoubles, numberUsed);
		
		System.out.println("Deviation = " + answer);
		
		

	}
	
	public static double calculateDeviation (double[] partiallyFilledDoubles, int numberUsed){
		
		double average = 0;
		double sum = 0;
		
		double[] newArray = new double[numberUsed];
		double newSum = 0;
		double newAverage = 0;
		
		for (int i = 0; i < numberUsed; i++){
			sum += partiallyFilledDoubles[i];
		}
		average = sum / numberUsed;
		
		for (int i = 0; i < numberUsed; i++){
			newArray[i] = Math.pow((partiallyFilledDoubles[i] - average), 2);
		}
		for (int i = 0; i < numberUsed; i++){
			newSum += newArray[i];
		}
		newAverage = newSum / numberUsed;
		
		
		return Math.sqrt(newAverage);
	}

}
