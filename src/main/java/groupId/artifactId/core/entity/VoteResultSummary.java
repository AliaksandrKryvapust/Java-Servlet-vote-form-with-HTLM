package groupId.artifactId.core.entity;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class VoteResultSummary {
    private final List<String> singersVote;
    private final List<String> genresVote;
    private final List<String> saveMessages;

    public VoteResultSummary(List<String> singersVote, List<String> genresVote, List<String> saveMessages) {
        this.singersVote = new ArrayList<>(singersVote);
        this.genresVote=new ArrayList<>(genresVote);
        this.saveMessages=new LinkedList<>(saveMessages);
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
}
