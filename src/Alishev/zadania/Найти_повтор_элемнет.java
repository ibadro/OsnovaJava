package Alishev.zadania;

import java.util.HashSet;

public class Найти_повтор_элемнет {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 3, 6};
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                System.out.println("Повторяющееся число: " + arr[i]);
                break;
            }
            set.add(arr[i]);
        }
    }
}
