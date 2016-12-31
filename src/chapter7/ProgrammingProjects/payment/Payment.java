package chapter7.programmingProjects.payment;

public class Payment {

	double paymentAmount;

	public Payment(double paymentAmount) {

		this.paymentAmount = paymentAmount;
	}


	public double getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(double paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public String paymentDetails(){
		
		return "The payment amount is " + this.paymentAmount;
	}


	
	public boolean equals(Object obj) {
		
		if (obj == null)
			return false;
		else if (obj.getClass() != this.getClass())
			return false;
		else{
			Payment otherPayment = (Payment) obj;
			return (this.paymentAmount == otherPayment.paymentAmount);
		}
	}
	
	
	public String toString() {
		return this.paymentAmount + "";
	}
	



}
