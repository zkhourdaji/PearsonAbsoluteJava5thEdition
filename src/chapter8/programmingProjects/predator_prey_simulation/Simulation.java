package chapter8.programmingProjects.predator_prey_simulation;

import java.util.Random;

/**
 * This class represent the entire simulation.
 * It has information about everything; the board and 
 * all the organisms.
 * 
 * @author ZaferSamir
 *
 */
public class Simulation {
	
	private Board Board;
	private Organism[] organisms;
	private Ant[] ants;
	private Doodlebug[] doodlebugs;
	private int numberOfAnts, numberOfDoodlebugs;
	private Location[] locationsTaken;
	
	
	public Simulation(Board board, Organism[] organisms) {
		this.Board = board;
		this.organisms = organisms;
		
	}
	
	public Simulation(int numberOfAnts, int numberOfDoodlebugs) {
		this.Board = new Board(20, 20);
		this.ants = new Ant[numberOfAnts];
		this.doodlebugs = new Doodlebug[numberOfDoodlebugs];
		this.locationsTaken = new Location[numberOfAnts + numberOfDoodlebugs];
	}
	
	public void createOrganisms(int numberOfAnts, int numberOfDoodlebugs){
		
		Random r = new Random();
		
		for (int i = 0; i < ants.length; i++){
			Location tryLocation = new Location(r.nextInt(this.Board.getWidth() - 1), 
					r.nextInt(this.Board.getHeight() - 1));
			
			// check to see if the location is occupied
			for (int j = 0; j < locationsTaken.length; j++){
				if (locationsTaken[i] == tryLocation){
					tryLocation = new Location(r.nextInt(this.Board.getWidth() - 1), 
							r.nextInt(this.Board.getHeight() - 1));
					j = 0;
				}
			}
			
			this.locationsTaken[i] = tryLocation;
			this.ants[i] = new Ant(tryLocation);
			
		}
		
		// display the ants
		for (int i = 0; i < ants.length; i++){
			System.out.println(this.ants[i]);
		}
		
		for (int i = 0; i < doodlebugs.length; i++){
			Location tryLocation = new Location(r.nextInt(this.Board.getWidth() - 1), 
					r.nextInt(this.Board.getHeight() - 1));
			
			// check to see if the location is occupied
			for (int j = 0; j < locationsTaken.length; j++){
				if (locationsTaken[i] == tryLocation){
					tryLocation = new Location(r.nextInt(this.Board.getWidth() - 1), 
							r.nextInt(this.Board.getHeight() - 1));
					j = 0;
				}
			}
			
			this.locationsTaken[i] = tryLocation;
			this.doodlebugs[i] = new Doodlebug(tryLocation);
			
		}
		
		for (int i = 0; i < doodlebugs.length; i++){
			System.out.println(this.doodlebugs[i]);
		}
		
		
		
	}
	
	
	
	
	
	public void startSimulation(){
		
		/*
		 * TODO: 
		 * 1- create the board
		 * 2- add the locations to the board with the organisms in them
		 * *  LOOP STARTS HERE*
		 * 3- use hits enter for a time step
		 * 4- update the board 
		 * 5- display it again
		 */
		
	}
	
	private void update(){
		
	}

}
