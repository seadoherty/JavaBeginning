package maps;

import java.util.HashMap;

public class BandSongsTest {
	public static void main(String[] args) {

		BandSongs songs = new BandSongs();

		HashMap<String, String> userMap = new HashMap<String, String>();

		userMap.put("nin code ode", "...you bring me closer to Todd...");
		userMap.put("wu code ode", "...code rules everything around me...");
		userMap.put("rage code ode", "...coding in the name of...");
		userMap.put("beastie code ode", "...for your right to cooooode...");

		songs.oneSong(userMap, "nin code ode");
		songs.trackList(userMap);
	}
}