package Zaur_Tregulov.Black_Belt.t_8_Multithreading.Callabe_Future;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFactorial4 {
    private static long value = 1_000_000_000;
    private static long sum = 0;

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // Создали ExecutorService на 10 потоков
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        // Создали массив объектов типа Future которые содержат в себе Long элементы
        List<Future<Long>> futureResults = new ArrayList<>();
        // Разделили число на 10 одинаковых частей
        long valueDivideBy10 = value / 10;
        // Цикл на 10 итераций который задаст 10 диапазонов и расчитает сумму их элементов
        for (int i = 0; i < 10; i++) {
            // Расчет значения начального элемента диапазона
            long from = valueDivideBy10 * i + 1; // число * 0 + 1 = 1
            // Расчет значения конечного элемента диапазона
            long to = valueDivideBy10 * (i + 1); // число * (0 + 1) = число + 1
            // Создание потока типа PartialSum
            PartialSum task = new PartialSum(from, to);
            // Создаем элемент типа Future и присваиваем ему значение результата который вернул поток task
            Future<Long> futurePartSum = executorService.submit(task);
            // Добавляем элмент типа Future в List futureResults
            futureResults.add(futurePartSum);
        }
        // Цикл перебора элементов массива
        for (Future<Long> result : futureResults) {
            // Складываем значения полученные потоками входящими в массив
            sum += result.get();
        }
        // Завершаем работу ExecutorService
        executorService.shutdown();
        // Выводим общий результат
        System.out.println("Total sum = " + sum);
    }
}

class PartialSum implements Callable<Long> {
    long from;
    long to;
    long localSum;

    public PartialSum(long from, long to) {
        this.from = from;
        this.to = to;
    }

    // Считает сумму элементов указанного диапазона
    @Override
    public Long call() {
        for (long i = from; i <= to; i++) {
            localSum += i;
        }
        System.out.println("Sum from " + from + " to " + to + " = " + localSum);
        return localSum;
    }
}