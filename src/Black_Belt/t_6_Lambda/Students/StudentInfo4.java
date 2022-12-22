package Black_Belt.t_6_Lambda.Students;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentInfo4 {
    void testStudents(ArrayList<Student> al, StudentChecks2 sc) {
        for (Student s : al) {
            if (sc.check(s)) {
                System.out.println(s);
            }
        }
    }
}

class Test4{
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

        StudentInfo4 info = new StudentInfo4();
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student stud1, Student stud2) {
                return stud1.course - stud2.course;
            }
        });

        /** Второй вариант */
        Collections.sort(students, (stu1, stu2)-> stu1.course- stu1.course);
        System.out.println(students);
    }
}

interface StudentChecks2 {
    boolean check(Student s);
}

class CheckOverGrade2 implements StudentChecks2 {

    @Override
    public boolean check(Student s) {
        return s.avgGrade > 8;
    }
}