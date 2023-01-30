package Zaur_Tregulov.Black_Belt.t_4_Iterable.map.TreeMap;

import java.util.Objects;
import java.util.TreeMap;

public class TreeMapEx1 {
    public static void main(String[] args) {
        TreeMap<Double, Student> treeMap = new TreeMap<>();
        Student st1 = new Student("Andrey", "Andreev", 3);
        Student st2 = new Student("Mariya", "Ivanova", 1);
        Student st3 = new Student("Sergey", "Petrov", 4);
        Student st4 = new Student("Igor", "Sidorov", 2);
        Student st5 = new Student("Vasiliy", "Smirnov", 1);
        Student st6 = new Student("Sasha", "Kapustin", 3);
        Student st7 = new Student("Elena", "Sidorova", 4);
        Student st8 = new Student("Elena", "Sidorova", 4);
        Student st9 = new Student("Petr", "Sidorova", 4);
        treeMap.put(8.2, st6);
        treeMap.put(6.4, st2);
        treeMap.put(9.1, st7);
        treeMap.put(7.2, st3);
        treeMap.put(7.5, st4);
        treeMap.put(5.8, st1);
        treeMap.put(7.9, st5);
        treeMap.put(3.2, st8);
        treeMap.put(9.1, st9); // заменит студента с таким же ключом(9.1)

        System.out.println(treeMap);
        System.out.println(treeMap.get(6.4)); // Student{name='Mariya', surname='Ivanova', course=1}
        treeMap.remove(5.8); // удалит студента с указанным ключом(5.8)
        treeMap.descendingMap(); // отсортирует Map в обратном порядке (по убыванию)
        System.out.println(treeMap.tailMap(7.3)); // вывести ключи выше чем 7.3 (вкючительно)
        System.out.println(treeMap.headMap(7.3)); // вывести ключи ниже чем 7.3
        System.out.println(treeMap.lastEntry()); // возвращает последний элемент
        System.out.println(treeMap.firstEntry()); // возвращает первый элемент


        TreeMap<Student, Double> treeMap2 = new TreeMap<>();
        treeMap2.put(st6, 8.2);
        treeMap2.put(st2, 6.4);
        treeMap2.put(st7, 9.1);
        treeMap2.put(st3, 7.2);
        treeMap2.put(st4, 7.5);
        treeMap2.put(st1, 5.8);
        treeMap2.put(st5, 7.9);
    }

}

class Student {
    String name;
    String surname;
    int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' +
                ", surname='" + surname + '\'' + ", course=" + course + '}';
    }
}
