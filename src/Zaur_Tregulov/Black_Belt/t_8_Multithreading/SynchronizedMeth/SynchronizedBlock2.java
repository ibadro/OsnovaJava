package Zaur_Tregulov.Black_Belt.t_8_Multithreading.SynchronizedMeth;

public class SynchronizedBlock2 {
    static int counter = 0;

    /** Нельзя написать this т.к. метод static, надо обращаться к классу*/
    public static void increment() {
        synchronized (SynchronizedBlock2.class) {
            counter++;
        }
    }

    /**
     * synchronized к методу будет имень доступ только один поток (по определенной очереди)
     */

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new R2());
        Thread thread2 = new Thread(new R2());
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(counter); // 199250
    }
}

class R2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100000000; i++) {
            Example2.increment();
        }
    }
}
