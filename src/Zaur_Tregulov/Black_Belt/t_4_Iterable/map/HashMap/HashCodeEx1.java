package Zaur_Tregulov.Black_Belt.t_4_Iterable.map.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeEx1 {
    public static void main(String[] args) {
        Map<Student, Double> map = new HashMap<>();
        Student st1 = new Student("Andrey", "Andreev", 3);
        Student st2 = new Student("Mariya", "Ivanova", 1);
        Student st3 = new Student("Sergey", "Petrov", 4);
        map.put(st1, 7.5);
        map.put(st2, 8.7);
        map.put(st3, 9.2);
        System.out.println(map);

        Student st4 = new Student("Andrey", "Andreev", 3);
        boolean result = map.containsKey(st4); // false, т.к. не перезаписан метод hashCode,
        // после перезаписи equals() и hashCode() true, т.к. сначала идет сверка через
        // hashCode(), и если true, то потом через equals()
        System.out.println("result = " + result);
        System.out.println(st1.equals(st4)); // true

        System.out.println(st1.hashCode());
        System.out.println(st2.hashCode());
        System.out.println(st3.hashCode());
        System.out.println(st4.hashCode());
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
        return course == student.course &&
                Objects.equals(name, student.name) &&
                Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }


//        @Override
//    public int hashCode() {
//        return name.length() * 7 + surname.length() * 11 + course + 53;
//    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' +
                ", surname='" + surname + '\'' + ", course=" + course + '}';
    }
    /**
     * Если Вы переопределили equals, то переопределите и hashcode.
     *
     * Результат нескольких выполнений метода hashcode для одного и
     * того же объекта должен быть одинаковым.
     *
     * Если, согласно методу equals, два объекта равны, то и hashcode
     * данных объектов обязательно должен быть одинаковым.
     *
     * Если, согласно методу equals, два объекта НЕ равны, то hashcode
     * данных объектов НЕ обязательно должен быть разным.
     *
     * Ситуация, когда результат метода hashcode для разных объектов
     * одинаков, называется коллизией. Чем её меньше, тем лучше.
     */
}

