package groupId.artifactId.model;

import java.util.concurrent.ConcurrentHashMap;

public class Genres {
    private static Genres firstInstance = null;
    private final ConcurrentHashMap<String, Integer> genres = new ConcurrentHashMap<>();

    {
        genres.put("Rock", 0);
        genres.put("Jazz", 0);
        genres.put("Electronic Dance Music", 0);
        genres.put("Dub-step", 0);
        genres.put("Techno", 0);
        genres.put("Rhythm and Blues", 0);
        genres.put("Country", 0);
        genres.put("Pop", 0);
        genres.put("Alternative Rock", 0);
        genres.put("Classical music", 0);
    }

    public static Genres getInstance() {
        synchronized (Genres.class) {
            if (firstInstance == null) {
                firstInstance = new Genres();
            }
        }
        return firstInstance;
    }

    public ConcurrentHashMap<String, Integer> getGenres() {
        return genres;
    }

    public void updateGenres(String[] strArr) {
        for (String str : strArr) {
            genres.put(str, genres.get(str) + 1);
        }
    }
}
