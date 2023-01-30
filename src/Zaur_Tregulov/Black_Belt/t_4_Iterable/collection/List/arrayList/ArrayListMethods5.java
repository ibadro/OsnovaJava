package Zaur_Tregulov.Black_Belt.t_4_Iterable.collection.List.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods5 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<String>(); // второй раз <String> можно не указывать
        arrayList1.add("Андрей"); // метод .add() добавляет элемент с конец списка
        arrayList1.add("Саша");
        arrayList1.add("Мася");
        arrayList1.add("Дима");
        arrayList1.add("Андрей");

        ArrayList<String> arrayList2 = new ArrayList<String>(); // второй раз <String> можно не указывать
        arrayList2.add("Андрей"); // метод .add() добавляет элемент с конец списка
        arrayList2.add("Саша");
        arrayList2.add("Мария");

        List<String> myList = arrayList1.subList(1, 4); // создает из ArrayList List из указанного в аргументе диапазона индексов
        System.out.println(myList); // [Саша, Мася, Дима]
        /** List<String> myList не существует без arrayList1
         После этого нельзя будет модифицировать arrayList1 напрямую: arrayList1.add("Маша"); - выдаст ошибку */


        System.out.println(myList);
        System.out.println(arrayList1);

        // arrayList1.removeAll(arrayList2); // метод оставляет в списке элементы массива которые сходятся в массивом из параметра
        System.out.println(arrayList1); // [Мася, Дима]

        arrayList1.retainAll(arrayList2); // метод удаляет элементы массива которые сходятся в массивом из параметра
        System.out.println(arrayList1); // [Андрей, Саша, Андрей]

        Object[] array = arrayList1.toArray(); // получит саммив типа Objekt из ArrayList

        String[] arrayString = arrayList2.toArray(new String[0]); // часто используют 0


        List<Integer> list = List.of(3, 8, 13); // создает неизменяемый массив из коллекции

        ArrayList<String> arrayList3 = new ArrayList<String>(); // второй раз <String> можно не указывать
        arrayList3.add("Андрей"); // метод .add() добавляет элемент с конец списка
        arrayList3.add("Саша");
        arrayList3.add("Мася");
        arrayList3.add("Дима");
        arrayList3.add("Андрей");

        List<String> list2 = List.copyOf(arrayList2); // создает List копирую в него коллекцию, также List неизменяемый массив
        System.out.println("list2 -->" + list2); // list2 -->[Андрей, Саша, Мария]
    }
}
