package chapter7.ProgrammingProjects;

import java.util.Scanner;

import chapter4.Date;
import chapter7.Employee;
import chapter7.SalariedEmployee;

public class Adminstrator extends SalariedEmployee {

	private String title;
	private String area;
	private String supervisor;
	

	
	public Adminstrator(String name, Date date, double salary,
			String title, String area, String supervisor){
		super(name, date, salary);
		this.title = title;
		this.area = area;
		this.supervisor = supervisor;
	}
	
	// copy constructor
	public Adminstrator(Adminstrator admin){
		super(admin);
		this.title = admin.title;
		this.area = admin.area;
		this.supervisor = admin.supervisor;
	}

	public Adminstrator(String name, Date date, double salary){
		super(name, date, salary);
		this.getAdminstratorInfo();
	}

	private void getAdminstratorInfo() {

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Input the adminstrator title, area of responsibility and finally supervisor's name");
		
		this.title = keyboard.next();
		this.area = keyboard.next();
		this.supervisor = keyboard.next();
	}

	
	@Override
	public String toString() {
		return super.toString() + "\n"
				+ "Adminstrator's title: " + this.title + "\n"
				+ "Adminstrator's area: " + this.area + "\n"
				+ "Adminstrator's supervisor: " + this.supervisor;
	}
	
	
	public boolean equals(Object obj) {
		
		System.out.println("Admin equals");
		if (this.getClass() == obj.getClass()){
			Adminstrator otherAdmin = (Adminstrator) obj;
			return (super.equals(otherAdmin) 
					&& this.getTitle().equals(otherAdmin.getTitle())
					&& this.getArea().equals(otherAdmin.getArea())
					&& this.getSupervisor().equals(otherAdmin.getSupervisor()));
		}
		return false;
	}
	
	
	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getArea() {
		return area;
	}



	public void setArea(String area) {
		this.area = area;
	}



	public String getSupervisor() {
		return supervisor;
	}



	public void setSupervisor(String supervisor) {
		this.supervisor = supervisor;
	}
	
	
	
	
}
