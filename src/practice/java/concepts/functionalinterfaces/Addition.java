package practice.java.concepts.functionalinterfaces;

@FunctionalInterface
public interface Addition {
    /*
    * A functional interface is an interface with exactly one abstract method, making it suitable for lambda expressions.
    * Java 8 also introduced default and static methods in interfaces.
    * Concepts Engineers Often Miss:
    *
    * Default Methods: Allow adding new methods to interfaces without breaking existing implementations.
    *
    * Custom Functional Interfaces: Knowing when and how to create custom functional interfaces for specific use cases.
    */
    int add(int a, int b);

    //default method to support JDK's backward compatibility
    default String successMessage() {
        return " Addition was successful";
    }
 }
