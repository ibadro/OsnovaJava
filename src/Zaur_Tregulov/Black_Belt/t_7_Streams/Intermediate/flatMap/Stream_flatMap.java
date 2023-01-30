package Zaur_Tregulov.Black_Belt.t_7_Streams.Intermediate.flatMap;

import java.util.ArrayList;
import java.util.List;

/** Метод позволяет работать с элементами элементов */

public class Stream_flatMap {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Mariya", 'f', 23, 3, 7.4);

        Faculty econom = new Faculty("Economics");
        Faculty math = new Faculty("Applied mathematics");

        econom.addStudentToFaculty(st1);
        econom.addStudentToFaculty(st2);
        econom.addStudentToFaculty(st3);
        math.addStudentToFaculty(st4);
        math.addStudentToFaculty(st5);
        List <Faculty> facultyList = new ArrayList<>();
        facultyList.add(econom);
        facultyList.add(math);

        // Преобразует List в Stream
        facultyList.stream()
                /** вызываю метод flatMap(). обращаюсь к элементу элемента и преобразую его в */
                .flatMap(fac -> fac.getStudentsOnFaculty()
                        // и преобразую его в Stream
                        .stream())
                // перебирает каждый элемент
                .forEach(el -> System.out.println(el.getName()));

        /**
         * При помощи метода flatMap() и вызова stream() на каждом элементе, создаем
         * стрим для каждой коллекции внутри коллекции <Faculty> (это econom и math) и работаем с их элементами
         */

    }
}

class Faculty{
    String name;
    List<Student> studentsOnFaculty;

    public Faculty(String name) {
        this.name = name;
        studentsOnFaculty = new ArrayList<>();
    }

    public List<Student> getStudentsOnFaculty() {
        return studentsOnFaculty;
    }

    public void addStudentToFaculty(Student s){
        studentsOnFaculty.add(s);

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