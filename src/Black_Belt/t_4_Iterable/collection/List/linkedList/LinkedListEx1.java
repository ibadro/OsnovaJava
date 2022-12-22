package Black_Belt.t_4_Iterable.collection.List.linkedList;

import java.util.LinkedList;

public class LinkedListEx1 {
    public static void main(String[] args) {
        Student st1 = new Student("Иван", 3);
        Student st2 = new Student("Николай", 2);
        Student st3 = new Student("Елена", 1);
        Student st4 = new Student("Петр", 4);
        Student st5 = new Student("Мария", 3);

        LinkedList<Student> studentLinkedList = new LinkedList<>();
        studentLinkedList.add(st1);
        studentLinkedList.add(st2);
        studentLinkedList.add(st3);
        studentLinkedList.add(st4);
        studentLinkedList.add(st5);
        System.out.println("LinkedList = " + studentLinkedList);

        /**
         * Чтобы дойти до нужного элемента, LinkedList переберет все элементы,
         * если элемент ближе к началу то начиная с первого, если к концу, то с последнего.
         * Это называется Doubly Linked list.
         * Элементы LinkedList представляют собой звенья одной цепи. Каждый
         * элемент знает только о себе и имеет в себе ссылку на ближайшие к нему
         * элементы (предыидущий и следующий).
         * Когда элемент хранит в себе ссылку только на последующий элемент, это Singly Linked list
         * тогда поиск иде только с начала и до нужного элемента.
         */
        System.out.println(studentLinkedList.get(2)); // выдает элемент с указанным индексом
        System.out.println(studentLinkedList.getFirst()); // выдает первый элемент
        System.out.println(studentLinkedList.getLast()); // выдает последний элемент
        System.out.println(studentLinkedList.getClass()); // выдает класс объекта

        Student st6 = new Student("Света", 3);
        Student st7 = new Student("Мартин", 4);
        studentLinkedList.add(st6);
        System.out.println("LinkedList = " + studentLinkedList);
        studentLinkedList.add(1, st7);
        System.out.println("LinkedList = " + studentLinkedList);
        studentLinkedList.remove(3);
        System.out.println("LinkedList = " + studentLinkedList);
    }
}

class Student{
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' +
                ", course=" + course + '}';
    }
}
