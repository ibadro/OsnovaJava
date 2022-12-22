package Black_Belt.t_4_Iterable.collection.Queue.Deque;
/**
 * Queue – это коллекция, хранящая последовательность
 * элементов. Добавляется элемент в конец очереди,
 * используется из начала очереди – правило FIFO.
 * First In - First Out.
 * Класс LinkedList имплементирует не только интерфейс
 * List, но и интерфейс Deque.
 */

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListEx {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Andrey");
        queue.add("Oleg");
        queue.add("Ivan");
        queue.add("Mariya");
        queue.add("Aleksandr");
        System.out.println(queue); // [Andrey, Oleg, Ivan, Mariya, Aleksandr]

        Queue<String> queue2 = new LinkedList<>();
        queue2.offer("Andrey");
        queue2.offer("Oleg");
        queue2.offer("Ivan");
        queue2.offer("Mariya");
        queue2.offer("Aleksandr");
        System.out.println(queue2); // [Andrey, Oleg, Ivan, Mariya, Aleksandr]
        queue2.remove("Ivan");
        System.out.println(queue2); // [Andrey, Oleg, Mariya, Aleksandr]
        queue2.remove(); // если не указать элемент то удалится первый
        System.out.println(queue2); // [Oleg, Mariya, Aleksandr]
        // remove() выдаст исключение если удалять будет нечего, чтобы
        // этого не произошло надо использовать метод pool()
        for (int i = 0; i < 10; i++) {
            System.out.print(queue.poll() + " "); // Andrey Oleg Ivan Mariya Aleksandr null null null null null
        }
        System.out.println();
        System.out.println(queue2.element()); // Oleg - возвращает первый элемент в очереди
        // если очередь пуста, то метод element() выкинет exception,
        // чтобы этого не произошло надо использовать метод pool()
        System.out.println(queue.poll()); // вернет null т.к. очередь пуста
    }
}
