package chapter8.programmingProjects.predator_prey_simulation;

public class Locations {
	
	private Location[] locations;
	
	public Locations(int numberOfLocations) {
		this.locations = new Location[numberOfLocations];
	}
	
	
	
	public boolean locationAvailable(Location location){
		
		for (int i = 0; i < this.locations.length; i++){
			if (location.equals(locations[i])){
				return false;
			}
		}
		return true;
	}

}
