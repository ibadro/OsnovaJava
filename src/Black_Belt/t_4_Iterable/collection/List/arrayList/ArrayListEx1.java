package Black_Belt.t_4_Iterable.collection.List.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<String>(); // второй раз <String> можно не указывать
        arrayList1.add("Андрей");
        arrayList1.add("Саша");
        arrayList1.add("Мася");
        System.out.println(arrayList1); // [Андрей, Саша, Мася]

        ArrayList<String> arrayList2 = new ArrayList<>(200); // создали список вместимостю 200
        arrayList2.add("Андрей");
        arrayList2.add("Саша");
        System.out.println(arrayList2.size()); // размер 2, вместимость 200

        List<String> arrayList3 = new ArrayList<>(); // потому что ArrayList - это List

        ArrayList<String> arrayList4 = new ArrayList<>(arrayList1);
        System.out.println(arrayList4); // [Андрей, Саша, Мася]
    }
}
