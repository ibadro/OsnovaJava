package Black_Belt.t_8_Multithreading.Lock_ReentrantLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bankomat {

    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        new Employee("Andrey", lock);
        new Employee("Oleg", lock);
        new Employee("Elena", lock);
        new Employee("Viktor", lock);
        new Employee("Marina", lock);
    }
}

class Employee extends Thread{
    String name;
    private Lock lock;

    public Employee(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start();
    }

    @Override
    public void run() {
        System.out.println(name + " ждет...");
        lock.lock();
        System.out.println(name + " пользуется банкоматом");
        try {
            Thread.sleep(2000);
            System.out.println(name + " завершил(а) свои дела.");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            lock.unlock();
        }
    }
}