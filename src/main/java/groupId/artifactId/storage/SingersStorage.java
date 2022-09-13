package groupId.artifactId.storage;

import groupId.artifactId.storage.api.ISingersStorage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SingersStorage implements ISingersStorage {
    private Integer key = 1;
    private static SingersStorage firstInstance = null;
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
    public static SingersStorage getInstance() {
        synchronized (SingersStorage.class) {
            if (firstInstance == null) {
                firstInstance = new SingersStorage();
            }
        }
        return firstInstance;
    }

    public Map<Integer, String> getSingers() {
        return singers;
    }

    @Override
    public List<SingersStorage> get() {
        return null;
    }

    @Override
    public SingersStorage get(int id) {
        return null;
    }

    @Override
    public void save(SingersStorage singer) {

    }
}
