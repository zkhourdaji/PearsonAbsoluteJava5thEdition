package chapter8.programmingProjects.predator_prey_simulation;

public class Doodlebug extends Organism {

	
	
	public Doodlebug(Location location) {
		super(location);
	}

	/**
	 *  Move. Every time step, if there is an adjacent cell (up, down, left, or right) 
	 *  occupied by an ant, then the doodlebug will move to that cell and eat the ant. 
	 *  Otherwise, the doodlebug moves according to the same rules as the ant. 
	 *  Note that a doodlebug cannot eat other doodlebugs. 
	 */
	@Override
	public void move() {
		

	}

	/**
	 *  Breed. If a doodlebug survives for eight time steps, then at the end of the time step, 
	 *  it will spawn off a new doodlebug in the same manner as the ant.
	 */
	@Override
	public Doodlebug breed() {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * Starve. If a doodlebug has not eaten an ant within the last three time steps, 
	 * then at the end of the third time step, 
	 * it will starve and die. The doodlebug should then be removed from the grid of cells.
	 */
	public void starve(){
		
	}
	
	@Override
	public String toString() {
		return "Doodlebug at: " + this.location;
	}
	

}
