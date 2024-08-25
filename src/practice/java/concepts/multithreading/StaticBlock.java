package practice.java.concepts.multithreading;

public class StaticBlock {
    /*
    * A static block is a block of code inside a Java class that gets executed when the class is loaded into memory.
    * Static blocks are useful for initializing static variables or performing one-time setup operations.
    *
    * Concepts Engineers Often Miss:
    *
    * Order of Execution: Static blocks execute in the order they are defined within the class, before any object of the class is created and even before the main method.
    *
    * Multiple Static Blocks: You can have multiple static blocks in a class; they will be executed in the order they appear.
    *
    * */
    static {
        System.out.println("Static block 1");
    }

    static {
        System.out.println("Static block 2");
    }

    public static void main(String[] args) {
        System.out.println("Main method");
    }
}
