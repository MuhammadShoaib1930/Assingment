package Assingment;
/*
 * This file we using extends method
 * Sample Interrupting method
 */
// public interface ThreadDemo {
//     public static void main(String[] args) { 
//         MyThread obj1 = new MyThread(); //Creating object of MyThread class
//         MyThread obj2 = new MyThread(); //Creating object of MyThread class
//         obj1.start(); // Starting Thread mains start Tread one
//         obj2.start(); // Starting Thread mains start Tread one
//     }
// }
// class MyThread extends Thread{
//     @Override //The keyword use for rewrite method 
//     public void run(){ //The tread is start using run method.
//         for(int i = 0; i<10;i++){
//             System.out.println("Hello, I am a thread! ");
//         }
//     }
// }

class MyThread extends Thread {
    // Shared counter variable
    private static int counter = 0;

    // Method to increment the shared counter safely
    private static synchronized void incrementCounter() {
        counter++;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            // Increment the shared counter
            incrementCounter();
        }
    }

    // Method to get the final value of the counter
    public static int getCounter() {
        return counter;
    }
}

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        // Create two instances of MyThread
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        // Start both threads
        thread1.start();
        thread2.start();

        // Wait for both threads to complete
        thread1.join();
        thread2.join();

        // Print the final value of the counter
        System.out.println("Final value of the counter: " + MyThread.getCounter());
    }
}
