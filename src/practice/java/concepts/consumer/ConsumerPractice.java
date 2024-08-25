package practice.java.concepts.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerPractice {

    /*
    *
    * Consumer is a functional interface that represents an operation
    * that takes a single input argument and returns no result.
    * It is typically used for operations like printing or modifying data.
    * Concepts Engineers Often Miss:
    *
    * Chaining Consumers: Using the andThen() method to chain multiple consumers.
    *
    * Side Effects: Understanding that consumers are meant for operations with side effects,
    *  such as modifying an object or printing data.
    */

    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Tom");

        Consumer<String> appendStr = (name) -> System.out.print(name + " Smith ");
        Consumer<String> toUpperCase = (name) -> System.out.println(name.toUpperCase());

        // Chaining consumers
        names.forEach(appendStr.andThen(toUpperCase));
    }
}
