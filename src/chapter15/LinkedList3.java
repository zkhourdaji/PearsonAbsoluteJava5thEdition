package chapter15;

import com.sun.xml.internal.bind.v2.TODO;

public class LinkedList3<T> {
	
	private class Node<T>{
		
		private T data;
		private Node<T> link;
		
		public Node(){
			this.data = null;
			this.link = null;
		}
		
		public Node(T newData, Node<T> linkValue){
			
			this.data = newData;
			this.link = linkValue;
		}
	} // End of Node<T> class
	
	private Node<T> head;
	
	public LinkedList3() {
		
		this.head = null;
	}
	
	/**
	 * Adds a node at the start of the list with the specified data.
	 * The added node will be the same first node in the list.
	 */
	public void addToStart(T itemData){
		
		this.head = new Node<T> (itemData, head);
	}
	
	// TODO: incomplete class

}
