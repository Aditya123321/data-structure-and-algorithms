package practice.java.strings;

import java.util.Arrays;

public class GoodString {

    public static void main(String[] args) {

        String word = "cbaeicdekprtfvaeiou";

        System.out.println(goodString(word));

    }

    public static int goodString(String s) {
        int count = 0;
        int ans = 0;
        for( int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(isVowel(ch)) {
                count++;
            } else {
                ans = Math.max(ans, count);
                count = 0;
            }
        }

        ans = Math.max(ans, count);
        return ans;
    }

    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }


    
}
