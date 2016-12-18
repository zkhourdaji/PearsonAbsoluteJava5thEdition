package chapter1;

public class ShowIntreset {

	
	public static final double INTREST_RATE = 2.5;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double balance = 100;
		double interest; //as a percent
		
		interest = balance * (INTREST_RATE / 100.0);
		System.out.println("On a balance of $" + balance);
		System.out.println("You will earn interest of $" + interest);
		System.out.println("All in just one short year.");
		

	}

}
