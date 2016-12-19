package chapter6.ProgrammingProjects;

import java.util.Scanner;

public class ArrayCount {

	int[] partiallyFilledArray;
	
	
	public ArrayCount(int [] array) {
		this.partiallyFilledArray = array;
		
	}
	
	public ArrayCount() {
		
	}
	
	
	
	private void sortArrayFromLargest(int numberUsed){
		
		int max = this.partiallyFilledArray[0];
		int indexOfMax = 0;
		
		//int indexOfNextSmallest;
		
		int temp = 0;
		
		for (int i = 0; i < numberUsed; i++){
			
			if (this.partiallyFilledArray[i] > max){
				
				temp = this.partiallyFilledArray[i];
				
				max = this.partiallyFilledArray[i];
				indexOfMax = i;
				
				
			}
		}
	}
	
	
	private void interchange(int i, int j){
		
		int temp;
		temp = this.partiallyFilledArray[i];
		this.partiallyFilledArray[i] = this.partiallyFilledArray[j];
		this.partiallyFilledArray[j] = temp;
	}
	private int findNumberOfRepeatedNumbersAtIndex(int index, int numberUsed){
		
		int returnedNumber = 0;
		
		for (int i = 0; i < numberUsed; i++){
			if ((this.partiallyFilledArray[i] == this.partiallyFilledArray[index])
					&& i != index)
				returnedNumber++;
		}
		
		return returnedNumber;
	}
	
	public void fillArray(){
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Input numbers up to 50 numbers");
		System.out.println("Mark the end with -999");
		
		int number;
		int index = 0;
		
		do{
			number = keyboard.nextInt();
			this.partiallyFilledArray[index] = number;
			index++;
			
		}while(number != -999 && index < 50 );
		
		
	}
	
	
}
