package chapter7.programmingProjects.alien;

public class AlienMain {
	
	public static void main(String[] args) {
		
		AlienPack pack1 = new AlienPack(3);
		
		SnakeAlien snake = new SnakeAlien("Snakey", 100);
		OgreAlien ogre = new OgreAlien("Oge", 100);
		MarshmallowManAlien man = new MarshmallowManAlien("Human", 100);
		
		pack1.addAlien(snake, 0);
		pack1.addAlien(ogre, 1);
		pack1.addAlien(man, 2);
		
		int damage = pack1.calculateDamage();
		System.out.println("TOtal damage is : " + damage);
	}
	

}
