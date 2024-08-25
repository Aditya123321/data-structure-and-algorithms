package practice.java.interview.questions;

public class SingletonClasses {

    private static final SingletonClasses singletonObject = new SingletonClasses();
    private SingletonClasses(){
        //no code required
    }

    public static SingletonClasses getInstance() {
        return singletonObject;
    }
    public static void main(String[] args) {
        SingletonClasses instanceOne = SingletonClasses.getInstance();
        SingletonClasses instanceTwo = SingletonClasses.getInstance();

        //since it is gonna have the same instance of object, the memory address would be same
        if(instanceOne == instanceTwo) {
            System.out.println("Same instance object");
        }
    }
}
