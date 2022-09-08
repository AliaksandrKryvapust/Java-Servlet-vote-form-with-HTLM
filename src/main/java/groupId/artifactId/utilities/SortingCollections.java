package groupId.artifactId.utilities;

import groupId.artifactId.model.Genres;
import groupId.artifactId.model.Singers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class SortingCollections {
    public static List<Map.Entry<String, Integer>> singersSort() {
        List<Map.Entry<String, Integer>> sortedSingers = new ArrayList<>(Singers.getInstance().getSingers().entrySet());
        sortedSingers.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        return sortedSingers;
    }

    public static List<Map.Entry<String, Integer>> genresSort() {
        List<Map.Entry<String, Integer>> sortedGenres = new ArrayList<>(Genres.getInstance().getGenres().entrySet());
        sortedGenres.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        return sortedGenres;
    }
}
