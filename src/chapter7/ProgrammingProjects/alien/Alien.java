package chapter7.programmingProjects.alien;

public class Alien {
	
	private int health;
	private String name;
	
	public Alien(String name, int health) {
		
		this.name = name;
		this.health = health;
	}
	
	public int getHealth(){
		return this.health;
	}
	
	public String getName(){
		return this.name;
	}
	
	
	@Override
	public String toString() {
		
		return ("Alien Name: " + this.name + " Health: " + this.health);
	}
	
	
	@Override
	public boolean equals(Object obj) {
		
		if (this.getClass() == obj.getClass()){
			Alien otherAlien = (Alien) obj;
			return (this.getName().equals(otherAlien.getName())
					&& this.getHealth() == otherAlien.getHealth());
		}
		return false;
	}

}
