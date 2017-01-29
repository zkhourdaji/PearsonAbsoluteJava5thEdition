package chapter15;

import java.util.NoSuchElementException;

public class LinkedList2 {
	
	private class Node {
		
		private String item;
		private Node link;
		
		public Node(){
			
			this.item = null;
			this.link = null;
		}
		
		public Node(String newItem, Node linkValue){
			this.item = newItem;
			this.link = linkValue;
		}
		
	} // end of Node inner class
	
	/**
	 * If the list is altered any iterators should invoke restart
	 * or the iterator's behavior may not be as desired.
	 *
	 */
	public class List2Iterator{
		
		private Node position;
		private Node previous;
		
		public List2Iterator() {
			
			this.position = head;
			this.previous = null;
		}
		
		public void restart(){
			this.position = head;
			this.previous = null;
		}
		
		public String next(){
			
			if (!hasNext()){
				throw new NoSuchElementException();
			}
			
			String toReturn = position.item;
			
			// advances the list
			previous = position;
			position = position.link;
			return toReturn;
		}
		
		public boolean hasNext(){
			/*
			 * if previous is the last node 
			 * position will have a value of null
			 */
			return (position != null);
		}
		
		/**
		 * Returns the next value to be returned by next();
		 * Throws an IllegalStateException if hasNext() is false;
		 * @return
		 */
		public String peek(){
			
			if (!hasNext())
				throw new IllegalStateException();
			return position.item;
		}
		
		/**
		 * Adds a node before the node at location position.
		 * previous is placed at the new node. If hasNext() is
		 * false, then the node is added to the end of teh list.
		 * If the list is empty, insert node as the only node.
		 */
		public void addHere(String newData){
			
			if (position == null && previous != null){
				// at the end of teh list, add to end
				previous.link = new Node(newData, null);
			}
			else if (position == null || previous == null){
				// list is empty or position is head node
				LinkedList2.this.addToStart(newData);
			}
			else{
				// previous and position are consecutive nodes
				Node temp = new Node(newData, position);
				previous.link = temp;
				previous = temp;
			}
			
		}
		
		/**
		 * Changes the string in the node at location position.
		 * Throws an illegal state exception if position is not at a node.
		 * @param newData
		 */
		public void changeHere(String newData){
		
			//TODO write this method
		}
		
		/**
		 * Deletes the node at location position and
		 * moves postiion the the "next" node.
		 * throws an illegal state exception if teh list is empty.
		 */
		public void delete(){
			
			if (position == null)
				throw new IllegalStateException();
			else if (previous == null){
				// removes the node at head
				head = head.link;
				position = head;
			}
			else{
				// previous and position are consecutive nodes
				previous.link = position.link;
				position = position.link;
			}
		}
				
	}
	
	private Node head;
	
	public LinkedList2() {
		this.head = null;
	}

	
	public List2Iterator iterator(){
		return new List2Iterator();
	}
	/**
	 * Adds a node at the start of the list with the specified data.
	 * The added node will be the first node in the list.
	 */
	public void addToStart(String itemName){
		
		this.head = new Node(itemName, head);
	}
	
	/**
	 * Removes the head node and returns true if the list contains at
	 * least one node. Returns false if the list is empty.
	 */
	public boolean deleteHeadNode(){
		
		if (this.head != null){
			this.head = head.link;
			return true;
		}
		else
			return false;
	}
	
	/**
	 * Returns the number of nodes in the list
	 */
	public int size(){
		
		int count = 0;
		Node position = head;
		
		while (position != null){
			count++;
			position = position.link;
		}
		return count;
	}
	
	public boolean contains(String item){
		return (find(item) != null);
	}
	
	/**
	 * Finds the first node containing the target item, and returns a
	 * reference to that node. If target is not in the list, null
	 * is returned.
	 */
	private Node find(String target){
		
		Node position = head;
		String itemAtPosition;
		
		while (position != null){
			itemAtPosition = position.item;
			if (itemAtPosition.equals(target)){
				return position;
			}
			position = position.link;
		}
		return null;
		
	}
	
	public void outputList(){
		
		Node position = head;
		
		while (position != null){
			System.out.println(position.item);
			position = position.link;
		}
	}
	
	public boolean isEmpty(){
		return (head == null);
	}
	
	public void clear(){
		this.head = null;
	}
}
