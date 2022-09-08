package groupId.artifactId.model;

import java.util.concurrent.ConcurrentHashMap;

public class Singers {
    private static Singers firstInstance = null;
    private final ConcurrentHashMap<String, Integer> singers = new ConcurrentHashMap<>();

    {
        singers.put("Michael Jackson", 0);
        singers.put("Stevie Wonder", 0);
        singers.put("Marvin Gaye", 0);
        singers.put("Freddie Mercury", 0);
    }

    public static Singers getInstance() {
        synchronized (Singers.class) {
            if (firstInstance == null) {
                firstInstance = new Singers();
            }
        }
        return firstInstance;
    }

    public ConcurrentHashMap<String, Integer> getSingers() {
        return singers;
    }

    public void updateSingers(String singer) {
        singers.put(singer, singers.get(singer) + 1);
    }
}
