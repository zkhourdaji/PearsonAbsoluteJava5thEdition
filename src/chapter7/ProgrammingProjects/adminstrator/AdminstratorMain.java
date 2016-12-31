package chapter7.programmingProjects.adminstrator;

import chapter4.Date;

public class AdminstratorMain {

	public static void main(String[] args) {

		Date date1 = new Date(11, 23, 1996);
		
		Adminstrator admin1 = new Adminstrator("Tom", date1, 120000);
		Adminstrator admin2 = new Adminstrator(admin1);
		Adminstrator admin3 = new Adminstrator("Tom", date1, 120000);
		
		// should return true
		System.out.println(admin1.equals(admin2));
		System.out.println(admin1.equals(admin3));
	}

}
