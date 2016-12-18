package chapter5.ProgrammingProjects;

public class HotDogStandMain {

	public static void main(String[] args) {
		
		HotDogStand stand1 = new HotDogStand(1, 0);
		
		stand1.justSold();
		stand1.justSold();
		
		System.out.println(stand1.getSoldHotDogsToday());
		
		HotDogStand stand2 = new HotDogStand(2, 12);
		
		System.out.println(HotDogStand.getTotalSoldHotDogsToday());
		
		HotDogStand stand3 = new HotDogStand(3, 0);
		
		stand3.justSold();
		System.out.println(HotDogStand.getTotalSoldHotDogsToday());
		
	}

	
	
	
	
	
}
