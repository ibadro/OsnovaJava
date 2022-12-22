package Black_Belt.t_4_Iterable.map.TreeMap;

import java.util.Objects;
import java.util.TreeMap;

public class TreeMapEx3 {
    public static void main(String[] args) {
        TreeMap<Double, Student2> treeMap = new TreeMap<>();
        Student2 st1 = new Student2("Andrey", "Andreev", 3);
        Student2 st2 = new Student2("Mariya", "Ivanova", 1);
        Student2 st3 = new Student2("Sergey", "Petrov", 4);
        Student2 st4 = new Student2("Igor", "Sidorov", 2);
        Student2 st5 = new Student2("Vasiliy", "Smirnov", 1);
        Student2 st6 = new Student2("Sasha", "Kapustin", 3);
        Student2 st7 = new Student2("Elena", "Sidorova", 4);

        treeMap.put(5.8, st1);
        treeMap.put(6.4, st2);
        treeMap.put(7.2, st3);
        treeMap.put(7.5, st4);
        treeMap.put(7.9, st5);
        treeMap.put(8.2, st6);
        treeMap.put(9.1, st7);
    }
}

class Student2 {
    String name;
    String surname;
    int course;

    public Student2(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student2 student = (Student2) o;
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
