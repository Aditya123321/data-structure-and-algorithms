package practice.java.recursion;

public class PrintDecreasingOrder {

    public static void main(String[] args) {
        printDecreasing(10);
    }
    //tail recusrion
    public static void printDecreasing( int n) {
        //we can use this as well
        if( n == 0) {
            return;
        }
        System.out.println(n);
        printDecreasing(n-1);
        /*if(n > 1) {
            printDec(n-1);
        }*/

    }

}
