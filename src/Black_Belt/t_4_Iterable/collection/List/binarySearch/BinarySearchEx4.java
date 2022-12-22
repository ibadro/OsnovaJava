package Black_Belt.t_4_Iterable.collection.List.binarySearch;

import java.util.ArrayList;
import java.util.Collections;

public class BinarySearchEx4 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(-3);
        arrayList.add(8);
        arrayList.add(12);
        arrayList.add(-8);
        arrayList.add(0);
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(1);
        arrayList.add(150);
        arrayList.add(-30);
        arrayList.add(19);

        System.out.println(arrayList); // [-3, 8, 12, -8, 0, 5, 10, 1, 150, -30, 19]
        Collections.sort(arrayList);
        System.out.println(arrayList); // [-30, -8, -3, 0, 1, 5, 8, 10, 12, 19, 150]

        Collections.reverse(arrayList); // сортировка в обратном порядке
        System.out.println(arrayList); // [150, 19, 12, 10, 8, 5, 1, 0, -3, -8, -30]

        Collections.shuffle(arrayList); // перемешать массив
        System.out.println(arrayList); // [10, 12, 19, 150, 1, -8, 0, -30, 5, 8, -3]
    }
}
