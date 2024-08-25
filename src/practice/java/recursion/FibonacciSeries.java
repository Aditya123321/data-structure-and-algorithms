package practice.java.recursion;

public class FibonacciSeries {

    public static void main(String[] args) {

        System.out.println(fib(5));
    }

    public static Integer fib(int n) {
        if(n == 0 || n == 1) {
            return n;
        }
        int a = fib(n-1);
        int b = fib(n-2);

        return a+b;
    }

}
