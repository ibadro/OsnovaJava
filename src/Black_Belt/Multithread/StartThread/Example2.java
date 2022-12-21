package Black_Belt.Multithread.StartThread;

public class Example2 {
    public static void main(String[] args) {
        /** Через создание объекта класса Thread */
        Thread myThread1 = new Thread(new MyThread1());
        Thread myThread2 = new Thread(new MyThread2());
        myThread1.start();
        myThread2.start();
    }
}

/** Через имплементацию интерфейса Runnable */
class MyThread1 implements Runnable{
    public void run(){
        for (int i = 1; i <= 1000 ; i++) {
            System.out.println(i);
        }
    }
}

class MyThread2 implements Runnable{
    public void run(){
        for (int i = 1000; i > 0; i--) {
            System.out.println(i);
        }
    }
}