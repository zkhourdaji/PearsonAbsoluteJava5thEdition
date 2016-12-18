package chapter5.ProgrammingProjects;

public class Competition {

	
	private String competitionName;
	private String winningTeamName;
	private String runnerUpTeamName;
	private int competitionYear;
	
	public Competition(String name, int year, String winnerName, String loserName) {
		
		this.competitionName = name;
		this.competitionYear = year;
		this.winningTeamName = winnerName;
		this.runnerUpTeamName = loserName;
	}
	
	
	public Competition(Competition copyCompetition) {
		
		this.competitionName = copyCompetition.competitionName;
		this.competitionYear = copyCompetition.competitionYear;
		
		this.winningTeamName = copyCompetition.winningTeamName;
		this.runnerUpTeamName = copyCompetition.runnerUpTeamName;
	}

	
	public String toString() {
		return this.competitionName + " " + this.competitionYear
				+ "\nWinning team: " + this.winningTeamName
				+ "\nRunner up team: " + this.runnerUpTeamName;
	}
	

	public String getCompetitionName() {
		return competitionName;
	}


	public void setCompetitionName(String competitionName) {
		this.competitionName = competitionName;
	}


	public String getWinningTeamName() {
		return winningTeamName;
	}


	public void setWinningTeamName(String winningTeamName) {
		this.winningTeamName = winningTeamName;
	}


	public String getRunnerUpTeamName() {
		return runnerUpTeamName;
	}


	public void setRunnerUpTeamName(String runnerUpTeamName) {
		this.runnerUpTeamName = runnerUpTeamName;
	}


	public int getCompetitionYear() {
		return competitionYear;
	}


	public void setCompetitionYear(int competitionYear) {
		this.competitionYear = competitionYear;
	}
	
}
