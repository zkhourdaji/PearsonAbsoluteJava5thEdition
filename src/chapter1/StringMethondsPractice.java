package chapter1;

public class StringMethondsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String statement = " I love programming! ";
		String sameStatement = "I love programming!";
		String differentStatement = "I love real estate!";
		
		int statementLength = statement.length();
		boolean sameStatementEqual = statement.equals(sameStatement);
		boolean differentStatementEqual = statement.equals(differentStatement);
		String lowerStatement = statement.toLowerCase();
		String upperStatement = statement.toUpperCase();
		String trimmedStatement = statement.trim();
		char index3 = statement.charAt(3);
		String loveSubstring = statement.substring(3,7);
		int indexOfP = statement.indexOf('p');
		int indexOfG = statement.indexOf('g', 12);
		int indexLastG = statement.lastIndexOf('g');
		int statementCompare = statement.compareTo(sameStatement);
		
		
		System.out.println("Statement is: " + statement);
		System.out.println("Statement has " + statementLength + " characters.");
		System.out.println("Does: " + statement +  " equal: " + sameStatement);
		System.out.println(sameStatementEqual);
		System.out.println("Does: " + statement + " equal: " + differentStatement);
		System.out.println(differentStatementEqual);
		System.out.println("Statement loweredcase: " + lowerStatement);
		System.out.println("Statement uppercase: " + upperStatement);
		System.out.println("Statement trimmed: " + trimmedStatement);
		System.out.println("Statment 3rd index: " + index3);
		System.out.println("Statement substring: " + loveSubstring);
		System.out.println("Statement index of 'p': " + indexOfP);
		System.out.println("Statemnet index of second 'g': " + indexOfG);
		System.out.println("Statement last index of 'g': " + indexLastG);
		System.out.println("Statement Compare to same statement: " + statementCompare);
		
		
		

	}

}
