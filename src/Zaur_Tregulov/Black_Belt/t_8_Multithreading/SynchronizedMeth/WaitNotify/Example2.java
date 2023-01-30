package Zaur_Tregulov.Black_Belt.t_8_Multithreading.SynchronizedMeth.WaitNotify;

/**
 * Через Lock
 */
public class Example2 {
    public static void main(String[] args) {
        Market2 market = new Market2();
        Producer2 producer = new Producer2(market);
        Consumer2 consumer = new Consumer2(market);
        // Создаем потоки - которые синхронизировались по Market
        Thread threadProd = new Thread(producer);
        Thread threadCons = new Thread(consumer);
        threadProd.start();
        threadCons.start();
    }
}

class Market2 {
    // Переменная количество хлеба в магазине
    private int breadCount = 0;
    Object lock = new Market();

    // Метод забирает один хлеб
    public void getBread() {
        synchronized (lock) {
            // Пока количество хлеба меньше 1
            while (breadCount < 1) {
                try {
                    // ждать
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            // При вызове метода уменьшить количество хлеба на 1 шт.
            breadCount--;
            System.out.println("Потребитель купил 1 хлеб.");
            System.out.println("Количество хлеба в магазине: " + breadCount);
            // как только взяли один хлеб вызываем метод notify();
            lock.notify();
        }
    }

    // Метод добавляет один хлеб
    public void putBread() {
        synchronized (lock) {
            System.out.println(this);
            // Пока количество хлеба больше либо равно 5
            while (breadCount >= 5) {
                try {
                    // ждать
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            // Если хлеба меньше 5, то добавляем один хлеб
            breadCount++;
            System.out.println("Производитель добавил  1 хлеб.");
            System.out.println("Количество хлеба в магазине: " + breadCount);
            // как только добавили один хлеб вызываем метод notify();
            lock.notify();
        }
    }
}

// Класс производитель
class Producer2 implements Runnable {
    Market2 market;

    public Producer2(Market2 market) {
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.putBread();
        }
    }
}

// Класс полупатель
class Consumer2 implements Runnable {
    Market2 market;

    public Consumer2(Market2 market) {
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.getBread();
        }
    }
}
