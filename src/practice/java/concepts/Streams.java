package practice.java.concepts;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Streams {

    /*
    *Streams provide a high-level abstraction for processing sequences of elements.
    * Java 8 streams support operations such as map, filter, reduce, collect, and forEach.
    *
    * Concepts Engineers Often Miss:
    *
    * Intermediate vs. Terminal Operations: Intermediate operations (like map, filter) are lazy and return a stream,
    * while terminal operations (like forEach, collect) are eager and consume the stream.
    *
    * Stream Reusability: Streams cannot be reused after a terminal operation.
    */
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Tom", "Tim" , null, "");

        // Finding the first name that starts with "J" and has more than 3 letters
        Optional<String> result = names.stream()
                .filter(name -> name.startsWith("J"))
                .filter(name -> name.length() > 3)
                .findFirst();

        result.ifPresent(System.out::println); // Outputs: John

        List<String> words = Arrays.asList("apple", "banana", "pear");

        // Using map to convert a list of strings to a list of their lengths
        List<Integer> lengths = words.stream()
                .map(String::length)
                .collect(Collectors.toList());

        System.out.println(lengths); // Outputs: [5, 6, 4]


    }
}
