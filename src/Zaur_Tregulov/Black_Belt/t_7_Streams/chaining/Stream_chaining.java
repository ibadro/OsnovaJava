package Zaur_Tregulov.Black_Belt.t_7_Streams.chaining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stream_chaining {
    public static void main(String[] args) {
        int[] array = {3, 8, 1, 5, 9, 12, 4, 21, 81, 7, 18};

        // Arrays в Stream
        int result = Arrays.stream(array)
                // фильтруем, если число при делении на 2 в остатке дает 1 то пропустить
                .filter(el -> el%2 == 1)
                        // map перебирает кажд. эл. если эл. делится на 3 без остатка
                .map(el ->{if(el%3==0)
                        // то дели его на 3 и возвращай
                        {el = el/3;} return el;})
                // сложить все элементы
                .reduce((acum, el) -> acum + el)
                // преобразовать все и int
                .getAsInt();
        System.out.println(result); // 51

        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Mariya", 'f', 23, 3, 7.4);

        List<Student> students = new ArrayList<>();
        students.add(st1); students.add(st2);students.add(st3);students.add(st4);students.add(st5);

        // List в Stream
        students.stream()
                // перебирая каждый элемент присвоить имя(получить имя().все с большой буквы())
                .map(el -> {el.setName(el.getName().toUpperCase()); return el;})
                // применяем фильтр, если пол = f , то проходит
                .filter(el -> el.getSex() == 'f')
                // сортируем по возрасту,
                .sorted((stud1, stud2)-> stud1.getAge()-stud2.getAge())
                // метод проходит по каждому эл и выводит его значение
                .forEach(el -> System.out.println(el));


    }
}

class Student{
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

