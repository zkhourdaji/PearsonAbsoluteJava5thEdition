package chapter7.ProgrammingProjects;

import chapter4.Date;

public class AdminstratorMain {

	public static void main(String[] args) {

		Date date1 = new Date(11, 23, 1996);
		
		Adminstrator admin1 = new Adminstrator("Tom", new Date(), 120000);
		Adminstrator admin2 = new Adminstrator(admin1);
		Adminstrator admin3 = new Adminstrator("Tom", new Date(), 120000);
		
		System.out.println(admin1.equals(admin2));
		System.out.println(admin1.equals(admin3));
	}

}
