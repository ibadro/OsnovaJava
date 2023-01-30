package Zaur_Tregulov.Black_Belt.t_6_Lambda.Consumer;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> list = List.of("privet", "kak dela?", "normal'no", "poka");
        for (String s : list){
            System.out.println(s);
        }
        /** Можно записать короче */
        list.forEach(str -> System.out.println(str));
//        privet
//        kak dela?
//        normal'no
//        poka

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.forEach(intE -> {
            System.out.print(intE + " * 2 = ");
            intE *= 2;
            System.out.println(intE);
        });
    }
}
