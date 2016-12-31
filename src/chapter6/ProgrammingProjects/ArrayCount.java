package chapter6.programmingProjects;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ArrayCount {

	private int[] partiallyFilledArray;
	private int numberUsed;
	private int[] repetitions; // after the array get sorted
	
	
	
	public ArrayCount() {
		
		this.partiallyFilledArray = new int[50];
		this.repetitions = new int[50];
	}
	
	
	
	public int[] getPartiallyFilledArray() {
		
		int [] copy = new int[this.partiallyFilledArray.length];
		System.arraycopy(this.partiallyFilledArray, 0, 
				copy, 0, this.partiallyFilledArray.length);
		return  copy;
	}

	public void setPartiallyFilledArray(int[] partiallyFilledArray) {
		this.partiallyFilledArray = partiallyFilledArray;
	}

	public int[] sortPartialArrayDescending(){
		
		int i, j, maxValue, maxIndex, temp;
		
		for (i = 0; i < this.partiallyFilledArray.length; i++){
			
			maxValue = this.partiallyFilledArray[i];
			maxIndex = i;
			
			for (j = i; j < this.numberUsed; j++){
				if (this.partiallyFilledArray[j] > maxValue){
					maxValue = this.partiallyFilledArray[j];
					maxIndex = j;
				}
			}
			
			if (maxValue > this.partiallyFilledArray[i]){
				
				temp = this.partiallyFilledArray[i];
				this.partiallyFilledArray[i] = this.partiallyFilledArray[maxIndex];
				this.partiallyFilledArray[maxIndex] = temp;
			}
			
		}
		return this.partiallyFilledArray;
		
	}
	
	private void findRepetitions(){
		
		
		
	}
	
	
	public void displayArray(){
		
		this.findRepetitions();
		for (int i = 0; i < numberUsed; i++){
			System.out.print(this.partiallyFilledArray[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < numberUsed; i++){
			System.out.print(this.repetitions[i] + " ");
		}
		System.out.println();
	}
	
	public void fillArray(){
		
		StringTokenizer st;
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.println("input numbers (up to 50 numbers) on the same line");
		st = new StringTokenizer(keyboard.nextLine());
		
		if (st.countTokens() > 50)
			System.out.println("only 50 is allowed, " + (st.countTokens() - 50) 
					+ " numbers wont be read");
		else{
			System.out.println("you entered " + st.countTokens());
		}
		
		for (int i = 0; i < this.partiallyFilledArray.length; i++){
			
			if (st.hasMoreTokens()){
				String currentToken = st.nextToken();
				try {
					this.partiallyFilledArray[i] = Integer.parseInt(currentToken);
					this.numberUsed++;
				} catch (NumberFormatException e) {
					System.out.println("Error: '" + currentToken + "' is not a number");
					
				}
			}
			else
				break;
		}
		
		keyboard.close();
		
	}
	
}
