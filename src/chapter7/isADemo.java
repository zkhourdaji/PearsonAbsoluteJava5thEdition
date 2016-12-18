package chapter7;

import chapter4.Date;

public class isADemo {

	public static void main(String[] args) {
		
		SalariedEmployee joe = new SalariedEmployee("Josephine", 
				new Date("January", 1, 2004), 100000);
		HourlyEmployee sam = new HourlyEmployee("Sam", 
				new Date("February", 1, 2003), 50.50, 40);
		
		System.out.println("Joe's longer name is  " + joe.getName());
		System.out.println("showEmployee(joe) invoked: ");
		showEmployee(joe);
		
		System.out.println("showEmployee(sam) invoked: " );
		showEmployee(sam);
		
		
	}
	
	public static void showEmployee(Employee employeeObject){
		System.out.println(employeeObject.getName());
		System.out.println(employeeObject.getHireDate());
	}
}
