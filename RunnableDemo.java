package Assingment;
/*
 * This file we using implements method.
 */
public class RunnableDemo {
    public static void main(String[] args) {
        MyRunnable obj1 = new MyRunnable();//Create one object of MyRunnable class
        MyRunnable obj2 = new MyRunnable();//Create second object of MyRunnable class 
        Thread thread1 = new Thread(obj1); // initializing One thread Object 
        Thread thread2 = new Thread(obj2); // initializing second thread Object
        thread1.start(); // Start method responsible to interrupting
        thread2.start();// Start method responsible to interrupt
    }
}
class MyRunnable implements Runnable{ //create dived class 
    @Override //key word which is use for rewrite method
    public void run(){ // The method is already exist in parent class
        for(int i = 0; i<10;i++){ // i = 0 to 10 loop 
            System.out.println("Hello, I am a runnable!");
        }
    }
}

