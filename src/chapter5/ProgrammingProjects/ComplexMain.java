package chapter5.programmingProjects;

public class ComplexMain {
	
	public static void main(String[] args) {
		
		Complex c1 = new Complex(4,2);
		Complex c2 = new Complex(-6,-7);
		
		System.out.println(Complex.add(c1, c2));
	}

}
