package practice.java.concepts.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LambdasBasics {

    public static void main(String[] args) {


        List<String> names = Arrays.asList("Aditya", "Saurav", "Ahitagnee");
        //Type inference
        names.forEach(System.out::println);

        //conventional way
        names.forEach(name -> System.out.println(name));


        //another example of using method reference
        Predicate<String> checkString = String::isEmpty;

        System.out.println(checkString.test("Aditya"));

    }
}