package groupId.artifactId.utilities;

import groupId.artifactId.model.Messages;

public class PrintCollectionsHtml {
    public static String sortedPrint() {
        return "The 4 top rated singers are: " + SortingCollections.singersSort() +
                "<br> The most popular genres are: " + SortingCollections.genresSort() +
                "<br> The list of replies: " + Messages.getInstance().getMessages();
    }
}
