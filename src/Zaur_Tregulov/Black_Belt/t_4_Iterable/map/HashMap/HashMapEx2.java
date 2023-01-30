package Zaur_Tregulov.Black_Belt.t_4_Iterable.map.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashMapEx2 {
    public static void main(String[] args) {
        Map<Student, Double> map = new HashMap<>(); // создался массив размером 16
        // Каждый эллемент массива содержит в себе LinkedList
        Student st1 = new Student("Andrey", "Andreev", 3);
        Student st2 = new Student("Mariya", "Ivanova", 1);
        Student st3 = new Student("Sergey", "Petrov", 4);
        map.put(st1, 7.5);
        map.put(st2, 6.2);
        map.put(st3, 9.3);

        for(Map.Entry<Student, Double> entry: map.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

    }
}


class StudentS {
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
        return course == student.course &&
                Objects.equals(name, student.name) &&
                Objects.equals(surname, student.surname);
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
