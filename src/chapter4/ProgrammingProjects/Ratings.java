package chapter4.programmingProjects;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ratings {

	private String path;
	private int numberOfProducts;

	public Ratings() {
		System.out.println("Object created without path");
	}

	public Ratings(String path) {
		if (this.fileExists(path)){
			this.path = path;
		}
		else
			System.out.println("file not found");

	}

	private boolean fileExists(String path){

		return new File(path).exists();

	}

	public void setPath(String path){
		if (fileExists(path))
			this.path = path;
		else 
			System.out.println("Path not found ...");
	}

	public void calculateAverage(){

		File textFile = new File(this.path);
		FileInputStream fis;
		Scanner scanner = null;
		StringTokenizer productNamesTokenizer;
		StringTokenizer reviewsTokenizer;
		int[] totalPointsForEachProductArray;
		int [] totalValidReviewsForEachProductsArray;

		try {
			fis = new FileInputStream(textFile);
			scanner = new Scanner(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		int i = 0;
		//first line (names of prodcuts)
		productNamesTokenizer = new StringTokenizer(scanner.nextLine(), ",");
		this.numberOfProducts = productNamesTokenizer.countTokens();
		totalPointsForEachProductArray = new int[this.numberOfProducts];
		totalValidReviewsForEachProductsArray = new int[this.numberOfProducts];

		System.out.println("number of products " + this.numberOfProducts);
		System.out.println();

		// while loop goes line by line
		while(scanner.hasNextLine()){
			reviewsTokenizer = new StringTokenizer(scanner.nextLine(), ",");
			// for loop goes review by review
			for (i = 0; i < this.numberOfProducts; i++){

				String rating = reviewsTokenizer.nextToken();
				if (Integer.parseInt(rating) != 0){
					totalValidReviewsForEachProductsArray[i]++;
					totalPointsForEachProductArray[i] += Integer.parseInt(rating);

				}
			}
			
		}
		for (int j = 0; j < totalPointsForEachProductArray.length; j++){
			System.out.println("Product name: " + productNamesTokenizer.nextToken());
			System.out.println("Average : " + 
		(double) totalPointsForEachProductArray[j]/totalValidReviewsForEachProductsArray[j]);
			System.out.println();
		}

	}
}
