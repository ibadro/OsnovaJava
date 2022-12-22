package Black_Belt.t_4_Iterable.collection.Queue.AbstractQueue;

import java.util.PriorityQueue;

/**
 * PriorityQueue – это специальный вид очереди, в
 * котором используется натуральная сортировка или та,
 * которую мы описываем с помощью Comparable или
 * Comparator. Таким образом используется тот элемент из
 * очереди, приоритет которого выше.
 */

public class PriorityQueueEx {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(4);
        priorityQueue.add(1);
        priorityQueue.add(7);
        priorityQueue.add(10);
        priorityQueue.add(8);
        System.out.println(priorityQueue); // [1, 4, 7, 10, 8] - при выводе не сортируется

        System.out.println(priorityQueue.peek()); // возвращает первый по-значению элемент
        System.out.println(priorityQueue.remove()); // 1
        System.out.println(priorityQueue.remove()); // 4
        System.out.println(priorityQueue.remove()); // 7
        System.out.println(priorityQueue.remove()); // 8
        System.out.println(priorityQueue.remove()); // 10
    }
}
