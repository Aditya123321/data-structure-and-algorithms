package practice.java.strings;

public class StringDemo1 {

    public static void main(String[] args) {

        //2 ways of creating strings

        //way 1
        String s1 = "Hello";
        String s2 = "Hello";

        //way 2
        String s3 = new String("Hello");
        String s4 = new String("Hello");

        //concatenation internally creates new string with
        // new key word and hence it is created outside of string pool

        s1 =  s1 + "World";
        //or
        s1 = s1.concat(s3); //equivalent to s1 +s3
        //the new s1 will be out of String pool

        //hashcode : hashcode is numerical val of the content and not the address of the value

        //if any class has toString() implemented then the variables of array or
        // classes with internal application of array(String uses char array), it would print the value and not the starting address of the array(value)

        //example of String being a char array
        //use charAt(index) to get the character at that index

        System.out.println(s1.charAt(5));


    }
}
