package chapter7;

import chapter4.Date;

public class SalariedEmployee extends Employee {
	
	private double salary;
	
	public SalariedEmployee() {
		
		super();
		this.salary = 0;
	}
	
	public SalariedEmployee(String theName, Date theDate, double theSalary){
		
		super(theName, theDate);
		
		if (theSalary >= 0)
			this.salary = theSalary;
		else{
			System.out.println("Fatal Error: Negative salary.");
			System.exit(0);
		}
		
	}
	
	public SalariedEmployee(SalariedEmployee original){
		
		super(original);
		this.salary = original.salary;
	}
	
	public double getSalary(){
		return this.salary;
	}
	
	/**
	 * returns the pay of the month.
	 */
	
	public double getPay(){
		return this.salary / 12;
	}

	public void setSalary(double newSalary){
		
		if (newSalary >= 0)
			this.salary = newSalary;
		else{
			System.out.println("Fatal error: negative salary");
			System.exit(0);
		}
		
	}
	
	public String toString(){
		return (this.getName() + " " + this.getHireDate().toString() 
				+ "\n$" + this.salary + " per year.");
	}
	
	public boolean equals(Object obj){
		
		if (this.getClass() == obj.getClass()){
			SalariedEmployee otherEmployee = (SalariedEmployee) obj;
		return (this.getName().equals(otherEmployee.getName())
				&& this.getHireDate().equals(otherEmployee.getHireDate())
				&& this.salary == otherEmployee.salary);
		}
		return false;
	}
}
