package Zaur_Tregulov.Black_Belt.t_8_Multithreading.SynchronizedMeth.WaitNotify;

/**
 * Прилавок хлеба, на 5 мест
 * Всего хлеба 10 штук
 * Производитель докладывает хлеб если есть свободное месо
 * Покупатель берет хлеб если он есть на прилавке
 */
public class Example1 {
    public static void main(String[] args) {
        Market market = new Market();
        Producer producer = new Producer(market);
        Consumer consumer = new Consumer(market);
        // Создаем потоки - которые синхронизировались по Market
        Thread threadProd = new Thread(producer);
        Thread threadCons = new Thread(consumer);
        threadProd.start();
        threadCons.start();
    }
}

class Market {
    // Переменная количество хлеба в магазине
    private int breadCount = 0;

    // Метод забирает один хлеб
    public synchronized void getBread() {
        System.out.println(this);
        // Пока количество хлеба меньше 1
        while (breadCount < 1) {
            try {
                // ждать
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // При вызове метода уменьшить количество хлеба на 1 шт.
        breadCount--;
        System.out.println("Потребитель купил 1 хлеб.");
        System.out.println("Количество хлеба в магазине: " + breadCount);
        // как только взяли один хлеб вызываем метод notify();
        notify();
    }

    // Метод добавляет один хлеб
    public synchronized void putBread() {
        System.out.println(this);
        // Пока количество хлеба больше либо равно 5
        while (breadCount >= 5) {
            try {
                // ждать
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // Если хлеба меньше 5, то добавляем один хлеб
        breadCount++;
        System.out.println("Производитель добавил  1 хлеб.");
        System.out.println("Количество хлеба в магазине: " + breadCount);
        // как только добавили один хлеб вызываем метод notify();
        notify();
    }
}

// Класс производитель
class Producer implements Runnable {
    Market market;

    public Producer(Market market) {
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
class Consumer implements Runnable {
    Market market;

    public Consumer(Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.getBread();
        }
    }
}