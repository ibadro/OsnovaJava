package Zaur_Tregulov.Black_Belt.t_4_Iterable.collection.List.binarySearch;

import java.util.Arrays;

public class BinarySearchEx3 {
    public static void main(String[] args) {
        int[] array = {-3, 8, 12, -8, 0, 5, 10, 1, 150, -30, 19};
        System.out.println(Arrays.toString(array)); // Arrays.toString() // метод вывода массива на экран
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int index = Arrays.binarySearch(array, 150);
        System.out.println(index);
    }
}
