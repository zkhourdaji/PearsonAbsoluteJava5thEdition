package chapter7.ProgrammingProjects;

import chapter7.isADemo;

public class AlienPack {
	
	private Alien[] aliens;
	
	public AlienPack(int numberOfAliens){
		
		this.aliens = new Alien[numberOfAliens];
		
	}
	
	public void addAlien(Alien newAlien, int index){
		
		try {
			this.aliens[index] = newAlien;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Can not add alien");
			
		}
	}
	
	public Alien[] getAliens(){
		return this.aliens;
	}
	
	public int calculateDamage(){
		
		int totalDamage = 0;
		
		for (int i = 0; i < this.aliens.length; i++){
			
			if (this.aliens[i] instanceof SnakeAlien ){
				SnakeAlien snake = (SnakeAlien) this.aliens[i];
				totalDamage += snake.getDamage();
			}
			else if (this.aliens[i] instanceof OgreAlien ){
				OgreAlien Ogre = (OgreAlien) this.aliens[i];
				totalDamage += Ogre.getDamage();
			}
			else if (this.aliens[i] instanceof MarshmallowManAlien ){
				MarshmallowManAlien MarshmallowMan = (MarshmallowManAlien) this.aliens[i];
				totalDamage += MarshmallowMan.getDamage();
			}
				
		}
		return totalDamage;
	}
	
	@Override
	public String toString() {
		
		String returnedString = "";
		
		for (int i = 0; i < this.aliens.length; i++){
			returnedString += this.aliens[i].toString() + "\n";
		}
		
		return returnedString;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (this.getClass() == obj.getClass()){
			AlienPack otherAlienPack = (AlienPack) obj;
			if (this.aliens.length != otherAlienPack.aliens.length)
				return false;
			
			for (int i = 0; i < this.aliens.length; i++){
				if (!this.aliens[i].equals(otherAlienPack.aliens[i]))
						return false;
			}
		}
		return false;
	}
	

}
