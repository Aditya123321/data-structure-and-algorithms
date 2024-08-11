package practice.java.complexity;

public class TimeComplexity {

    public static void main(String[] args) {
        System.out.println();
        long start = System.currentTimeMillis();
        for(int i =0; i<1000000; i++){
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
