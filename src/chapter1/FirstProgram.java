package chapter1;

public class FirstProgram {

	public static void main(String[] args) {

		System.out.println("Hello World!");
		System.out.println("Welcome to Java.");

		System.out.println("Let's demonstrate a simple calculation.");
		int answer;
		answer = 2 + 2;

		System.out.println("2 plus 2 is " + answer);
		System.out.println("Java is not a drink!");

		System.out.println("I like Java.");
		System.out.println("I like tea.");
		System.out.println("Hellow World!");

		System.out.println("14 divided by 3 is " + (14/3));
		System.out.println("with remainder of " +  (14 % 3));
		
		//System.out.println( 10.1 % 0.1);
		
		double number = (1.0/3) * 3.0;
		System.out.println("(1/3) * 3 is equal to " + number);
		
		int quotient, remainder;
		quotient = 7 / 3;
		remainder = 7 % 3;
		System.out.println("quotient is " + quotient);
		System.out.println("remaninder is " + remainder);
		
		int result = 11;
		result /= 2;
		System.out.println("result is " + result);
		
		double celsius = 20;
		double fahrenheit;
		fahrenheit = (9/5.0) * celsius + 32.0;
		System.out.println("celsuis = " + celsius);
		System.out.println("fahrenheit = " + fahrenheit);
		
		String blessing = "Live long and prosper.";
		
		System.out.println(blessing);
		
		
		
	}

}
