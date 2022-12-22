package Black_Belt.t_4_Iterable.collection.Set.LinkedHashSet;

import java.util.LinkedHashSet;

/**
 * LinkedHashSet является наследником HashSet. Хранит
 * информацию о порядке добавления элементов.
 * Производительность методов немного ниже, чем у
 * методов HashSet.
 * В основе LinkedHashSet лежит HashMap. У элементов
 * данного HashMap: ключи - это элементы LinkedHashSet,
 * значения – это константа-заглушка.
 */

public class LinkedHashSetEx {
    public static void main(String[] args) {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(5);
        linkedHashSet.add(3);
        linkedHashSet.add(1);
        linkedHashSet.add(8);
        linkedHashSet.add(10);
        System.out.println(linkedHashSet); // [5, 3, 1, 8, 10]
        linkedHashSet.remove(8);
        System.out.println(linkedHashSet); // // [5, 3, 1, 10]
        System.out.println(linkedHashSet.contains(8)); // false
        System.out.println(linkedHashSet.contains(10)); // true
    }
}
