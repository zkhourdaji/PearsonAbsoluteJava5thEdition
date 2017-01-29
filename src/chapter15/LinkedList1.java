package chapter15;

public class LinkedList1 {
	
	private Node1 head;
	
	public LinkedList1() {
		this.head = null;
	}
	
	/**
	 * adds a node at the start of the list with the specified
	 * data. The added node will be the first node in the list.
	 * 
	 */
	public void addToStart(String itemName, int itemCount){
		
		this.head = new Node1(itemName, itemCount, head);
	}
	
	/**
	 * Removes the head node and returns true if the list
	 * contains at the least one node. Returns false if the
	 * list is empty.
	 */
	public boolean deleteHeadNode(){
		
		if (this.head != null){
			this.head = head.getLink();
			return true;
		}
		else
			return false;
	}
	
	public int size(){
		
		int count = 0;
		Node1 position = head;
		
		while (position != null){
			count++;
			position = position.getLink();
		}
		return count;
	}
	
	public boolean contains(String item){
		return (this.find(item) != null);
	}
	
	/**
	 * finds the first node containing the target item, and returns 
	 * a reference to that node. if the target is not in the list, null is
	 * returned.
	 */
	private Node1 find(String target){
		
		Node1 position = head;
		String itemAtPosition;
		
		while(position != null){
			itemAtPosition = position.getItem();
			if (itemAtPosition.equals(target))
				return position;
			position = position.getLink();
		}
		return null; //target is not found
	}
	
	public void outputList(){
		
		Node1 position = head;
		
		while(position != null){
			System.out.println(position.getItem() + " " + position.getCount());
			position = position.getLink();
		}
	}

}
