package Black_Belt.t_2_Interface.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        // Пример работы метода Collections.sort со String
        List<String> list = new ArrayList<>();
        list.add("Женя");
        list.add("Екатерина");
        list.add("Даша");
        list.add("Геннадий");
        list.add("Вера");
        list.add("Борис");
        list.add("Андрей");

        System.out.println("---------- Перед сортировкой ----------");
        System.out.println(list);
        Collections.sort(list); // Метод Collections.sort без проблем работает со String и Integer
        System.out.println("---------- После сортировки ----------");
        System.out.println(list);

        // Пример работы метода Collections.sort с Integer
        List<Integer> list2 = new ArrayList<>();
        Random random = new Random();
        for (int i = 1; i <= 10; i++) { // цикл на 10 итераций
            int count = random.nextInt(10) + 1; // диапазон от 0 до 9, + 1 чтобы стало от 1 до 10.
            list2.add(count); // заполянем список случайными цифрами
        }
        System.out.println("---------- Перед сортировкой ----------");
        System.out.println(list2);
        Collections.sort(list2);
        System.out.println("---------- После сортировки ----------");
        System.out.println(list2);
    }
}
