package practice.java.leetcode.strings;

public class Permutation {

    public static void main(String[] args) {
        String ques = "abc";
        String ans = "";
        generatePermutation(ques,ans);
    }

    public static void generatePermutation(String ques, String ans) {
        if(ques.length() == 0) {
            System.out.println(ans);
            return;
        }

        for(int i =0; i <ques.length(); i++) {
            char ch = ques.charAt(i);
            String s1 = ques.substring(0,i);
            String s2 = ques.substring(i+1);
            generatePermutation(s1+s2, ans+ch);
        }
    }
}
