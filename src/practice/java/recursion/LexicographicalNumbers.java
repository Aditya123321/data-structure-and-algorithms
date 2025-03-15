package practice.java.recursion;

public class LexicographicalNumbers {

    public static void main(String[] args) {
       int curr = 0;
       int n = 1000;
        lexicographicalNumber(n,curr);
    }

    public static void lexicographicalNumber(int n, int curr) {
        if(curr>n) {
            return ;
        }
        int i =0;
        if(curr == 0) {
            i = 1;
        }

        for(; i <=9; i++) {
            lexicographicalNumber(n, curr*10 + i);
        }
    }
}
