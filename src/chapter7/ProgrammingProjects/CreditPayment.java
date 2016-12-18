package chapter7.ProgrammingProjects;

import chapter4.Date;

public class CreditPayment extends Payment {

	private String nameOnCard;
	private Date expirationDate;
	private int creditCardNumber;
	
	
	public CreditPayment(double paymentAmount, String name, Date expirationDate, int cardNumber) {
		
		super(paymentAmount);
		this.nameOnCard = name;
		this.expirationDate = expirationDate;
		this.creditCardNumber = cardNumber;
		
	}
	
	
	@Override
	public String paymentDetails() {
		return super.paymentDetails() + " paid by credit card.\n"
				+ "Name on card " + this.nameOnCard + "\n"
				+ "Expiration date " + this.expirationDate + "\n"
				+ "Credit Card Number " + this.creditCardNumber;
	}


	public String getNameOnCard() {
		return nameOnCard;
	}


	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}


	public Date getExpirationDate() {
		return new Date(this.expirationDate);
	}


	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}


	public int getCreditCardNumber() {
		return creditCardNumber;
	}


	public void setCreditCardNumber(int creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}
	
	

}
