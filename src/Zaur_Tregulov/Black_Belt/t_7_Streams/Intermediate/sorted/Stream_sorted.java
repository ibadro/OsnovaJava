package Zaur_Tregulov.Black_Belt.t_7_Streams.Intermediate.sorted;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_sorted {
    public static void main(String[] args) {
        int[] array = {3, 8, 1, 5, 9, 12, 4, 21, 81, 7, 18};
        // Взяли наш первоначальный список
        array =
                // преобразовали Array в Stream
                Arrays.stream(array)
                        // отсортировали по-умолчанию
                        .sorted()
                                // преобразовали Stream в Array
                                .toArray();
        System.out.println(Arrays.toString(array)); // [1, 3, 4, 5, 7, 8, 9, 12, 18, 21, 81]

        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Mariya", 'f', 23, 3, 7.4);

        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        // выдаст ошибку, т.к. java не знает по какому параметру соратировать
//        students = students.stream().sorted().collect(Collectors.toList());

        // преобразовали List в Stream
        students = students.stream()
                // примен. метод sorted и в парам. прописали лямбда с compareTo
                .sorted((el1, el2)-> el1.getName().compareTo(el2.getName()))
                // преобразовали Stream в List
                .collect(Collectors.toList());

        System.out.println(students); // получили отсортированный по имени список студентов
        // сортировка по курсу
        students = students.stream().sorted((stud1, stud2)-> stud1.getCourse() - stud2.getCourse()).collect(Collectors.toList());
        System.out.println(students);
    }
}

class Student {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' +
                ", sex=" + sex + ", age=" + age +
                ", course=" + course + ", avgGrade=" + avgGrade + '}';
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public char getSex() {
        return sex;
    }
    public void setSex(char sex) {
        this.sex = sex;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getCourse() {
        return course;
    }
    public void setCourse(int course) {
        this.course = course;
    }
    public double getAvgGrade() {
        return avgGrade;
    }
    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }
}