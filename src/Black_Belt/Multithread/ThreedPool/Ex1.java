package Black_Belt.Multithread.ThreedPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/** ThreadPoolExecutor напрямую лучше не создавать */

public class Ex1 {
    public static void main(String[] args) throws InterruptedException {
        // Создаем ThreadPool по средствам методов класса Executors, pool на 5 потоков
         ExecutorService executorService = Executors.newFixedThreadPool(5);

        // Создаем ThreadPool по средствам методов класса Executors, pool на 1 поток
        ExecutorService executorService2 = Executors.newSingleThreadExecutor();

        for (int i = 0; i < 10; i++) {
            // На объекте executorService вызвали метод execute() с параметром объект RunnableImpl100
            executorService.execute(new RunnableImpl100());
        }
        // Метод shutdown() завершает работу ExecutorService
        executorService.shutdown();
        // Останавливает поток на указанное время, поток будет ждать
        // пока ExecutorService или пока истекут 5 секунд, что быстрее
        executorService.awaitTermination(5, TimeUnit.SECONDS);
        System.out.println("Main ends");
    }
}


class RunnableImpl100 implements Runnable{

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