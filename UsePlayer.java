package CollectionHashMap;

import java.util.HashMap;
import java.util.Iterator;

public class UsePlayer {
	public static void main(String[] args) {
		Player p1 = new Player("Virat",35,12,"India",false);
		Player p2 = new Player("Dhoni",55,7,"Pakistan",true);
		Player p3 = new Player("Raghul",45,11,"WestBengal",false);
		Player p4 = new Player("Bravo",30,16,"Africa",false);
		Player p5 = new Player("Sachin",60,4,"Bangladesh",true);
		HashMap<String,Player>players = new HashMap<>();
		players.put(p1.getName(),p1);
		players.put(p2.getName(),p2);
		players.put(p3.getName(),p3);
		players.put(p4.getName(),p4);
		players.put(p5.getName(),p5);
		Iterator<Player> x = players.values().iterator();
		while(x.hasNext()) {
			Player temp=x.next();
			if(temp.getisRetired()==true) {

			System.out.println(temp);
							x.remove();
			}
		}
		players.values().forEach(y->System.out.println(y));
		
		
		while(x.hasNext()) {
			Player temp = x.next();
			if(temp.getisRetired()==true) {
				//System.out.println(temp);
				x  .remove();
			}
		}
	//	players.values().forEach(y->System.out.println(y));
	}

}
