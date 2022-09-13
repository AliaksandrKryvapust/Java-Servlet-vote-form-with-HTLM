package groupId.artifactId.utilities;

import groupId.artifactId.core.entity.SortedStatistic;
import groupId.artifactId.core.entity.SortedStatisticsWithVotes;

public class PrintCollectionsHtml {

    public String sortedPrint(SortedStatistic sortedStatistic) {
        return "The 4 top rated singers are: " + sortedStatistic.getSingersStatistic() +
                "<br> The most popular genres are: " + sortedStatistic.getGenresStatistic() +
                "<br> The list of replies: " + sortedStatistic.getSaveMessages();
    }
    public String sortedPrintWithScores(SortedStatisticsWithVotes sortedStatisticsWithVotes){
        return "The 4 top rated singers are: " + sortedStatisticsWithVotes.getSingersStatistic() +
                "<br> The most popular genres are: " + sortedStatisticsWithVotes.getGenresStatistic() +
                "<br> The list of replies: " + sortedStatisticsWithVotes.getSaveMessages();
    }
}
