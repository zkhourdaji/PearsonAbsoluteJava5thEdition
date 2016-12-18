package chapter4.ProgrammingProjects;

public class CounterMain {

	public static void main(String[] args) {

		Counter firstCounter = new Counter();
		Counter secondCounter = new Counter();
		
		System.out.println("first counter " + firstCounter);
		System.out.println("second counter " + secondCounter);
		
		firstCounter.decreaseCounter();
		System.out.println(firstCounter);
		firstCounter.increaseCounter();
		System.out.println(firstCounter);
		
		System.out.println(firstCounter.equals(secondCounter));
		secondCounter.increaseCounter();
		
		System.out.println(secondCounter.equals(secondCounter));
		
		firstCounter.resetCounter();
		System.out.println(firstCounter);
	}

}
