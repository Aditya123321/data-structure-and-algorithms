package practice.java.leetcode.strings;

public class CharSearchInSubstring {

    public static void main(String[] args) {
        String s = "abcavabavacf";
        String ans = "";
        System.out.println(isPresent(s,'c', s.indexOf("c")));
    }

    public static boolean isPresent(String str, char ch, int i) {

        for(; i <str.length(); i++) {
           if(str.charAt(i) == ch) {
               return true;
           }
        }

        return false;
    }
}
