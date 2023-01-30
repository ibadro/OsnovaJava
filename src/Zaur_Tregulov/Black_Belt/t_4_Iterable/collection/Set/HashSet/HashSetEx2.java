package Zaur_Tregulov.Black_Belt.t_4_Iterable.collection.Set.HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx2 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(5);
        set1.add(2);
        set1.add(3);
        set1.add(1);
        set1.add(8);

        Set<Integer> set2 = new HashSet<>();
        set2.add(7);
        set2.add(4);
        set2.add(3);
        set2.add(5);
        set2.add(8);

        Set<Integer> union = new HashSet<>(set1); // объединение
        union.addAll(set2); // объединяет множества не дублируя одинаковые значения

        Set<Integer> intersect = new HashSet<>(set1); // пересечение
        intersect.retainAll(set2); // возвращает одинаковые значения удаляе разные

        Set<Integer> subtract = new HashSet<>(set1); // разность двух множеств
        subtract.removeAll(set2); // возвращает значения у которых нету дубликата

        System.out.println(set1 + "\n" + set2 + "\n" + union + "\n" + intersect + "\n" + subtract);
//        [1, 2, 3, 5, 8]
//        [3, 4, 5, 7, 8]
//        [1, 2, 3, 4, 5, 7, 8]
//        [3, 5, 8]
//        [1, 2]
    }
}
