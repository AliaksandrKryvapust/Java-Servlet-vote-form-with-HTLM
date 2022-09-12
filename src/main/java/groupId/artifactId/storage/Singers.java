package groupId.artifactId.storage;

import java.util.HashMap;
import java.util.Map;

public class Singers {
    private Integer key = 1;
    private static Singers firstInstance = null;
    private final Map<Integer, String> singers = new HashMap<>();
     {
        singers.put(key, "Michael Jackson");
        key++;
        singers.put(key, "Stevie Wonder");
        key++;
        singers.put(key, "Marvin Gaye");
        key++;
        singers.put(key, "Freddie Mercury");
        key++;
    }
    public static Singers getInstance() {
        synchronized (Singers.class) {
            if (firstInstance == null) {
                firstInstance = new Singers();
            }
        }
        return firstInstance;
    }

    public Map<Integer, String> getSingers() {
        return singers;
    }

//    public void singersUpdate(String singer) {
//        firstInstance.singers.putIfAbsent(firstInstance.key, singer);
//        firstInstance.key++;
//    }
}
