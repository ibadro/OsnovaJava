package Black_Belt.t_8_Multithreading.Lock_ReentrantLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Example1 {
    public static void main(String[] args) {
        Call call = new Call();

        Thread mobileCall = new Thread(new Runnable() {
            @Override
            public void run() { call.mobileCall(); }});

        Thread skypeCall = new Thread(new Runnable() {
            @Override
            public void run() { call.skypeCall(); }});

        Thread whatsAppCall = new Thread(new Runnable() {
            @Override
            public void run() { call.whatsAppCall(); }});

        mobileCall.start();
        skypeCall.start();
        whatsAppCall.start();

    }
}

class Call {
    /**
     * Lock - это интерфейс
     * ReentrantLock - это класс который имплиментирует Lock интерфейс */
    private Lock lock = new ReentrantLock();

    void mobileCall(){
        lock.lock();
        try {
            System.out.println("Mobile call starts");
            Thread.sleep(3000);
            System.out.println("Mobile call ends");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            /** Запускаем метод в finally, чтобы открыть поток даже если вылетит исключкение */
            lock.unlock();
        }
    }

    void skypeCall(){
        lock.lock();
        try {
            System.out.println("Skype call starts");
            Thread.sleep(5000);
            System.out.println("Skype call ends");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            /** Запускаем метод в finally, чтобы открыть поток даже если вылетит исключкение*/
            lock.unlock();
        }
    }

    void whatsAppCall(){
        lock.lock();
        try {
            System.out.println("WhatsApp call starts");
            Thread.sleep(7000);
            System.out.println("WhatsApp call ends");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            /** Запускаем метод в finally, чтобы открыть поток даже если вылетит исключкение */
            lock.unlock();
        }
    }
}

/**
 * Также как ключевое слово synchronized, Lock нужен для достижения синхронизации между потоками.
 */