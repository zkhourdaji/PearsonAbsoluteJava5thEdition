package chapter8.programmingProjects.predator_prey_simulation;

/**
 * 20 by 20 board for the Organisms to move on.
 * @author ZaferSamir
 *
 */
public class Board {
	
	private int width;
	private int height;
	private Location[][] locations;
	
	public Board(int width, int height) {
		this.width = width;
		this.height = height;
		this.locations = new Location[width][height];
	}
	
	public Board(Board originalBoard) {
		this.width = originalBoard.width;
		this.height = originalBoard.height;
		//TODO: this should be a deep copy!!!
		this.locations = originalBoard.locations;
	}
	
	//TODO: write the display method
	
	/**
	 * the display method will show the locations of the
	 * ants and doodlebugs on the 20 by 20 board.
	 * if a cell doesnt have anything on it, it should be blank.
	 */
	public void display(){
		
	}
	
	/*
	 * TODO:
	 * this method will update the board 
	 * according to the actions of the organisms
	 * 
	 */
	public void update(){
		
	}
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return new Board(this);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Location[][] getLocations() {
		Location[][] copy = new Location[this.width][this.height];
		System.arraycopy(this.locations, 0, copy, 0, this.locations.length);;
		return copy;
	}

	public void setLocations(Location[][] locations) {
		this.locations = locations;
	}
	
	
	

}
