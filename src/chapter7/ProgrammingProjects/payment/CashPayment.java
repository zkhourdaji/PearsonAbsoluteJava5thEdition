package chapter7.programmingProjects.payment;

public class CashPayment extends Payment{

	
	public CashPayment(double paymentAmount) {
		super(paymentAmount);
		
	}
	
	@Override
	public String paymentDetails() {
		return super.paymentDetails() + " in the form of cash.";
	}
	
	

}
