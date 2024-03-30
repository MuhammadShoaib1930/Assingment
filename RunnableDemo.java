package Assingment;

public class RunnableDemo {
    public static void main(String[] args) {
        MyRunnable obj1 = new MyRunnable();
        Thread thread1 = new Thread(obj1);
        thread1.start();
        obj1 = new MyRunnable();
        thread1 = new Thread(obj1);
        thread1.start();
    }
}
class MyRunnable implements Runnable{
    public void run(){
        for(int i = 0; i<10;i++){
            System.out.println("Hello, I am a runnable!");
        }
    }
}

