package Black_Belt.t_6_Lambda.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionEx {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolaj", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Mariya", 'f', 23, 3, 9.1);
        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        Function<Student, Double> f_s_d = student -> student.avgGrade;
        double res = avgOfSmth(students, student -> student.avgGrade);
        System.out.println(res);
        // находит средний курс студентов(скастили int в double)
        System.out.println(avgOfSmth(students, student -> (double) student.course));
        // находит средний возраст студентов(скастили int в double)
        System.out.println(avgOfSmth(students, student -> (double) student.age));
    }

    private static double avgOfSmth(List<Student> list, Function<Student, Double> f) {
        double result = 0;
        for (Student stud : list) {
            // result = result + double полученный из (Function<Student, Double> f)
            // при помощи метода apply(элемент списка)
            result += f.apply(stud);
        }
        return result / list.size();
    }

}

class Student {
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }
}