package chapter8.programmingProjects.predator_prey_simulation;

public class Ant extends Organism {

	
	public Ant(Location location) {
		super(location);
	}

	/**
	 *  Move. Every time step, randomly try to move up, down, left, or right. 
	 *  If the cell in the selected direction is occupied or would move the ant off the grid, 
	 *  then the ant stays in the current cell.
	 */
	@Override
	public void move() {
		

	}
	
	/**
	 * Breed. If an ant survives for three time steps, 
	 * then at the end of the third time step (i.e., after moving), the ant will breed. 
	 * This is simulated by creating a new ant in an adjacent (up, down, left, or right) 
	 * cell that is empty. If there is no empty cell available, no breeding occurs. 
	 * Once an offspring is produced, the ant cannot produce an offspring until three more 
	 * time steps have elapsed.
	 */
	public Ant breed(){
		return null;
	}
	
	@Override
	public String toString() {
		return "Ant at: " + this.location;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	

}
