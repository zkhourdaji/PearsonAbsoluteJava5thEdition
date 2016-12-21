package chapter7.ProgrammingProjects;

public class OgreAlien extends Alien{
	
	private int damage = 6;

	
	public OgreAlien(String name, int health) {
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
			OgreAlien otherOgreAlien = (OgreAlien) obj;
			
			return (super.equals(otherOgreAlien) && this.damage == otherOgreAlien.damage);
			
		}
			return false;
			
	}
	

}
