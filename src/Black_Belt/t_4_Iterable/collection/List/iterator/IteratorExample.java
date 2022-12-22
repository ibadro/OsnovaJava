package Black_Belt.t_4_Iterable.collection.List.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<String>(); // второй раз <String> можно не указывать
        arrayList1.add("Андрей"); // метод .add() добавляет элемент с конец списка
        arrayList1.add("Саша");
        arrayList1.add("Мася");
        arrayList1.add("Дима");
        arrayList1.add("Петя");

        Iterator<String> iterator = arrayList1.iterator();
        while (iterator.hasNext()){ // если есть следующий элемент
            System.out.println(iterator.next()); // то выводи его на экран
        }

        while (iterator.hasNext()){ // если есть следующий элемент
            iterator.next(); // получаем этот элемент, без получения элемента его нельзя удалить
            iterator.remove(); // удаляем этот элемент
        }
        System.out.println(arrayList1); // [] - вывод arrayList1
    }
}
