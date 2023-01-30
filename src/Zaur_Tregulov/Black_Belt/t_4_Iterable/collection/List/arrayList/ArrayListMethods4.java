package Zaur_Tregulov.Black_Belt.t_4_Iterable.collection.List.arrayList;

import java.util.Arrays;
import java.util.List;

public class  ArrayListMethods4 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        StringBuilder sb4 = new StringBuilder("D");
        StringBuilder sb5 = new StringBuilder("E");

        StringBuilder[] array = {sb1, sb2, sb3, sb4};
        // Получаем List из массива
        List<StringBuilder> list = Arrays.asList(array);
        /** Длину List уже нельзя изменить. Он на прямую зависит
         *  от StringBuilder[] array */
        System.out.println(list); // [A, B, C, D]
        array[0].append("!!!");
        System.out.println(list); // изменили array изменился и list
        // [A!!!, B, C, D]
        array[0] = new StringBuilder("F");
        System.out.println(list); // [F, B, C, D]
    }
}
