package groupId.artifactId.storage.api;

import groupId.artifactId.storage.SingersStorage;

public interface ISingersStorage extends IEssenceStorage<SingersStorage> {
    void save(SingersStorage singer);
}
