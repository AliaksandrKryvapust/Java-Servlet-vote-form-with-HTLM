package groupId.artifactId.storage.api;

import groupId.artifactId.storage.Genres;

public interface IGenresStorage extends IEssenceStorage<Genres>{
    void save(Genres genre);
}
