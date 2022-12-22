package Black_Belt.t_8_Multithreading.CopyOnWriteArrayList;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * CopyOnWriteArrayList имплементируют интерфейс List.
 * CopyOnWriteArrayList следует использовать тогда, когда вам нужно добиться потокобезопасности, у вас небольшое количество операций по изменению
 * элементов и большое количество по их чтению.
 * В CopyOnWriteArrayList при каждой операции по изменению элементов создаётся копия этого листа.
 */
public class CopyOnWriteArrayListEx1 {
    public static void main(String[] args) throws InterruptedException {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("Andrey");
        list.add("Oleg");
        list.add("Sergey");
        list.add("Ivan");
        list.add("Igor");

        System.out.println(list);

        Runnable runnable1 = ()->{
                Iterator<String> iterator = list.iterator();
                while (iterator.hasNext()){
                    try {
                        // Перед каждым выводом спать 200 миллисекунд
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(iterator.next());
                }
        };

        Runnable runnable2 = ()->{
            try {

                // спать 200 миллисекунд
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // Удалить элемент с индексом 4
            list.remove(4);
            // Добавить элемент
            list.add("Elena");
        };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(list);
    }
}

