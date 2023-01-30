package Задачи.zadania;

import java.util.LinkedHashSet;
import java.util.Set;

public class Уник_эл_мас {
    public static void main(String[] args) {
        int[] numbers = {1, 1, 2, 1, 3, 4, 5};
        Set<Integer> setUniqueNumbers = new LinkedHashSet<Integer>();
        for(int x : numbers) {
            setUniqueNumbers.add(x);
        }
        for(Integer x : setUniqueNumbers) {
            System.out.println(x);
        }
    }
}
