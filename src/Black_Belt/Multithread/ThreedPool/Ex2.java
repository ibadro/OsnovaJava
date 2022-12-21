package Black_Belt.Multithread.ThreedPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Ex2 {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService scheduledExecutorService =
                Executors.newScheduledThreadPool(1);

        ScheduledExecutorService scheduledExecutorService2 =
                Executors.newScheduledThreadPool(1);

        ScheduledExecutorService scheduledExecutorService3 =
                Executors.newScheduledThreadPool(1);


//        for (int i = 0; i < 10; i++) {
//            scheduledExecutorService.execut e(new RunnableImpl200());
//        }

        // запусти поток RunnableImpl200 через 3 секунды
        scheduledExecutorService.schedule(new RunnableImpl200(), 3, TimeUnit.SECONDS);
        // остановить
        scheduledExecutorService.shutdown();

        // Запустится RunnableImpl200() через 3 секунды, и будет выполняться с периодичность в 1 секнду,
        /** 1 секунда от начаала работы первого задания до начала работы 2-го */
        scheduledExecutorService2.scheduleAtFixedRate(new RunnableImpl200(),
                3, 1, TimeUnit.SECONDS);
        Thread.sleep(20000);
        scheduledExecutorService2.shutdown();

        // Запустится RunnableImpl200() через 3 секунды, и будет выполняться с периодичность в 1 секнду,
        /** 1 секунда от конца работы первого задания до начала работы 2-го */
        scheduledExecutorService3.scheduleWithFixedDelay(new RunnableImpl200(),
                3, 1, TimeUnit.SECONDS);

        Thread.sleep(20000);
        scheduledExecutorService3.shutdown();

        // Создает потоки при надобности
        ExecutorService executorService =
                Executors.newCachedThreadPool();
    }
}

class RunnableImpl200 implements Runnable{

    @Override
    public void run() {
        // Вывести имя потока
        System.out.println(Thread.currentThread().getName() + " begins work");
        try {
            // Спать 500 милисек
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " ends work");
    }
}