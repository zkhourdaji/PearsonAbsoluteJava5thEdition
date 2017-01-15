package chapter11.programmingProjects;

public class SavingAccountIntrest {
	
	
	/*
	 * using int for simplicity.
	 * This method should take the money deposit amount,
	 * an interest rate per year, and the number of years
	 * the money will stay in
	 */
	public static int calculateAmountOfMoney(int deposit, int interestRate, int numberOfYears){
		
		
		if (deposit == 0){
			System.out.println("no deposit made");
			return 0;
		}
		if (interestRate == 0){
			System.out.println("no interest rate");
			return deposit;
		}
		if (numberOfYears == 0){
			System.out.println("number of years is 0");
			return deposit;
		}
		
		
		int totalMoney = 0;
		totalMoney += calculateAmountOfMoney(totalMoney, interestRate, numberOfYears - 1);
		
		
		return totalMoney;
		
	}

}
