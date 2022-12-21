package Black_Belt.Multithread.Callabe_Future;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class CallableFactorial3 {
    static int factorialResult;

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Factorial4 factorial4 = new Factorial4(6);
        Future future = executorService.submit(factorial4);
        executorService.shutdown();
        executorService.awaitTermination(10, TimeUnit.SECONDS);
        System.out.println(future.get()); // null т.к. метод run() ничего не возвращает
        System.out.println(future.isDone());
        System.out.println(factorialResult);
    }
}

class Factorial4 implements Runnable {
    int f;

    public Factorial4(int f) {
        this.f = f;
    }
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