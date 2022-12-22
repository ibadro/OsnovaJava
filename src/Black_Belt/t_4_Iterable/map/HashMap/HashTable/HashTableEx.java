package Black_Belt.t_4_Iterable.map.HashMap.HashTable;

import java.util.Hashtable;
import java.util.Objects;

/**
 * HashTable устаревший класс, который работает по тем же
 * принципам, что и HashMap.
 * В отличии от HashMap является synchronized. По этой
 * причине его методы далеко не такие быстрые.
 * В HashTable ни ключ, ни значение не могут быть null.
 * Даже если нужна поддержка многопоточности
 * HashTable лучше не использовать. Следует использовать
 * ConcurrentHashMap.
 */

public class HashTableEx {
    public static void main(String[] args) {
        Hashtable<Double, Student> hashTable = new Hashtable<>();
        Student st3 = new Student("Sergey", "Petrov", 4);
        Student st4 = new Student("Igor", "Sidorov", 2);
        Student st1 = new Student("Andrey", "Andreev", 3);
        Student st2 = new Student("Mariya", "Ivanova", 1);
        hashTable.put(7.8, st1);
        hashTable.put(9.3, st2);
        hashTable.put(5.8, st3);
        hashTable.put(6.0, st4);
        // hashTable.put(null, st4);  не может быть null.
        // hashTable.put(6.0, null);  не может быть null.
        System.out.println(hashTable);
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


