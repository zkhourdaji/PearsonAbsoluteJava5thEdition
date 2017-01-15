package chapter14;

public class Sample<T> {
	
	private T data;
	
	public void setData(T newData){
		this.data = newData;
	}
	
	public T getData(){
		return data;
	}

}
