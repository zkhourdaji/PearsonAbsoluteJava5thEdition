package chapter5.programmingProjects;

public class RationalMain {
	
	public static void main(String[] args) {
		
		Rational r1 = new Rational(1, 3);
		Rational r2 = new Rational(3, 9);
		Rational r3 = new Rational(-12, -15);
		
		System.out.println("does " + r1 + " equals " + r2 + " ? ");
		System.out.println(r1.equals(r2));
		System.out.println(Rational.add(r1, r2));
		
		
		System.out.println(Rational.multiply(r1, r2));
		System.out.println(Rational.subtract(r1, r2));
		
		System.out.println(r3);
		r3.normalizeSign();
		System.out.println(r3);
		
	}

}
