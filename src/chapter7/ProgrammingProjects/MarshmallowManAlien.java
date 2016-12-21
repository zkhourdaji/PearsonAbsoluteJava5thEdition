package chapter7.ProgrammingProjects;

public class MarshmallowManAlien extends Alien {

	private int damage = 1;
	
	public MarshmallowManAlien(String name, int health) {
		super(name, health);
		// TODO Auto-generated constructor stub
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
			MarshmallowManAlien otherMarshmallowManAlien = (MarshmallowManAlien) obj;
			
			return (super.equals(otherMarshmallowManAlien) && this.damage == otherMarshmallowManAlien.damage);
			
		}
			return false;
			
	}
	
}
