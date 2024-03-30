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

public class ThreadDemo {
    public static void main(String[] args) {
        MyRunnable obj1 = new MyRunnable();
        MyRunnable obj2 = new MyRunnable();
        Thread thread1 = new Thread(obj1);
        Thread thread2 = new Thread(obj2);
        thread1.start();
        thread2.start();

        //Handling Interrupted Exception
        try {
            thread1.join(); //waiting for thread1 to complete.
            thread2.join();//waiting for thread2 to complete.
        } catch (InterruptedException var) {
            System.out.println("Threads Interrupts for waiting... ");
        }
        System.out.println(MyRunnable.getCounter());
    }
}
class MyRunnable implements Runnable{
    private static int sharedCounter = 0;
    private static final Object lock = new Object();
    public void run(){
        for(int i = 0; i<10;i++){
            synchronized (lock){
                sharedCounter++;
            }
        }
    }
    public static int getCounter(){
        return sharedCounter;
    }
}