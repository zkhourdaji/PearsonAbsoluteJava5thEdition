package chapter5.ProgrammingProjects;

public class TeamMain {

	public static void main(String[] args) {
		
		Competition competition1 = new Competition("360 No Scope", 2010, "Legacy", "NoOne");
		Competition competition2 = new Competition("420 Blaze It", 2010, "NoOne", "Legacy");
		
		
		Team team1 = new Team("Legacy", "mem1", "mem2", "mem3", "mem4", 
				competition1, competition2);
		
		System.out.println(team1);
		
		Team team2 = new Team(team1);
		//team2.setCompetition1(competition1);
		
		//System.out.println(team1);
		//System.out.println("----------------------");
		//System.out.println(team2);
	}
}
