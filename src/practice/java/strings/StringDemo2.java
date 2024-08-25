package practice.java.strings;

public class StringDemo2 {

    public static void main(String[] args) {

        //2 ways of creating strings

        //way 1
        String s1 = "Hello";
        String s2 = "Hello";

        //way 2
        String s3 = new String("Hello");
        String s4 = new String("Hello");

        String s5 = new String("Hello ");

        // == compares the address of the variables
        //consider the example below

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s3 == s4);

        //but to check the content of the String variables with each other
        //then use String's internal method "equals()"

        System.out.println(s3.equals(s4));
        System.out.println(s3.equals(s5));
    }

    public static boolean equals(String s1, String s2) {
        //use case 1 : if both strings are in string pool
        // then first compare if address is same
         if(s1 == s2) {
             return true;
         }
        //use case 2 :
        //if strings have different addresses

        if(s1.length() != s2.length()) {
           return false;
        }

        for(int i =0; i < s1.length(); i ++) {
            if(s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
