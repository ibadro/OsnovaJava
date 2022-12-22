package Black_Belt.t_8_Multithreading.Callabe_Future;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Callable, также как и Runnable, представляет собой определённое
 * задание, которое выполняется потоком.
 * В отличии от Runnable Callable:
 * • имеет return type не void;
 * • может выбрасывать Exception.
 */
public class CallableFactorial {
    static int factorialResult;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Factorial2 factorial2 = new Factorial2(6);
        // Метод принимает Callable и возвращает значение
        /**
         * Метод submit передаёт наше задание (task) в thread pool, для
         * выполнения его одним из потоков, и возвращает тип Future, в
         * котором и хранится результат выполнения нашего задания.
         */
        Future<Integer> future = executorService.submit(factorial2);
        try {
            /**
             * Метод get позволяет получить результат выполнения нашего
             * задания из объекта Future.
             */
            factorialResult = future.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            // getCause() - метод который выводит причину выброса ExecutionException

            System.out.println(e.getCause());
        }
        finally {
            // Закрыть executorService - лучше прописывать в finally
            executorService.shutdown();
        }
        System.out.println(factorialResult);

    }
}

class Factorial2 implements Callable<Integer> {
    int f;

    public Factorial2(int f) {
        this.f = f;
    }

    @Override
    public Integer call() throws Exception {
        if (f<=0){
            throw new Exception("Вы ввели неверное число");
        }
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result *= i;
        }
        return result;
    }
}

