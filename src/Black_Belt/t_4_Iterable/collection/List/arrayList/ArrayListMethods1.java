package Black_Belt.t_4_Iterable.collection.List.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<String>(); // второй раз <String> можно не указывать
        arrayList1.add("Андрей"); // метод .add() добавляет элемент в конец списка
        arrayList1.add("Саша");
        arrayList1.add("Мася");
        arrayList1.add(1, "Миша"); // добавить Миша на 1 индекс
        System.out.println(arrayList1); // [Андрей, Миша, Саша, Мася]

        System.out.println(arrayList1.get(3)); // Мася

        //method get()
        for (int i = 0; i < arrayList1.size(); i++) {
            System.out.println(arrayList1.get(i));
        }
        System.out.println("********************2");

        //method set()
        //в этом примере мы вставляем Rob на позицию 1
        arrayList1.set(1, "Rob");
        for (String s : arrayList1) {
            System.out.println(s);
        }
        System.out.println("********************3");

        //method remove()
        //после удаления все элементы смещаются влево
        arrayList1.remove(0);
        arrayList1.remove("Rob");

        List<String> arrayLis2 = new ArrayList<>(arrayList1);
        System.out.println(arrayLis2);

    }
}
