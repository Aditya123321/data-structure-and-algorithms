package practice.java.strings;

import java.util.Arrays;

public class ReverseWords {

    public static void main(String[] args) {

        String words = "      the sky   is   blue     ";

        reverseWords(words);

    }

    public static void reverseWords(String words) {
        //omit multiple spaces
        //trim() removes leading and trailing spaces from the string and not the spaces in between the string
        System.out.println(words.trim());
        words = words.trim();

        //split the array on the basis of multiple spaces
        //keep "\s+" as regex to split on the basis of multiple spaces
        //\s is for space and + is for multiple of it
        String [] arr = words.split(" +");
        System.out.println(Arrays.toString(arr));

        String reversedWord = "";
        for(int i = arr.length-1; i>=0; i--) {
            reversedWord = reversedWord + arr[i] + " ";
        }

        reversedWord = reversedWord.trim();

        System.out.println(reversedWord);
    }


    
}
