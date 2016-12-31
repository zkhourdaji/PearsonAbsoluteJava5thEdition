package chapter6.programmingProjects;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ArrayCountMain {

	public static void main(String[] args) {
		
		ArrayCount arrayCount = new ArrayCount();
		
		//int[] array = new int[100];
		//ArrayCount exceptinArray = new ArrayCount(array);
	
		arrayCount.fillArray();
		//arrayCount.displayArray();
		arrayCount.sortPartialArrayDescending();
		arrayCount.displayArray();
		
		
		
		
	}

}
