package chapter7.ProgrammingProjects;

import chapter4.Date;

public class PaymentMain {
	
	public static void main(String[] args) {
		
		CashPayment cash1 = new CashPayment(99.99);
		CashPayment cash2 = new CashPayment(5.99);
		
		Date expirationDate = new Date("January", 23, 2020);
		int cardNumber = 123456789;
		
		CreditPayment credit1 = new CreditPayment(10.00, "Zafer", expirationDate, cardNumber);
		
		System.out.println(cash1.paymentDetails());
		System.out.println(cash2.paymentDetails());
		System.out.println(credit1.paymentDetails());
	}

}
