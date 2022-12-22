package Black_Belt.t_4_Iterable.collection.Set.HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Andrey");
        set.add("Oleg");
        set.add("Marina");
        set.add("Igor");
        set.add("Igor"); // не добавит, потому что множество не может содержать дубликаты
        set.add(null); // возможно добавить
        System.out.println(set); // [Igor, Andrey, Oleg, Marina]

        set.remove("Andrey");

        for (String s : set){
            System.out.println(s);
        }
        System.out.println(set.size()); // 4
        System.out.println(set.isEmpty()); // false
        System.out.println(set.contains("Misha")); // true
    }
}
