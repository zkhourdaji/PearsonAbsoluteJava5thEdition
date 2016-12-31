package chapter8.programmingProjects.predator_prey_simulation;

/**
 * This class will simply represent a coordinate location
 * on the board for the prey-predator simulation.
 * 
 * @author ZaferSamir
 *
 */
public class Location {
	
	
	private int x;
	private int y;
	
	
	public Location(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Location(Location originalLocation) {
		this.x = originalLocation.x;
		this.y = originalLocation.y;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return new Location(this);
	}

	@Override
	public String toString() {
		return "(" + this.x + ", " + this.y + ")";
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (obj == null){
			return false;
		}
		else if (this.getClass() != obj.getClass()){
			return false;
		}
		else{
			Location otherLocation = (Location) obj;
			return (this.x == otherLocation.x
					&& this.y == otherLocation.y);
		}
	}
	
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	
	
	
	

}
