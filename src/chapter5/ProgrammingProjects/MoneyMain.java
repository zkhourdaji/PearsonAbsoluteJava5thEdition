package chapter5.programmingProjects;

public class MoneyMain {

	public static void main(String[] args) {
		
		Money m1 = new Money(0, 500);
		Money m2 = new Money(5, 100);
		
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m1.equals(m2));
		
		System.out.println(Money.add(m1, m2));
		System.out.println(Money.minus(m1,m2));
		System.out.println(Money.minus(m2,m1));
		
		System.out.println("=========");
		System.out.println(m1.add(m2));
		System.out.println(m1.minus(m2));
		
		
	}
}
