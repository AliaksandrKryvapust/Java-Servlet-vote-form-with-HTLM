package groupId.artifactId.dao;

import groupId.artifactId.storage.Genres;
import groupId.artifactId.storage.VoteResults;

import java.util.List;

public class GenresDao {
    private final Genres genres = Genres.getInstance();

    private final VoteResults voteResults=VoteResults.getInstance();

    public String getGenre(int key) {
        return genres.getGenres().get(key);
    }
    public boolean isKeyValid(int key){
        return genres.getGenres().containsKey(key);
    }
    public void saveGenres(String genres){
        voteResults.setGenresVote(genres);
    }
    public List<String> getGenresVote(){
        return voteResults.getGenresVote();
    }
//    public void addGenres(String genres) throws Exception {
//        for (String values: this.genres.getGenres().values()) {
//            if (values.equals(genres)){
//                throw new Exception("this genre is already exist");
//            }
//        }
//        this.genres.genresUpdate(genres);
//    }
}
