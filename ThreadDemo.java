package Assingment;

public interface ThreadDemo {
    public static void main(String[] args) {
        MyThread obj1 = new MyThread();
        obj1.start();
        obj1 = new MyThread();
        obj1.start();
    }
}
class MyThread extends Thread{
    @Override
    public void run(){
        for(int i = 0; i<10;i++){
            System.out.println("Hello, I am a thread! ");
        }
    }
}
