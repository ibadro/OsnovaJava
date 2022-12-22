package Black_Belt.t_8_Multithreading.SynchronizedCollections;

import java.util.ArrayList;
import java.util.Iterator;

public class SynchronizedCollectionsEx2 {
    public static void main(String[] args) throws InterruptedException {
        // Создаем ArrayList Integer-ов
        ArrayList<Integer> arrayList = new ArrayList<>();
        // заполняем его 1000 элементами
        for (int i = 0; i < 1000; i++) {
            arrayList.add(i);
        }

        // Первый поток проходит по каждому элементу и выводит его
        Runnable runnable1 = () -> {
            Iterator<Integer> iterator= arrayList.iterator();
            while (iterator.hasNext()){
            System.out.println(iterator.next());}
        };

        // Второй поток удаляет элемент с индексом 10
        Runnable runnable2 = () -> arrayList.remove(10);

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(arrayList);

        // Выбросится ConcurrentModificationException,
        // т.к. нельзя 2 потока работало с ArrayList один
        // добавлял элемент, второй удалял
    }
}
