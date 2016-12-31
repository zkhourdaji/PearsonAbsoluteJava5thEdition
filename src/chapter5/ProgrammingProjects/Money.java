package chapter5.programmingProjects;

public class Money {

	private int dollars;
	private int cents;

	public Money() {
		this.dollars = 0;
		this.cents = 0;
	}

	public Money(int dollars){
		this.dollars = dollars;
		this.cents = 0;
	}

	public Money(int dollars, int cents){

		while (cents >= 100){
			cents -= 100;
			dollars++;
			
		}
		this.dollars = dollars;
		this.cents = cents;
	}

	public static Money add(Money money1, Money money2){


		return new Money(money1.dollars + money2. dollars
				, money1.cents + money2.cents);
	}
	

	public Money add(Money otherMoney){
		return new Money(this.dollars + otherMoney.dollars, 
				this.cents + otherMoney.cents);
	}
	
	public static Money minus(Money money1, Money money2){

		return new Money(money1.dollars - money2. dollars, 
				money1.cents - money2.cents);
	}
	
	public Money minus(Money otherMoney){
		return new Money(this.dollars - otherMoney.dollars, 
				this.cents - otherMoney.cents);
	}
	
	
	public String toString() {
		return "$" + this.dollars + "." + this.cents;
	}
	
	
	public boolean equals(Money otherMoney) {
		return ((this.dollars == otherMoney.dollars)
				&& (this.cents == otherMoney.cents));
	}
	
	
}
