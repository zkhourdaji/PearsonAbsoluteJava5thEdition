package chapter14;

public class Pair<T> {
	
	private T first;
	private T second;
	
	public Pair() {
		this.first = null;
		this.second = null;
	}
	
	public Pair(T firstItem, T secondItem){
		this.first = firstItem;
		this.second = secondItem;
	}
	
	public void setFirst(T newFirst){
		this.first = newFirst;
	}
	
	public void setSecond(T newSecond){
		this.second = newSecond;
	}
	
	public T getFirst(){
		return this.first;
	}
	
	public T getSecond(){
		return this.second;
	}
	
	public String toString(){
		return ("first: " + this.first.toString() + "\n"
				+ "second: " + this.second.toString() + "\n");
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (obj == null)
			return false;
		else if (this.getClass() != obj.getClass())
			return false;
		else{
			Pair<T> otherPair = (Pair<T>) obj;
			return (this.first.equals(otherPair.first)
					&& this.second.equals(otherPair.second));
		}
	}

}
