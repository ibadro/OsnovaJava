package Black_Belt.t_8_Multithreading.DeadLock;

public class Example1 {
    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();

        thread1.start();
        thread2.start();
        /**
         * Цикл ушел в Dead Lock
         * Deadlock–ситуация, когда 2 или более потоков залочены навсегда,
         * ожидают друг друга и ничего не делают.
         * Чтобы этого избежать надо программировать потоки на одинаковый порядок lock-ов
         */
//        Thread1: Попытка захватить монитор объекта lock1
//        Thread2: Попытка захватить монитор объекта lock2
//        Thread2: Монитор объекта lock2 захвачен
//        Thread2: Попытка захватить монитор объекта lock2
//        Thread1: Монитор объекта lock1 захвачен
//        Thread1: Попытка захватить монитор объекта lock2
    }
}

class Thread1 extends Thread{
    @Override
    public void run() {
        System.out.println("Thread1: Попытка захватить монитор объекта lock1");
        synchronized (Example1.lock1){
            System.out.println("Thread1: Монитор объекта lock1 захвачен");
            System.out.println("Thread1: Попытка захватить монитор объекта lock2");
            synchronized (Example1.lock2){
                System.out.println("Thread1: Монитор объектов lock1 и lock2 захвачены");
            }

        }
    }
}

class Thread2 extends Thread{
    @Override
    public void run() {
        System.out.println("Thread2: Попытка захватить монитор объекта lock2");
        synchronized (Example1.lock2){
            System.out.println("Thread2: Монитор объекта lock2 захвачен");
            System.out.println("Thread2: Попытка захватить монитор объекта lock2");
            synchronized (Example1.lock1){
                System.out.println("Thread2: Монитор объектов lock1 и lock2 захвачены");
            }

        }
    }
}

/**
 * Livelock–ситуация, когда 2 или более потоков залочены навсегда,
 * ожидают друг друга, проделывают какую-тоработу, но без какого-либо прогресса.
 *
 * Lock starvation–ситуация, когда менее приоритетные потоки ждут
 * долгое время или всё время для того, чтобы могли запуститься.
 */
