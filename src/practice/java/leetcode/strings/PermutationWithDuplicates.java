package practice.java.leetcode.strings;

public class PermutationWithDuplicates {

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
            //check for duplicates, if not present then use the existing logic
            if(!CharSearchInSubstring.isPresent(ques, ch, i+1)){
                String s1 = ques.substring(0,i);
                String s2 = ques.substring(i+1);
                generatePermutation(s1+s2, ans+ch);
            }

        }
    }
}
