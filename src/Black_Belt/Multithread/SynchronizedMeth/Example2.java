package Black_Belt.Multithread.SynchronizedMeth;

public class Example2 {
    static int counter = 0;
    public static synchronized void  increment(){counter++;}
    /** synchronized к методу будет имень доступ только один поток (по определенной очереди) */

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new R());
        Thread thread2 = new Thread(new R());
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(counter); // 200
    }
}

class R implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100000000; i++) {
            Example2.increment();
        }
    }
}