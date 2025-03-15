package practice.java.concepts.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorPractice {
    /*
    *
    * Comparator is a functional interface used for defining custom sorting logic.
    * It provides methods like comparing, thenComparing, naturalOrder, and reverseOrder to facilitate complex sorting.
    *
    * Concepts Engineers Often Miss:
    *
    * Comparator Chaining: Using thenComparing() to chain multiple sorting criteria.
    *
    * Natural Order and Reverse Order: Leveraging Comparator.naturalOrder() and Comparator.reverseOrder() for sorting.
    */
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(-10, 5, -7, 3, -2);

        // Comparator to sort by absolute value
        Comparator<Integer> absComparator = (a, b) -> Integer.compare(Math.abs(a), Math.abs(b));
        numbers.sort(absComparator);
+

        System.out.println(numbers); // Outputs: [-2, 3, 5, -7, -10]

        List<String> words = Arrays.asList("banana", "apple", "pear", "orange", "grape");

        // Comparator to sort by last character, then by length
        Comparator<String> lastCharComparator = Comparator.comparingInt((String s) -> s.charAt(s.length() - 1))
                .thenComparingInt(String::length);
        words.sort(lastCharComparator);

        // Outputs: [banana, orange, apple, grape, pear]
        System.out.println(words);
    }
}
