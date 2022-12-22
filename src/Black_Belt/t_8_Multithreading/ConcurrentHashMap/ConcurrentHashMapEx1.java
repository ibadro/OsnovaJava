package Black_Belt.t_8_Multithreading.ConcurrentHashMap;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
/**
 * ConcurrentHashMap имплементируют интерфейс ConcurrentMap, который в свою очередь происходит от интерфейса Map.
 * В ConcurrentHashMap любое количество потоков может читать элементы не блокируя его.
 * В ConcurrentHashMap, благодаря его сегментированию, при изменении какого-либо элемента блокируется только bucket, в котором он находится.
 * В ConcurrentHashMap ни key, ни value не могут быть null.
 */
public class ConcurrentHashMapEx1 {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "Andrey");
        map.put(2, "Oleg");
        map.put(3, "Sergey");
        map.put(4, "Ivan");
        map.put(5, "Igor");
        System.out.println(map);

        Runnable runnable1 = ()->{
            // Создали итератор на множестве ключей
            Iterator<Integer> iterator = map.keySet().iterator();
            while (iterator.hasNext()){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // Ключ элементов передаем в i переменную
                Integer i = iterator.next();
                // Выводим ключ + значение
                System.out.println(i + ":" + map.get(i));
            }
        };

        Runnable runnable2 = ()->{
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // В HashMap добавить элемент с ключём 6 присвоить value Elena
            map.put(6,"Elena");
        };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(map);
    }
}
