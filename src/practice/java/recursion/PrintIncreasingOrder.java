package practice.java.recursion;

public class PrintIncreasingOrder {

    public static void main(String[] args) {
        printIncreasing(10);
    }
    //head recursion
    public static void printIncreasing( int n) {
        //we can use this as well
        if( n == 0) {
            return;
        }
        /*if(n > 1) {
            printDec(n-1);
        }*/
        printIncreasing(n-1);
        System.out.println(n);
    }

}
