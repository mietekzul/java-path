import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class SortingDemo {
    private List<String> sampleStrings = Arrays.asList("this", "is", "a", "list", "of", "strings");

    public List<String> alphaSort() {
        Collections.sort(sampleStrings);
        return sampleStrings;
    }

    public List<String> alphaSortUsingStreams() {
        return sampleStrings.stream().sorted().collect(toList());
    }

    public List<String> lengthReverseSortWithComparator() {
        Collections.sort(sampleStrings, Comparator.comparing(String::length).reversed());
        return sampleStrings;
    }
}
