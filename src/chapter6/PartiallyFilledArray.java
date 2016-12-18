package chapter6;

public class PartiallyFilledArray {

	private int maxNumberElements; //same as a.length
	private double[] a;
	private int numberUsed; // Number of inices currently in use


	/**
	 * sets the maximum number of allowable elements to 10
	 */
	public PartiallyFilledArray() {
		this.maxNumberElements = 10;
		a = new double[this.maxNumberElements];
		this.numberUsed = 0;
	}

	public PartiallyFilledArray(int arraySize){
		
		if (arraySize <= 0){
			System.out.println("Eror array size cannot be less than or equal to 0");
			System.exit(0);
		}
		
		this.maxNumberElements = arraySize;
		this.a = new double [this.maxNumberElements];
		this.numberUsed = 0;
		
	}
	
	public PartiallyFilledArray(PartiallyFilledArray original){
		
		if (original == null){
			System.out.println("Fatal error: Aborting program");
			System.exit(0);
		}
		this.maxNumberElements = original.maxNumberElements;
		numberUsed = original.numberUsed;
		a = new double[this.maxNumberElements];
		for (int i = 0; i < numberUsed; i++){
			a[i] = original.a[i];
		}
		
	}
	
	public double getElement(int index){
		if (index < 0 || index >= numberUsed){
			System.out.println("Illegal or unused index.");
			System.exit(0);
		}
		return a[index];
	}
	
	public void resetElement(int index, double newValue){
		
		if (index < 0 || index >= maxNumberElements){
			System.out.println("Error: Illegal index");
			System.exit(0);
		}
		else if (index > numberUsed){
			System.out.println("Error changing and index that is too large");
			
		}
		else
			a[index] = newValue;
	}
	
	public void deleteLat(){
		if (empty()){
			System.out.println("Error: Deleting from an empty array");
			System.exit(0);
		}
		else
			numberUsed--;
	}

	public void delete(int index){
	
		if (index < 0 || index >= numberUsed){
			System.out.println("Error: Illegal or unused index");
			System.exit(0);
		}
	}
	
	public boolean empty() {
		
		return numberUsed == 0;
	}
	
	public boolean full(){
		
		return (numberUsed == maxNumberElements);
	}
	
	public int getMaxCapacity(){
		return maxNumberElements;
	}
	
	public int getNumberOfElements(){
		return numberUsed;
	}

	
	
	
	
	
	
}
