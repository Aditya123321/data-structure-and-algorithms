package practice.java.concepts.multithreading;

class Counter {
    private int count = 0;

    // Synchronized method
    public synchronized void increment() {
        count++;
    }

    // Synchronized block
    public void decrement() {
        synchronized (this) {
            count--;
        }
    }

    public int getCount() {
        return count;
    }
}
public class SynchronizedKeyword {

    /*
    * Synchronized is a keyword in Java that restricts access to a particular block of code or method to only one thread at a time.
    * It is used to prevent thread interference and consistency problems when multiple threads access shared resources.
    *
    * Concepts Engineers Often Miss:
    *
    * Synchronized Methods vs. Synchronized Blocks:
    *
    * Synchronized Method: Locks the entire method, allowing only one thread to execute the method at a time.
    *
    * Synchronized Block: Allows you to synchronize a specific block of code within a method, which can provide more granular control and improve performance.
    *
    * Intrinsic Locks and Object-level Locking: Each object in Java has an intrinsic lock or monitor lock. When a synchronized method or block is executed, the thread must acquire the intrinsic lock of the object.
    *
    * */

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.decrement();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final count: " + counter.getCount());
    }
}
