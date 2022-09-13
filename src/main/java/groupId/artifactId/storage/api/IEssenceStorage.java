package groupId.artifactId.storage.api;

import java.util.List;

public interface IEssenceStorage<Type> {
    List<Type> get();

    Type get(int id);
}
