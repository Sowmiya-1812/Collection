package CollectionHashMap;

public class Player {
	private String name;
	private int age;
	private int jerseyNumber;
	private String teamPlayed;
	private boolean isRetired;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getJerseyNumber() {
		return jerseyNumber;
	}
	public void setJerseyNumber(int jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	}
	public String getTeamPlayed() {
		return teamPlayed;
	}
	public void setTeamPlayed(String teamPlayed) {
		this.teamPlayed = teamPlayed;
	}
	public boolean getisRetired() {
		return isRetired;
	}
	public void setRetired(boolean isRetired) {
		this.isRetired = isRetired;
	}
	public Player(String name, int age, int jerseyNumber, String teamPlayed, boolean isRetired) {
		super();
		this.name = name;
		this.age = age;
		this.jerseyNumber = jerseyNumber;
		this.teamPlayed = teamPlayed;
		this.isRetired = isRetired;
	}
	@Override
	public String toString() {
		return "Player [name=" + name + ", age=" + age + ", jerseyNumber=" + jerseyNumber + ", teamPlayed=" + teamPlayed
				+ ", isRetired=" + isRetired + "]";
	}
	

}
