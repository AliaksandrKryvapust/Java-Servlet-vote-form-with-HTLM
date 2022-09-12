package groupId.artifactId.dao;

import groupId.artifactId.storage.VoteResults;

import java.util.List;

public class MessagesDao {
    private final VoteResults voteResults= VoteResults.getInstance();
    public void saveMessage(String message){
        voteResults.setSaveMessages(message);
    }
    public List<String> getSaveMessages(){
        return voteResults.getSaveMessages();
    }
}
