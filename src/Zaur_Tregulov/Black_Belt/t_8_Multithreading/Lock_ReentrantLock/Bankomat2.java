package Zaur_Tregulov.Black_Belt.t_8_Multithreading.Lock_ReentrantLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bankomat2 {
    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();
        new Employee2("Andrey", lock);
        new Employee2("Oleg", lock);
        new Employee2("Elena", lock);
        Thread.sleep(5000);
        new Employee2("Viktor", lock);
        new Employee2("Marina", lock);
    }
}

class Employee2 extends Thread{
    String name;
    private Lock lock;

    public Employee2(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start();
    }

    @Override
    public void run() {

        /** Если монитор свободен tryLock() возвращает true, иначе false */
        if(lock.tryLock()) {
            System.out.println(name + " пользуется банкоматом");
            try {
                Thread.sleep(2000);
                System.out.println(name + " завершил(а) свои дела.");

            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println(name + " не хочет ждать в очереди.");
        }
    }
}
