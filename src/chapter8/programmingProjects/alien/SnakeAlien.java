package chapter8.programmingProjects.alien;

public class SnakeAlien extends Alien {

	private int damage = 10;
	
	public SnakeAlien(String name, int health) {
		super(name, health);
	}
	
	public int getDamage(){
		return this.damage;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Damage: " + this.damage;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (this.getClass() == obj.getClass()){
			SnakeAlien otherSnakeAlien = (SnakeAlien) obj;
			
			return (super.equals(otherSnakeAlien) && this.damage == otherSnakeAlien.damage);
			
		}
			return false;
			
	}
	
	
	

}
