package Black_Belt.t_4_Iterable.collection.List.arrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<String>(); // второй раз <String> можно не указывать
        arrayList1.add("Андрей"); // метод .add() добавляет элемент с конец списка
        arrayList1.add("Саша");
        arrayList1.add("Мася");
        arrayList1.add(1, "Миша"); // добавить Миша на 1 индекс
        System.out.println(arrayList1); // [Андрей, Миша, Саша, Мася]

        System.out.println(arrayList1.get(3)); // Мася

    }
}
