package practice.java.concepts.lambda;

public class SquarePractice {

    public static void main(String[] args) {
        Square square = (int x) -> x*x;

        System.out.println(square.calculateSquare(5));
    }
}
