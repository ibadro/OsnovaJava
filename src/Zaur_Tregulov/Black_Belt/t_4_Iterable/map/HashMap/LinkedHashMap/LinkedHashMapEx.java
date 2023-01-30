package Zaur_Tregulov.Black_Belt.t_4_Iterable.map.HashMap.LinkedHashMap;

/**
 * LinkedHashMap является наследником HashMap. Хранит
 * информацию о порядке добавления элементов или
 * порядке их использования. Производительность
 * методов немного ниже, чем у методов HashMap.
 */

import java.util.LinkedHashMap;
import java.util.Objects;


public class LinkedHashMapEx {
    public static void main(String[] args) {
        LinkedHashMap<Double, Student> lhm = new LinkedHashMap<>(16, 0.75f, true);
        /**
         * • Initial capacity – начальный размер массива; чем он
         * больше тем больше выделяется памяти и больше времени поиска
         * • Load factor – коэффициент того, насколько массив
         * должен быть заполнен, после чего его размер будет
         * увеличен вдвое. (в float) чем он больше тем меньше памяти
         * и больше времени поиска
         * • Access Order - указывает каким образом будет осуществляться
         * доступ к элементам при использовании итератора. При значении
         * true — по порядку последнего доступа. При значении false доступ
         * осуществляется в том порядке, в каком элементы были вставлены.
         * accessOrder == true
         * В такой ситуации поведение LinkedHashMap меняется и при вызовах
         * методов get() и put() порядок элементов будет изменен — элемент к
         * которому обращаемся будет помещен в конец.
         */

        Student st3 = new Student("Sergey", "Petrov", 4);
        Student st4 = new Student("Igor", "Sidorov", 2);
        Student st1 = new Student("Andrey", "Andreev", 3);
        Student st2 = new Student("Mariya", "Ivanova", 1);
        lhm.put(7.5, st4);
        lhm.put(5.8, st1);
        lhm.put(6.4, st2);
        lhm.put(7.2, st3);

        System.out.println(lhm);
        // {7.5=Student{name='Igor', surname='Sidorov', course=2},
        // 5.8=Student{name='Andrey', surname='Andreev', course=3},
        // 6.4=Student{name='Mariya', surname='Ivanova', course=1},
        // 7.2=Student{name='Sergey', surname='Petrov', course=4}}

        System.out.println(lhm.get(5.8)); // Student{name='Andrey', surname='Andreev', course=3} - переместится в конец
        System.out.println(lhm.get(7.5)); // Student{name='Igor', surname='Sidorov', course=2} - переместится в конец

        System.out.println(lhm);
        // {6.4=Student{name='Mariya', surname='Ivanova', course=1},
        // 7.2=Student{name='Sergey', surname='Petrov', course=4},
        // 5.8=Student{name='Andrey', surname='Andreev', course=3},
        // 7.5=Student{name='Igor', surname='Sidorov', course=2}}
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

