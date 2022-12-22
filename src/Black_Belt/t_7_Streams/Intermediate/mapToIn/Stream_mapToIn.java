package Black_Belt.t_7_Streams.Intermediate.mapToIn;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_mapToIn {
    public static void main(String[] args) {
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


        List<Integer> courses = students.stream()
                /** возвращает int элементов */
                .mapToInt(el -> el.getCourse())
                /** конвертирует примитивы в Обертки */
                .boxed()
                .collect(Collectors.toList());

        System.out.println(courses); // [3, 2, 1, 4, 3]

        List<Double> courses2 = students.stream()
                /** возвращает int элементов */
                .mapToDouble(el -> el.getAvgGrade())
                /** конвертирует примитивы в Обертки */
                .boxed()
                .collect(Collectors.toList());

        System.out.println(courses2); // [8.3, 6.4, 8.9, 7.0, 7.4]

        int sum = students.stream().mapToInt(el -> el.getCourse())
                /** возвращает сумму элементов */
                .sum();
        System.out.println(sum);

        double average = students.stream().mapToInt(el -> el.getCourse())
                /** возвращает среднее арифметическое элементов */
                .average()
                /** преобразует в double */
                .getAsDouble();
        System.out.println(average);

        int min = students.stream().mapToInt(el -> el.getCourse())
                /** возвращает среднее арифметическое элементов */
                .min()
                /** преобразует в int */
                .getAsInt();
        System.out.println(min);

        int max = students.stream().mapToInt(el -> el.getCourse())
                /** возвращает среднее арифметическое элементов */
                .max()
                /** преобразует в int */
                .getAsInt();
        System.out.println(max);
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
