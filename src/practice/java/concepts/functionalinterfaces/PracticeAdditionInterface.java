package practice.java.concepts.functionalinterfaces;

public class PracticeAdditionInterface {

    public static void main(String[] args) {
        Addition add = (a, b) -> a+b;

        System.out.println(add.add(5,6));

    }
}
