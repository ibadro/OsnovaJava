package Black_Belt.t_4_Iterable.map.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1000, "Иван Иванов"); // метод put() добавляет элементы в Map
        map1.put(3568, "Петр Петров");
        map1.put(6578, "Сергей Сергеев");
        map1.put(15879, "Василий Васильев");
        map1.put(3568, "Олег Васильев"); // если добавить объекты с одинаковым ключом,
        // то останется только последний добавленый
        map1.put(null, "Олег Васильев"); // можно добавить объекты с ключом равным null
        map1.put(3558, null); // // можно добавить объекты cо значение null
        map1.putIfAbsent(1000, "Дмитрий Дмитриев"); // не добавит так как ключ 1000 уже есть
        map1.putIfAbsent(1001, "Иван Иванов");
        System.out.println(map1.get(1000)); // "Иван Иванов"
        map1.remove(15879);
        System.out.println(map1.containsKey(1000));
        System.out.println(map1.containsValue("Иван Иванов"));
        System.out.println("keySet() " + map1.keySet());
        System.out.println("values() " + map1.values());
        System.out.println("entrySet() " + map1.entrySet());

        System.out.println("map1 = " + map1);

        /**
         * Элементами HashMap являются пары ключ/значение.
         * HashMap не запоминает порядок добавления элементов.
         * Его методы работают очень быстро.
         * Ключи элементов должны быть уникальными.
         * Ключ может быть null.
         * Значения элементов могут повторяться.
         * Значения могут быть null
         * put - добавить в Map
         * putIfAbsent - добавить элемент если его нету в Map
         * get - вывести значение по введенному ключу
         * remove - удалить из Map по значению ключа
         * containsKey - есть ли элемент с таким ключем (true/false)
         * containsValue - есть ли элемент с таким значением (true/false)
         * keySet - возвращает множество всех ключей в Map
         * values - возвращает множество всех значений в Map
         * entrySet - возвращает множество всех ключей и значений в Map
         */

        Map<String, String> mapStr = new HashMap<>();
        mapStr.put("Миша", "Добрый");
        mapStr.put("Саша", "Умный");
        mapStr.put("Петя", "Сильный");
        mapStr.put("Коля", "Хороший");
        mapStr.put("Женя", "Большой");
        System.out.println(mapStr);
    }
}
