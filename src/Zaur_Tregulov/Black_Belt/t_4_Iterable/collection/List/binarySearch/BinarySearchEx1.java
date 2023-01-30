package Zaur_Tregulov.Black_Belt.t_4_Iterable.collection.List.binarySearch;

import java.util.ArrayList;
import java.util.Collections;

public class BinarySearchEx1 {
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
        System.out.println(arrayList);
        int index = Collections.binarySearch(arrayList, 12);
        System.out.println(index); // -9 - потому что список не отсортирован
        Collections.sort(arrayList);
        int index2 = Collections.binarySearch(arrayList, 12);
        System.out.println(arrayList);
        System.out.println(index2); // 8
    }
}
