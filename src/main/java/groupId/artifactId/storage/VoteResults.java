package groupId.artifactId.storage;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class VoteResults {
    private static VoteResults firstInstance = null;
    private final List<String> singersVote = new ArrayList<>();
    private final List<String> genresVote = new ArrayList<>();
    private final List<String> saveMessages = new LinkedList<>();

    public static VoteResults getInstance() {
        synchronized (VoteResults.class) {
            if (firstInstance == null) {
                firstInstance = new VoteResults();
            }
        }
        return firstInstance;
    }

    public List<String> getSingersVote() {
        return singersVote;
    }

    public List<String> getGenresVote() {
        return genresVote;
    }

    public List<String> getSaveMessages() {
        return saveMessages;
    }

    public void setSingersVote(String singer) {
        firstInstance.singersVote.add(singer);
    }

    public void setGenresVote(String genres) {
        firstInstance.genresVote.add(genres);
    }

    public void setSaveMessages(String messages) {
        firstInstance.saveMessages.add(messages);
    }
}
