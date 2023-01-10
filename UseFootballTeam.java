package CollectionHashMap;

import java.util.HashMap;

public class UseFootballTeam {
	public static void main(String[] args) {
		FootballTeam ft1 = new FootballTeam("OrangeTeam",9,"Orange",5,true);
		FootballTeam ft2 = new FootballTeam("RedTeam",8,"Red",3,false);
		FootballTeam ft3 = new FootballTeam("YellowTeam",7,"Yellow",2,true);
		FootballTeam ft4 = new FootballTeam("BlackTeam",12,"Black",1,false);
		FootballTeam ft5 = new FootballTeam("BlueTeam",11,"Blue",7,true);
		HashMap<String,FootballTeam>teams = new HashMap<>();
		teams.put(ft1.getTeamName(),ft1);
		teams.put(ft2.getTeamName(),ft2);
		teams.put(ft3.getTeamName(),ft3);
		teams.put(ft4.getTeamName(),ft4);
		teams.put(ft5.getTeamName(),ft5);
		//for(String x : teams.keySet() ) {
			//System.out.println(teams.get(x));
//		for(FootballTeam t : teams.values()) {
//			if(t.getCupWon()>3) {
//				System.out.println(t);
//			}
		//}
		teams.values().forEach(x->{
		if(x.getisInternational()==true) {
			System.out.println(x.getTeamName()+" is International team");
		}
		else {
			System.out.println(x.getTeamName()+" is local team");
			
		}
		});
		
		
		
		
	}

}
