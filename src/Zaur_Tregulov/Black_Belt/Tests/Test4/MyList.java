package Zaur_Tregulov.Black_Belt.Tests.Test4;

import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public interface MyList<E> {

//    Собственная реализация ArrayList
//    интерфейc: MyList<T>
//    реализация: MyArrayList<T>

    //МЕТОДЫ
    void add(int index, E obj); //: добавляет в список по индексу index объект obj

    boolean addAll(int index, MyList<? extends E> col); //: добавляет в список по индексу index все
    // элементы коллекции col. Если в результате добавления список был изменен, то
    // возвращается true, иначе возвращается false

    E get(int index); //: возвращает объект из списка по индексу index

    int indexOf(Object obj); //: возвращает индекс первого вхождения объекта obj в список. Если
    // объект не найден, то возвращается -1

    int lastIndexOf(Object obj); //: возвращает индекс последнего вхождения объекта obj в список.
    // Если объект не найден, то возвращается -1
    ListIterator<E> listIterator (); //: возвращает объект ListIterator для обхода элементов списка
    //static <E> List<E> of(element); //: создает из набора элементов объект List
    E remove(int index); //: удаляет объект из списка по индексу index, возвращая при этом удаленный объект
    E set(int index, E obj); //: присваивает значение объекта obj элементу, который находится по индексу index

    void sort(Comparator<? super E> comp); //: сортирует список с помощью компаратора comp

    List<E> subList(int start, int end);

    // КОНСТРУКТОРЫ
//    MyArrayList(); //: создает пустой список
//    MyArrayList(MyList <? extends E> col); //: создает список, в который добавляются все
//    элементы коллекции col.
//    MyArrayList (int capacity); //: создает список, который имеет начальную емкость capacity

    //ДОПОЛНИТЕЛЬНО
//    Comparator и ListIterator используем дефолтные.(НЕ пишем свои)
//    В ходе выполнения задания может появится надобность в реализации методов из
//    Collection - это на ваше усмотрение, добавляем в ваш интерфейс и реализовываем.
//    Для сортировки возможно использовать любой способ(метода пузырьком будет
//            достаточно)





}
