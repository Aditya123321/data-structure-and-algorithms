package practice.java.leetcode.math;

public class PallindromeNumber {

    public static void main(String[] args) {
        int num = -121;
        int x =num;
        int pallindromeNum = 0;
        while(num !=0) {
            pallindromeNum = pallindromeNum*10 + num%10;
            num/=10;
        }
        System.out.print(pallindromeNum==x);
    }
}
