package Zaur_Tregulov.Black_Belt.t_4_Iterable.map.TreeMap;

import java.util.Comparator;
import java.util.Objects;
import java.util.TreeMap;

public class TreeMapEx2 {
    public static void main(String[] args) {
        TreeMap<StudentS, Double> treeMap2 = new TreeMap<>();
        StudentS st1 = new StudentS("Andrey", "Andreev", 3);
        StudentS st2 = new StudentS("Mariya", "Ivanova", 1);
        StudentS st3 = new StudentS("Sergey", "Petrov", 4);
        StudentS st4 = new StudentS("Igor", "Sidorov", 2);
        StudentS st5 = new StudentS("Vasiliy", "Smirnov", 1);
        StudentS st6 = new StudentS("Sasha", "Kapustin", 3);
        StudentS st7 = new StudentS("Elena", "Sidorova", 4);
        treeMap2.put(st6, 8.2);
        treeMap2.put(st2, 6.4);
        treeMap2.put(st7, 9.1);
        treeMap2.put(st3, 7.2);
        treeMap2.put(st4, 7.5);
        treeMap2.put(st1, 5.8);
        treeMap2.put(st5, 7.9);
        System.out.println(treeMap2);
        /**
         * Нельзя добавить в TreeMap элементы с ключом StudentS, т.к. TreeMap не знает по какому
         * параметру StudentS сортировать список. Для этого надо в Объект StudentS имплиментировать
         * Comparable <StudentS> и переписать метод compareTo().
         * ЛИБО реализовать компаратор
         */

        TreeMap<StudentS, Double> treeMap3 = new TreeMap<>(new Comparator<StudentS>() {
            @Override
            public int compare(StudentS o1, StudentS o2) {
                return o1.name.compareTo(o2.name);
            }
        });

        treeMap3.put(st6, 8.2);
        treeMap3.put(st2, 6.4);
        treeMap3.put(st7, 9.1);
        treeMap3.put(st3, 7.2);
        treeMap3.put(st4, 7.5);
        treeMap3.put(st1, 5.8);
        treeMap3.put(st5, 7.9);
        System.out.println(treeMap3);

    }
}

class StudentS implements Comparable<StudentS> {
    String name;
    String surname;
    int course;

    public StudentS(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentS student = (StudentS) o;
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

    @Override
    public int compareTo(StudentS o) {
        return this.name.compareTo(o.name);
    }
}
