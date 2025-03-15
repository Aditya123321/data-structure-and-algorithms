package practice.java.backtracking;

public class KeyPad {

    public static String[] key = {"","","abc","def", "ghi", "jkl", "mno","pqrs", "tuv", "wxyz"};
    public static void main(String[] args) {

    }

    public static void print(String ques, String ans) {
        if(ques.length() == 0) {
            System.out.println(ans);
            return;
        }
        char ch = ques.charAt(0);
        String press = key[ch-48]; //or can be written as key[ch-'0']
        // basically using the ASCII value to convert char to number

        for(int i=0; i< press.length(); i++) {
            print(ques.substring(1), ans+press.charAt(i));
        }
    }
}
