package chapter4.ProgrammingProjects;

public class DateMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date1 = new Date("December", 16, 1770),               
				date2 = new Date(1, 27, 1756),               
				date3 = new Date(1882),                
				date4 = new Date();   
				
				System.out.println("Whose birthday is " + date1 + "?");  
				System.out.println("Whose birthday is " + date2 + "?");  
				System.out.println("Whose birthday is " + date3 + "?");  
				System.out.println("The default date is " + date4 + ".");

	}

}
