package chapter15;

public class Node1 {
	
	private String item;
	private int count;
	private Node1 link;
	
	public Node1() {
		
		this.link = null;
		this.item = null;
		this.count = 0;
	}
	
	public Node1(String newItem, int newCount, Node1 linkValue){
		
		this.setData(newItem, newCount);
		this.link = linkValue;
	}
	
	public void setData(String newItem, int newCount){
		
		this.item = newItem;
		this.count = newCount;
	}
	
	public void setLink(Node1 newLink){
		
		this.link = newLink;
	}
	
	public String getItem(){
		return this.item;
	}
	
	public int getCount(){
		return this.count;
	}
	
	public Node1 getLink(){
		return this.link;
	}

}
