package groupId.artifactId.dao;

import groupId.artifactId.storage.SingersStorage;
import groupId.artifactId.storage.VoteResults;

import java.util.List;
import java.util.Map;

public class SingersDao {
    private final SingersStorage singer = SingersStorage.getInstance();
    private final VoteResults voteResults = VoteResults.getInstance();

    public String getSinger(int key) {
        return singer.getSingers().get(key);
    }

    public boolean isKeyValid(int key) {
        return singer.getSingers().containsKey(key);
    }

    public void saveSingers(String str) {
        voteResults.setSingersVote(str);
    }

    public List<String> getSingersVotes() {
        return voteResults.getSingersVote();
    }
    public Map<Integer,String> getDataForHtml(){
        return singer.getSingers();
    }
//    public void addSingers(String str) throws Exception {
//        for (String values: singer.getSingers().values()) {
//            if (values.equals(str)){
//                throw new Exception("this singer is already exist");
//            }
//        }
//         singer.singersUpdate(str);
//    }
}
