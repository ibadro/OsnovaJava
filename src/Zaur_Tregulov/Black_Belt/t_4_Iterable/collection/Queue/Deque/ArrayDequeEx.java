package Zaur_Tregulov.Black_Belt.t_4_Iterable.collection.Queue.Deque;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Deque – double ended queue (двунаправленная очередь). В
 * такой очереди элементы могут использоваться с обоих
 * концов. Здесь работают оба правила – FIFO и LIFO.
 * Интерфейс Deque реализуется классами LinkedList и
 * ArrayDeque.
 * ------------------ Методы -------------------
 * addFirst     addLast     offerFirst  offerLast
 * removeFirst  removeLast  pollFirst   pollLast
 * getFirst     getLast     peekFirst   peekLast
 */

public class ArrayDequeEx {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(3); // 3
        deque.addFirst(3); // 3, 3
        deque.addLast(7); // 3, 3, 7
        deque.offerFirst(1); // 1, 3, 3, 7
        deque.offerLast(8); // 1, 3, 3, 7, 8
        System.out.println(deque); // [1, 3, 3, 7, 8]

        System.out.println(deque.getFirst()); // возвращает первый элемент в очереди
        // если очередь пуста, то метод getFirst() выкинет exception,
        // чтобы этого не произошло надо использовать метод peekFirst()
        System.out.println(deque.getLast()); // возвращает последний элемент в очереди
        // если очередь пуста, то метод getLast() выкинет exception,
        // чтобы этого не произошло надо использовать метод peekLast()

        System.out.println(deque.removeFirst()); // 1
        System.out.println(deque); // [3, 3, 7, 8]
        System.out.println(deque.removeLast()); // 8
        System.out.println(deque); // [3, 3, 7]
        System.out.println(deque.pollFirst()); // 3
        System.out.println(deque); // [3, 7]
        System.out.println(deque.pollLast()); // 7
        System.out.println(deque); // [3]
    }
}
