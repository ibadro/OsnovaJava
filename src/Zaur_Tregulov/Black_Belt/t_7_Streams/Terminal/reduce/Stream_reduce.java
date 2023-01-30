package Zaur_Tregulov.Black_Belt.t_7_Streams.Terminal.reduce;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Stream_reduce {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(2);
        list.add(4);
        list.add(3);

        int result = list.stream().reduce((summValue, element)
                -> summValue * element).get();
        System.out.println(result); // 960
        // 5   8   2   4   3
        // summValue =  5   40  80  320 960
        // element =    8   2   4   3
        // присваивает summValue = 1
        int result2 = list.stream().reduce(1, (summValue, element)
                -> summValue * element);
        System.out.println(result); // 960
        // 5   8   2   4   3
        // summValue =  1    5   40  80  320 960
        // element =    5    8   2   4   3

        /** Если список пустой, то get() выдаст ошибку */
//        List<Integer> list100 = new ArrayList<>();
//        int result100 = list100.stream().reduce((summValue, element)
//                -> summValue * element).get();
//        System.out.println(result100);

        /** Надо так */
        List<Integer> list100 = new ArrayList<>();
        Optional<Integer> o = list100.stream().reduce((summValue, element)
                -> summValue * element);
        if (o.isPresent()) {
            System.out.println(o);
        } else {
            System.out.println("Не присутствует");
        }

        List<String> list3 = new ArrayList<>();
        list3.add("privet");
        list3.add("kak dela?");
        list3.add("OK");
        list3.add("poka");
        String result3 = list3.stream().reduce((a, e) -> a + " " + e).get();
        System.out.println(result3);
    }
}
