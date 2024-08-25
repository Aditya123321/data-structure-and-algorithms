package practice.java.recursion;

public class Factorial {

    public static void main(String[] args) {

        System.out.println(factorial(5));
        System.out.println(factorial(5,1));
    }

    //head recursion
    //in this case we are storing the multiplication in a variable and then returning it
    public static Integer factorial(int n) {
        if(n == 0) {
            return 1;
        }
        int fact = factorial(n-1);
        return fact * n;
    }

    //using tail recursion
    //in this case we are storing the multiplication in the ans argument
    public static Integer factorial(int n, int ans) {
        if(n == 0) {
            return ans;
        }
        return factorial(n-1, ans * n);
    }

}
