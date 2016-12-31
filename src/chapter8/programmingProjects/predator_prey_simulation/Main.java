package chapter8.programmingProjects.predator_prey_simulation;

public class Main {
	
	public static void main(String[] args) {
		
		Simulation simulation = new Simulation(10,10);
		
		
		//simulation.startSimulation();
		simulation.createOrganisms(10, 0);
	}

}
