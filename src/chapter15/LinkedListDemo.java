package chapter15;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		
		LinkedList1 list = new LinkedList1();
		
		list.addToStart("Apples", 1);
		list.addToStart("Bananas", 2);
		list.addToStart("Cantaloupe", 3);
		
		System.out.println("List has " + list.size() + " nodes.");
		
		list.outputList();
		
		if (list.contains("Cantaloupe")){
			System.out.println("Cantaloupe is on list");
		}
		else{
			System.out.println("Cantaloupe is NOT on list");
		}
		
		list.deleteHeadNode();

		if (list.contains("Cantaloupe")){
			System.out.println("Cantaloupe is on list");
		}
		else{
			System.out.println("Cantaloupe is NOT on list");
		}
		
		// empties the list
		while(list.deleteHeadNode());
		
		System.out.println("Start of list:");
		list.outputList();
		System.out.println("End of list");
		
		
	}

}
