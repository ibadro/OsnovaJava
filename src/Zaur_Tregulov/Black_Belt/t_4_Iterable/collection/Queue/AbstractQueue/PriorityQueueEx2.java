package Zaur_Tregulov.Black_Belt.t_4_Iterable.collection.Queue.AbstractQueue;

import java.util.Objects;
import java.util.PriorityQueue;

/**
 * PriorityQueue – это специальный вид очереди, в
 * котором используется натуральная сортировка или та,
 * которую мы описываем с помощью Comparable или
 * Comparator. Таким образом используется тот элемент из
 * очереди, приоритет которого выше.
 */

public class PriorityQueueEx2 {
    public static void main(String[] args) {
        Student st1 = new Student("Andrey", 5);
        Student st2 = new Student("Misha", 1);
        Student st3 = new Student("Igor", 2);
        Student st4 = new Student("Marina", 3);
        Student st5 = new Student("Olya", 4);
        PriorityQueue<Student> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(st1);
        priorityQueue.add(st2);
        priorityQueue.add(st3);
        priorityQueue.add(st4);
        priorityQueue.add(st5);
        System.out.println(priorityQueue.poll()); // первый элемент с наименьшим значением
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());

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
        return "Student [" +
                "name is " + name + '\'' +
                ", course is " + course +
                ']';
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