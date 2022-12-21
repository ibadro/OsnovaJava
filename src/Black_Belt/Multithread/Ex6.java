package Black_Belt.Multithread;

import java.util.concurrent.Executor;

public class Ex6 implements Runnable {
    public void run() {
        System.out.println(" Method run. Thread name =" + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Ex6());
        thread.start();
        System.out.println("method main. Thread name =" + Thread.currentThread().getName());
    }
}
