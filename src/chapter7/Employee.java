package chapter7;

import chapter4.Date;

public class Employee {

	private String name;
	private Date hireDate;
	
	
	public Employee() {
		
		this.name = "No name";
		this.hireDate = new Date("January", 1, 1000); // Just a placeholder
	}
	
	/**
	 * Precondition: Neither theName nor theDate is null
	 */
	public Employee(String theName, Date theDate){
		
		if (theName == null || theDate == null){
			System.out.println("Fatal Error creating employee.");
			System.exit(0);
		}
		this.name = theName;
		this.hireDate = new Date(theDate);

	}
	
	public Employee(Employee originalEmployee){
		
		this.name = originalEmployee.name;
		this.hireDate = new Date(originalEmployee.hireDate);
	}
	
	public String getName(){
		return this.name;
	}
	
	public Date getHireDate(){
		return new Date(hireDate);
	}
	
	public void setName(String newName){
		
		if (newName == null){
			System.out.println("Fatal Error setting employee name.");
			System.exit(0);
		}
		else
			this.name = newName;
	}
	
	public void setHireDate(Date newDate){
		
		if (newDate == null){
			System.out.println("Fatal Error setting employee hire date");
			System.exit(0);
		}
		else
			this.hireDate = new Date(newDate);
	}
	
	
	public String toString() {
		return this.name + " " + this.hireDate.toString();
	}
	
	
	public boolean equals(Object obj) {
		
		if (this.getClass() == obj.getClass()){
			Employee otherEmployee = (Employee) obj;
			return (this.name.equals(otherEmployee.name) && hireDate.equals(otherEmployee));

		}
		return false;
		
	}
	
	
	
}
