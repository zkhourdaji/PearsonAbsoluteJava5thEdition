package chapter5.ProgrammingProjects;

public class HotDogStand {

	private int ID = 0;
	private int soldHotDogsToday = 0;
	private static int totalHotDogsSoldToday = 0;
	
	
	/**
	 * This constructor takes two integers as arguments.
	 * The first is the hot stands ID, the second is the 
	 * number of hot dogs the stand sold for that day.
	 * It sets the instance variables ID and soldHotDogsToday,
	 * and also, it keeps track of all the hot dogs sold today by
	 * all the hot dog stands by incrementing the static variable
	 * totalHotDogsSoldToday.
	 * 
	 * @param id The ID of the hot dog stand
	 * @param soldHotDogsToday The number of hot dogs sold today by the stand
	 */
	public HotDogStand(int id, int soldHotDogsToday) {
		this.ID = id;
		this.soldHotDogsToday = soldHotDogsToday;
		HotDogStand.totalHotDogsSoldToday += soldHotDogsToday;
	}
	
	/**
	 * Call this method when you sell a hotdog from a hot dog stand.
	 * It increments the soldHotDogsToday instance variable of the calling object.
	 * Also, it increments the static variable totalHotDogsSoldToday.
	 */
	public void justSold(){
		this.soldHotDogsToday++;
		HotDogStand.totalHotDogsSoldToday++;
	}
	
	/**
	 * @return Returns the number of sold hot dogs today.
	 */
	public int getSoldHotDogsToday(){
		return this.soldHotDogsToday;
	}
	
	/**
	 * 
	 * @return Returns the number of total hot dogs sold across all the hot dog stands.
	 */
	public static int getTotalSoldHotDogsToday(){
		return HotDogStand.totalHotDogsSoldToday;
	}
}
