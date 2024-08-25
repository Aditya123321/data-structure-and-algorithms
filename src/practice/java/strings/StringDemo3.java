package practice.java.strings;

public class StringDemo3 {

    public static void main(String[] args) {


        System.out.println("Hello" + 10 + 20 + "Bye");
        //since it start with string and anything that gets added after it will be treated as string

        //example
        //since below it start with int so it will get added and then when string comes it will get treated as string
        System.out.println(10 + 20 + "Hello" + "Bye");

        //use case: bodmas will be given pref
        System.out.println("Hello" + (10 + 20) + "Bye");
    }
}
