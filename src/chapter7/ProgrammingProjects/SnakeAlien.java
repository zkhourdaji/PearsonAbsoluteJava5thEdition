package chapter7.ProgrammingProjects;

public class SnakeAlien extends Alien {

	private int damage = 10;
	
	public SnakeAlien(String name, int health) {
		super(name, health);
	}
	
	public int getDamage(){
		return this.damage;
	}
	
	

}
