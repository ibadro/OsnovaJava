package Black_Belt.t_4_Iterable.collection.List.arrayList;

import java.util.ArrayList;

public class ArrayListMethods2 {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Mariya", 'f', 23, 3, 7.4);
        ArrayList<Student> studentsList = new ArrayList<>();
        studentsList.add(st1);
        studentsList.add(st2);
        studentsList.add(st3);
        studentsList.add(st4);
        studentsList.add(st5);
        System.out.println(studentsList);
        Student st6 = new Student("Mariya", 'f', 23, 3, 7.4);
        studentsList.remove(st6); // т.к. в studentsList нету объекта st6, то ничего не удалится
        // без переписанного equals() будут сравниваться объекты, а не их содержимое, если же
        // переопределить quals(), то из списка удалится st5, т.к. он равен st6
    }
}

class Student{
    private String name;
    private char sex;
    private  int age;
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
        return "Student{" + "name='" + name + '\'' + ", sex=" + sex +
                ", age=" + age + ", course=" + course + ", avgGrade=" + avgGrade + '}';
    }
}