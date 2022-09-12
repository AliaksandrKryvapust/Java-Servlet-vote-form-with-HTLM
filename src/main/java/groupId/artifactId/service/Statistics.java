package groupId.artifactId.service;

import groupId.artifactId.model.SortedStatistic;
import groupId.artifactId.model.SortedStatisticsWithVotes;

import java.util.*;

public class Statistics {
    private final Vote vote = new Vote();


    public SortedStatistic sortVotes() {
        List<String> sortedSingers = new ArrayList<>(vote.getAllVoteResults().getSingersVote());
        sortedSingers.sort(Comparator.comparing((i) -> Collections.frequency(sortedSingers, i)).reversed());
        Set<String> uniqueSingerVotes = new LinkedHashSet<>(sortedSingers);
        List<String> sortedGenres = new ArrayList<>(vote.getAllVoteResults().getGenresVote());
        sortedGenres.sort(Comparator.comparing((i) -> Collections.frequency(sortedGenres, i)).reversed());
        Set<String> uniqueGenresVotes = new LinkedHashSet<>(sortedGenres);
        List<String> sortedMessages = new LinkedList<>(vote.getAllVoteResults().getSaveMessages());
        return new SortedStatistic(new LinkedList<>(uniqueSingerVotes), new LinkedList<>(uniqueGenresVotes), sortedMessages);
    }

    public SortedStatisticsWithVotes sortVotesAddScores() {
        Map<String, Integer> sortedSingers = new HashMap<>();
        for (int i = 0; i < vote.getAllVoteResults().getSingersVote().size(); i++) {
            if (!sortedSingers.containsKey(vote.getAllVoteResults().getSingersVote().get(i))) {
                sortedSingers.put(vote.getAllVoteResults().getSingersVote().get(i), 1);
            } else {
                sortedSingers.put(vote.getAllVoteResults().getSingersVote().get(i), sortedSingers.get(vote.getAllVoteResults().getSingersVote().get(i)) + 1);
            }
        }
        Map<String, Integer> sortedGenres = new HashMap<>();
        for (int i = 0; i < vote.getAllVoteResults().getGenresVote().size(); i++) {
            if (!sortedGenres.containsKey(vote.getAllVoteResults().getGenresVote().get(i))) {
                sortedGenres.put(vote.getAllVoteResults().getGenresVote().get(i), 1);
            } else {
                sortedGenres.put(vote.getAllVoteResults().getGenresVote().get(i), sortedGenres.get(vote.getAllVoteResults().getGenresVote().get(i)) + 1);
            }
        }
        Map<String, Integer> sortedSingersVotes = new LinkedHashMap<>();
        Map<String, Integer> sortedGenresVotes = new LinkedHashMap<>();
        List<String> sortedMessages = new LinkedList<>(vote.getAllVoteResults().getSaveMessages());
        sortedSingers.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEachOrdered((i)-> sortedSingersVotes.put(i.getKey(),i.getValue()));
        sortedGenres.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEachOrdered((i)-> sortedGenresVotes.put(i.getKey(),i.getValue()));
        return new SortedStatisticsWithVotes(sortedSingersVotes,sortedGenresVotes,sortedMessages);
    }
}









