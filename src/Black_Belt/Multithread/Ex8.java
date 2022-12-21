package Black_Belt.Multithread;

import java.util.concurrent.Executor;

public class Ex8 extends Thread{
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i  );
        }
    }


    public static void main(String[] args) throws InterruptedException {
        Thread  t = new Thread(new MyRun1());
        Ex8 th2 = new Ex8();
        t.start();
        th2.start();

        t.join();
        th2.join();
        System.out.println("konec ");
    }
    }

class MyRun1 implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i  );
        }
    }
}