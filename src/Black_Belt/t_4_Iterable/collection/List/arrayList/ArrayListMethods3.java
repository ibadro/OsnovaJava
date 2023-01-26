package Black_Belt.t_4_Iterable.collection.List.arrayList;

import java.util.ArrayList;

public class ArrayListMethods3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<String>(); // второй раз <String> можно не указывать
        arrayList1.add("Андрей"); // метод .add() добавляет элемент в конец списка
        arrayList1.add("Саша");
        arrayList1.add("Мася");
        arrayList1.add("Андрей");
        System.out.println(arrayList1); // [Андрей, Саша, Мася]

        ArrayList<String> arrayList2 = new ArrayList<String>(); // второй раз <String> можно не указывать
        arrayList2.add("!!!"); // метод .add() добавляет элемент в конец списка
        arrayList2.add("???");
        arrayList1.addAll(arrayList2); // метод addAll() добавляет все элементы массива из параметра
        System.out.println(arrayList1); // [Андрей, Саша, Мася, !!!, ???]

        arrayList1.addAll(1, arrayList2); // // метод addAll() добавляет все элементы массива
        // из параметра начиная с 1-го индекса
        System.out.println(arrayList1); // [Андрей, !!!, ???, Саша, Мася, !!!, ???]

        int index  =  arrayList1.indexOf("Андрей"); // ищет с начала списка, возвращает индекс элемента в параметре
        System.out.println(index); // 0
        int indexEnd = arrayList1.lastIndexOf("Андрей"); // ищет с конца списка, возвращает индекс элемента в параметре
        System.out.println(indexEnd); //5

        System.out.println(arrayList1.size()); // возвращает int размер списка

        System.out.println(arrayList1.contains("Мася")); // содержит ли список элемент из параметра true/false

        System.out.println(arrayList1.toString()); // метод выводит в читабельном виде список, можно не писать его

        arrayList1.clear(); // очищает список
        System.out.println(arrayList1); // []

        arrayList1.isEmpty(); // если список пуст то true иначе false
        System.out.println(arrayList1.isEmpty()); // true
    }
}
