package maps;

import java.util.HashMap;
import java.util.Set;

public class BandSongs {

	void oneSong(HashMap<String, String> setlist, String title) {
		String lyrics = setlist.get(title);
		System.out.println(lyrics);
	}

	void trackList(HashMap<String, String> setlist) {

		Set<String> songs = setlist.keySet();

		for (String key : songs) {
			System.out.println(key + ": " + setlist.get(key));
		}
	}
}