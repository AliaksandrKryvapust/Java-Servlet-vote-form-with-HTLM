package groupId.artifactId.model;

import java.util.LinkedList;
import java.util.List;

public class SortedStatistic {
    private final List<String> singersStatistic;
    private final List<String> genresStatistic;
    private final List<String> saveMessages;

    public SortedStatistic( LinkedList<String> singersStatistic, LinkedList<String> genresStatistic, List<String> saveMessages) {
        this.singersStatistic = new LinkedList<> (singersStatistic);
        this.genresStatistic = new LinkedList<> (genresStatistic);
        this.saveMessages = new LinkedList<>(saveMessages);
    }

    public List<String> getSingersStatistic() {
        return singersStatistic;
    }

    public List<String> getGenresStatistic() {
        return genresStatistic;
    }

    public List<String> getSaveMessages() {
        return saveMessages;
    }
}
