package chapter5.programmingProjects;

public class Team {

	private String teamName;
	private String teamMember1, teamMember2, 
	teamMember3, teamMember4;
	private Competition competition1, competition2;




	public String toString() {
		return "Team Name " + this.teamName + "\n"
				+ "Members: " + this.teamMember1 + " " + teamMember2 + " "
				+ this.teamMember3 + " " + this.teamMember4 + "\n"
				+ "Competitions info: \n" + this.competition1 + "\n"
				+ this.competition2;
	}


	public Team(String teamName, String member1, String member2,
			String member3, String member4, Competition comp1, Competition comp2) {

		this.teamName = teamName;
		this.teamMember1 = member1;
		this.teamMember2 = member2;
		this.teamMember3 = member3;
		this.teamMember4 = member4;
		this.competition1 = new Competition(comp1);
		this.competition2 = new Competition(comp2);
	}


	public Team(Team copyTeam) {

		this.teamName = copyTeam.teamName;
		this.teamMember1 = copyTeam.teamMember1;
		this.teamMember2 = copyTeam.teamMember2;
		this.teamMember3 = copyTeam.teamMember3;
		this.teamMember4 = copyTeam.teamMember4;

		this.competition1 = new Competition(copyTeam.competition1);
		this.competition2 = new Competition(copyTeam.competition2);
	}


	public String getTeamName() {
		return teamName;
	}


	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}


	public String getTeamMember1() {
		return teamMember1;
	}


	public void setTeamMember1(String teamMember1) {
		this.teamMember1 = teamMember1;
	}


	public String getTeamMember2() {
		return teamMember2;
	}


	public void setTeamMember2(String teamMember2) {
		this.teamMember2 = teamMember2;
	}


	public String getTeamMember3() {
		return teamMember3;
	}


	public void setTeamMember3(String teamMember3) {
		this.teamMember3 = teamMember3;
	}


	public String getTeamMember4() {
		return teamMember4;
	}


	public void setTeamMember4(String teamMember4) {
		this.teamMember4 = teamMember4;
	}


	public Competition getCompetition1() {
		return new Competition(this.competition1);
	}


	public void setCompetition1(Competition competition1) {
		this.competition1 = competition1;
	}


	public Competition getCompetition2() {
		return new Competition(this.competition2);
	}


	public void setCompetition2(Competition competition2) {
		this.competition2 = competition2;
	}


}
