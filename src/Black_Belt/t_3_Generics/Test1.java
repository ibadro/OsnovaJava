package Black_Belt.t_3_Generics;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        // Не использую generics. Не расписываю какие элементы будет содержать мой ArrayList
        // Без <> сырой тип, не параметризированный
        List list = new ArrayList();
        // В основе листа лежит класс Objekt, поэтому можно добавлять все его субклассы
        list.add("OK");
        list.add(5);
        list.add(new StringBuilder("Helo"));
        list.add(new Car());


        List list1 = new ArrayList();
        list1.add("Hello");
        list1.add("Bye");
        list1.add("Ok");
        list1.add("qwerty");
        list1.add(new Car()); // выдаст ошибку, потому как Car нельзя скастить в String
        // Элементами list1 являются Object
        for (Object o : list1) {
            // Скастили элемнт Object до String
            System.out.println(o + " длина " + ((String) o).length());
        }
        // Параметризированный тип. <> - diamond
        List<String> list2 = new ArrayList<>();
        list2.add("Hello");
        list2.add("Bye");
        list2.add("Ok");
        list2.add("qwerty");
        // list2.add(new Car()); - так писать нельзя т.к. параметр String, list2 может содержать только String.
    }
}

class Car {
}
