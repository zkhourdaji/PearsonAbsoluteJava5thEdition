package chapter8.programmingProjects.predator_prey_simulation;


/**
 * Abstract class in which I will create the Ant and the 
 * Doodlebug class.
 * 
 * 
 * @author ZaferSamir
 *
 */
public abstract class Organism {

	
	private boolean status; //true => alive
	protected Location location;
	
	
	public Organism(Location location) {
		this.location = location;
		this.status = true;
	}
	
	
	public abstract void move();
	
	public abstract Organism breed();
	
}
