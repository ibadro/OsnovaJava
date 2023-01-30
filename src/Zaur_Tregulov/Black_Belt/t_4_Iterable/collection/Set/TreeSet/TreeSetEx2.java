package Zaur_Tregulov.Black_Belt.t_4_Iterable.collection.Set.TreeSet;

import java.util.Objects;
import java.util.TreeSet;

public class TreeSetEx2 {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<>();
        Student st1 = new Student("Andrey", 5);
        Student st2 = new Student("Misha", 1);
        Student st3 = new Student("Igor", 2);
        Student st4 = new Student("Marina", 3);
        Student st5 = new Student("Olya", 4);
        treeSet.add(st1);
        treeSet.add(st2);
        treeSet.add(st3);
        treeSet.add(st4);
        treeSet.add(st5);

        System.out.println(treeSet); // без Comparable или Comparator выдаст ошибку
        // т.к. не знает пор какому параметру сортировать.
        System.out.println(treeSet.first()); // Student{name='Misha', course=1}
        System.out.println(treeSet.last()); // Student -=name is Andrey', course is 5=-
        Student st6 = new Student("Oleg", 3);
        System.out.println(treeSet.headSet(st6)); // вывести студентов которые учатся на кусах ниже чем st6
        // [Student -=name is Misha', course is 1=-, Student -=name is Igor', course is 2=-]
        System.out.println(treeSet.tailSet(st6)); // от st6 (включительно) и до окнца
        // [Student -=name is Marina', course is 3=-, Student -=name is Olya', course is 4=-, Student -=name is Andrey', course is 5=-]
        Student st7 = new Student("Anja", 2);
        Student st8 = new Student("Ivan", 4);
        System.out.println(treeSet.subSet(st7, st8)); // выдаст студентов со 2 по 3 курс (2 <= st < 4)
        System.out.println(st6.equals(st4)); // true
        System.out.println(st4.hashCode()); // 34
        System.out.println(st6.hashCode()); // 34
    }

}

class Student implements Comparable<Student> {
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student -=" +
                "name is " + name + '\'' +
                ", course is " + course +
                "=-";
    }

    @Override
    public int compareTo(Student other) {
        return this.course - other.course; // сортировка по курсу
    }

    /**
     * Желательно всегда переопределять методы equals() и hashCode()
     * если метод a.equals(b) возвращает true, то метод a.compareTo(b)
     * должен возвращать 0
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course;
        // убрали сравнение имен чтобы метод a.compareTo(b) вернул 0

    }

    @Override
    public int hashCode() {
        return Objects.hash(course);
        // убрали сравнение имен чтобы метод a.compareTo(b) вернул 0
    }
}