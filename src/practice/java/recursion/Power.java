package practice.java.recursion;

public class Power {

    public static void main(String[] args) {

        System.out.println(power(3,10));
    }
    //head recursion
    public static Integer power(int a, int n) {
        if(n == 1) { // or you can use n == 0 then you will return 1
            return a;
        }
        int powValue = power(a,n-1);
        return powValue * a;
    }

}
