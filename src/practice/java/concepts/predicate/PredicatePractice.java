package practice.java.concepts.predicate;

import java.util.function.Predicate;

public class PredicatePractice {
    /*
    * Predicate is a functional interface representing a single argument
    * function that returns a boolean value.
    * It is commonly used for filtering data in streams and collections.
    *
    */

    public static void main(String[] args) {
        Predicate<Integer> isNegative = (x) -> x<0;
        Predicate<Integer> isGreaterThanTen = (x) -> x>10;

        //combining the predicates using or
        Predicate<Integer> isNegativeOrisGreaterThanTen = isNegative.or(isGreaterThanTen);

        System.out.println(isNegativeOrisGreaterThanTen.test(-20));
        System.out.println(isNegativeOrisGreaterThanTen.test(2));
    }
}
