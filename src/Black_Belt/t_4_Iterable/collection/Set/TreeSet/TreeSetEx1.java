package Black_Belt.t_4_Iterable.collection.Set.TreeSet;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx1 {
    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(8);
        treeSet.add(2);
        treeSet.add(1);
        treeSet.add(10);
        // treeSet.add(null); // выдаст ошибку, т.к. не может хранить null

        System.out.println(treeSet); // [1, 2, 5, 8, 10]

        treeSet.remove(2);
        System.out.println(treeSet); // [1, 5, 8, 10]
        System.out.println(treeSet.contains(1)); // true
        System.out.println(treeSet.contains(2)); // false
    }
}
