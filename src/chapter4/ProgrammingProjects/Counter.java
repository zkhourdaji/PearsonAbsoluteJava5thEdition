package chapter4.ProgrammingProjects;

public class Counter {

	private int counter = 0;

	

	public void resetCounter(){
		this.counter = 0;

	}

	public void increaseCounter(){
		this.counter ++;
	}

	public void decreaseCounter(){

		if (this.counter > 0)
			this.counter --;
	}

	public int getCounter(){
		return this.counter;
	}


	public String toString() {
		return "" + counter;
	}


	public boolean equals(Counter otherCounter) {
		if (this.counter == otherCounter.counter)
			return true;
		else
			return false;

	}
}
