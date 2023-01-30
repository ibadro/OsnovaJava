package Zaur_Tregulov.Black_Belt.t_8_Multithreading.Callabe_Future;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class RunnableFactorial {
    static int factorialResult;

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Factorial factorial= new Factorial(5);
        executorService.execute(factorial);
        executorService.shutdown();
        // Ждать перед запуском 10 секунд либо пока поток не завершит работу,
        // если не ждать, метод run() не успеет провести расчеты и выдаст 0.
        executorService.awaitTermination(10, TimeUnit.SECONDS);
        System.out.println(factorialResult);
    }
}

class Factorial implements Runnable{
    int f;

    public Factorial(int f) {
        this.f = f;
    }

    @Override
    public void run() {
        if(f <=0){
            System.out.println("Вы ввели неверное число");
            return;
        }
        int result = 1;
        for (int i = 1; i <=f ; i++) {
            result *=i;
        }
        RunnableFactorial.factorialResult = result;
    }
}