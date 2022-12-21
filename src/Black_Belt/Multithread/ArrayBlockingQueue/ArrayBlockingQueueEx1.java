package Black_Belt.Multithread.ArrayBlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * ArrayBlockingQueue – потокобезопасная очередь с
 * ограниченным размером (capacity restricted).
 * Обычно один или несколько потоков добавляют
 * элементы в конец очереди, а другой или другие потоки
 * забирают элементы из начала очереди.
<<<<<<< HEAD
 *
=======
>>>>>>> origin/master
 * put - добавить в конец
 * take - забрать первый
 */
public class ArrayBlockingQueueEx1 {
    public static void main(String[] args) {

        // Очередь на 4 элемента
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(4); // обязательно указать размер
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
//        queue.add(5); // Выдаст IllegalStateException, т.к. заявлен размер 4, но ...
        queue.offer(5); // добавит без вызрасывания Exception
        System.out.println(queue);
    }
}
