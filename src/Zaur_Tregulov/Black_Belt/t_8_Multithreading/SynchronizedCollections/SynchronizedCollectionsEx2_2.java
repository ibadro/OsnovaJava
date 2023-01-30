package Zaur_Tregulov.Black_Belt.t_8_Multithreading.SynchronizedCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchronizedCollectionsEx2_2 {
    public static void main(String[] args) throws InterruptedException {
        // Создаем ArrayList Integer-ов
        ArrayList<Integer> arrayList = new ArrayList<>();
        // заполняем его 1000 элементами
        for (int i = 0; i < 1000; i++) {
            arrayList.add(i);
        }

        // Создаю Synchronized List из arrayList
        List<Integer> synchList = Collections.synchronizedList(arrayList);

        // Первый поток проходит по каждому элементу и выводит его
        Runnable runnable1 = () -> {
            // Чтобы не вскакивало ConcurrentModificationException синхронизируем код
            // пока не закончит работу один поток, дроугой поток не сможет
            // внести изщменения в synchList. Какой поток захватит экран первым,
            // метод того и сработает.
            synchronized (synchList) {
                Iterator<Integer> iterator = synchList.iterator();
                while (iterator.hasNext()) {
                    System.out.println(iterator.next());
                }
            }
        };

        // Второй поток удаляет элемент с индексом 10
        Runnable runnable2 = () -> synchList.remove(10);

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(synchList);

        // Выбросится ConcurrentModificationException,
        // т.к. нельзя 2 потока работало с ArrayList один
        // добавлял элемент, второй удалял

    }
}

