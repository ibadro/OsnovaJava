package Black_Belt.Multithread.AtomicInteger;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * AtomicInteger – это класс, который предоставляет
 * возможность работать с целочисленным значением int,
 * используя атомарные операции.
 *
 * incrementAndGet - увеличить и верни
 * getAndIncrement - верни, потом увеличить
 * addAndGet - увеличить на число и верни
 * getAndAdd - верни, потом увеличить на число
 * decrementAndGet - уменьшить и верни
 * getAndDecrement - верни, потом уменьшить
 */

public class AtomicIntegerEx2 {
    static AtomicInteger counter = new AtomicInteger(0); // по дефолту стоит 0


    public static void increment(){
        // incrementAndGet() - увелич и дай
        counter.incrementAndGet();

        // Увеличить на число и вернуть
        counter.addAndGet(5);
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyRunnableImpl());
        Thread thread2 = new Thread(new MyRunnableImpl());
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
        System.out.println(counter);
    }
}

class MyRunnableImpl implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            AtomicIntegerEx1.increment();

        }
    }
}
