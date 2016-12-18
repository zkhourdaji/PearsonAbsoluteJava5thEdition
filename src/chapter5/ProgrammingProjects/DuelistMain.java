package chapter5.ProgrammingProjects;

public class DuelistMain {

	public static void main(String[] args) {

		Duelist Aaron = new Duelist("Aaron", 1.0/3);
		Duelist Bob = new Duelist("Bob", 1.0/2);
		Duelist Charlie = new Duelist("Charlie", 1.0/1);

		boolean aaronIntentionallyMissFirstShot = false,
				bobIntentionallyMissFirstShot = false,
				charlieIntentionallyMissFirstShot = false;

		int numberOfRounds = 5000;

		int aaronWins = 0, 
				bobWins = 0, 
				charlieWins = 0;


		for (int i = 0; i < numberOfRounds; i++){

			while(Duelist.getNumberOfAliveDuelists() != 1 ){

				if (!aaronIntentionallyMissFirstShot){
					if (Aaron.isAlive() && Charlie.isAlive())
						Aaron.shootAtTarget(Charlie);
					else if (Aaron.isAlive() && Charlie.isDead())
						Aaron.shootAtTarget(Bob);
				}
				
				aaronIntentionallyMissFirstShot = false;

				if (!bobIntentionallyMissFirstShot){
					if (Bob.isAlive() && Charlie.isAlive())
						Bob.shootAtTarget(Charlie);
					else if (Bob.isAlive() && Charlie.isDead())
						Bob.shootAtTarget(Aaron);
				}
				
				bobIntentionallyMissFirstShot = false;
				
				if (!charlieIntentionallyMissFirstShot){
					if (Charlie.isAlive() && Bob.isAlive())
						Charlie.shootAtTarget(Bob);
					else if (Charlie.isAlive() && Bob.isDead())
						Charlie.shootAtTarget(Aaron);
				}
				charlieIntentionallyMissFirstShot = false;

			}
			System.out.println();
			if (Aaron.isAlive()){
				aaronWins++;
				System.out.println("Last man standing: " + Aaron.getName());
			}
			else if (Bob.isAlive()){
				bobWins++;
				System.out.println("Last man standing: " + Bob.getName());
			}

			if (Charlie.isAlive()){
				charlieWins++;
				System.out.println("Last man standing: " + Charlie.getName());
			}

			System.out.println("---------RESPAWNING EVERYONE---------");
			Aaron.respawn();
			Bob.respawn();
			Charlie.respawn();
		}

		System.out.println("Aaron wins " + aaronWins * 100.0 / numberOfRounds + "%");
		System.out.println("Bob wins " + bobWins * 100.0 / numberOfRounds + "%");
		System.out.println("Charlie wins " + charlieWins * 100.0 / numberOfRounds + "%");

	}

}
