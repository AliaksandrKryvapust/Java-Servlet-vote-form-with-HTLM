package groupId.artifactId.storage;

import java.util.HashMap;
import java.util.Map;

public class Genres {
    private Integer key =1;
    private static Genres firstInstance = null;
    private final Map<Integer, String> genres = new HashMap<>();
    {
        genres.put(key, "Rock");
        key++;
        genres.put(key, "Jazz");
        key++;
        genres.put(key, "Electronic Dance Music");
        key++;
        genres.put(key, "Dub-step");
        key++;
        genres.put(key, "Techno");
        key++;
        genres.put(key, "Rhythm and Blues");
        key++;
        genres.put(key, "Country");
        key++;
        genres.put(key, "Pop");
        key++;
        genres.put(key, "Alternative Rock");
        key++;
        genres.put(key, "Classical music");
        key++;
    }
    public static Genres getInstance() {
        synchronized (Genres.class) {
            if (firstInstance == null) {
                firstInstance = new Genres();
            }
        }
        return firstInstance;
    }

    public Map<Integer, String> getGenres() {
        return genres;
    }
//    public void genresUpdate(String singer) {
//        firstInstance.genres.putIfAbsent(firstInstance.key, singer);
//        firstInstance.key++;
//    }
}
