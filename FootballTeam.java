package CollectionHashMap;

public class FootballTeam {
	private String teamName;
	private int noOfPlayers;
	private String jerseyColor;
	private int cupWon;
	private boolean isInternational;
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public int getNoOfPlayers() {
		return noOfPlayers;
	}
	public void setNoOfPlayers(int noOfPlayers) {
		this.noOfPlayers = noOfPlayers;
	}
	public String getJerseyColor() {
		return jerseyColor;
	}
	public void setJerseyColor(String jerseyColor) {
		this.jerseyColor = jerseyColor;
	}
	public int getCupWon() {
		return cupWon;
	}
	public void setCupWon(int cupWon) {
		this.cupWon = cupWon;
	}
	public boolean getisInternational() {
		return isInternational;
	}
	public void setInternational(boolean isInternational) {
		this.isInternational = isInternational;
	}
	public FootballTeam(String teamName, int noOfPlayers, String jerseyColor, int cupWon, boolean isInternational) {
		super();
		this.teamName = teamName;
		this.noOfPlayers = noOfPlayers;
		this.jerseyColor = jerseyColor;
		this.cupWon = cupWon;
		this.isInternational = isInternational;
	}
	public String toString() {
		return "FootballTeam teamName=" + teamName + ", noOfPlayers=" + noOfPlayers + ", jerseyColor=" + jerseyColor
				+ ", cupWon=" + cupWon + ", isInternational=" + isInternational ;
	}

}
