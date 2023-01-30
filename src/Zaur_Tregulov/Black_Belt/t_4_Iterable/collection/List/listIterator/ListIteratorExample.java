package Zaur_Tregulov.Black_Belt.t_4_Iterable.collection.List.listIterator;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        // Является ли String с
        String s = "madam";
        List<Character> list = new LinkedList<>();
        for (Character ch: s.toCharArray()){ // каждый char из массива s заношу в список list
            list.add(ch);
        }
        System.out.println(list);

        ListIterator<Character> iterator = list.listIterator(); // начинает с 0 индекса
        ListIterator<Character> reverseIterator = list.listIterator(list.size()); // начинает с последнего индекса
        boolean isPalindrome = true;
        while (iterator.hasNext() && reverseIterator.hasPrevious()){
            // если у iterator есть следующий символ и у reverseIterator есть предидущий
            if(iterator.next() != reverseIterator.previous()){
                // если следующий илемент iterator не равен предидущему элементу reverseIterator
                isPalindrome = false; // то присвоить isPalindrome false
                break; // и завершить цикл
            }
        }
        if(isPalindrome){ // если isPalindrome = true
            System.out.println("Палиндром");
        } else {
            System.out.println("НЕ Палиндром");
        }
    }
    /**
     * hasNext() - итерация в промом порядке
     * previous() - итерация в обратном порядке
     */
}
