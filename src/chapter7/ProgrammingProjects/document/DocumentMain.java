package chapter7.programmingProjects.document;

public class DocumentMain {

	public static void main(String[] args) {

		Email email1 = new Email("Zafer", "Saber", "Hello!", "Just saying hello brother");
		Email email2 = new Email("Bob", "Tom", "Bro", "Short for brother lol");

		File file1 = new File("parent Directory/ child directory", "Just another text file");
		File file2 = new File("child directory", "This is the second file");
		
		System.out.println(ContainsKeyword(email1, "Zafer"));
		System.out.println(ContainsKeyword(email1, "Saber"));
		System.out.println(ContainsKeyword(email1, "saber"));
		System.out.println(ContainsKeyword(email1, "hello"));
		
		System.out.println(ContainsKeyword(email2, "Zafer"));
		System.out.println(ContainsKeyword(email2, "Bob"));
		
		System.out.println(ContainsKeyword(file1, "parent"));
		System.out.println(ContainsKeyword(file1, "has"));
		
		System.out.println(ContainsKeyword(file2, "child"));


	}

	public static boolean ContainsKeyword(Document docObject, String keyword) { 

		if (docObject.toString().indexOf(keyword,0) >= 0) 
			return true ;  
		return false ;  
	}

}
