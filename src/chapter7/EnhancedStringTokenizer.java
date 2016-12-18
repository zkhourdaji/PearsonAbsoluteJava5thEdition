package chapter7;

import java.util.StringTokenizer;

public class EnhancedStringTokenizer extends StringTokenizer{
	
	private String[] a;
	private int count;
	
	
	public EnhancedStringTokenizer(String theString) {

		super(theString);
		a = new String[this.countTokens()];
		count = 0;
		
	}
	
	public EnhancedStringTokenizer(String theString, String delimiters){
		super(theString, delimiters);
		a = new String[this.countTokens()];
		count = 0;
		
	}
	
	/**
	 * Returns the same value as the same method in the StringTokenizer class,
	 * but it also stores data for the method tokenSoFar to use.
	 */
	public String nextToken(){
		String token = super.nextToken();
		a[this.count] = token;
		count++;
		return token;
		
	}
	
	/**
	 * Returns the same value as the same method in the StringTokenizer
	 * class, and changes the delimiter set in the same way as does the 
	 * same method in the StringTokenizer class, but it also stores data
	 * for the method tokensSoFar to use.
	 */
	public String nextToken(String delimiters){
		
		String token = super.nextToken(delimiters);
		a[this.count] = token;
		count++;
		return token;
	}
	
	/**
	 * returns an array of all tokens produced so far.
	 * array returned has length equal to the number of tokens produced so far.
	 * 
	 */
	
	public String[] tokensSoFar(){
		
		String[] arrayToReturn = new String[count];
		for (int i = 0; i < count; i++){
			arrayToReturn[i] = a[i];
		}
		return arrayToReturn;
	}

}
