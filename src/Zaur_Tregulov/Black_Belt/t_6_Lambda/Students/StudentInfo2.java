package Zaur_Tregulov.Black_Belt.t_6_Lambda.Students;

import java.util.ArrayList;

public class StudentInfo2 {
    void testStudents(ArrayList<Student> al, StudentChecks sc) {
        for (Student s : al) {
            if (sc.check(s)) {
                System.out.println(s);
            }
        }
    }
}

class Test {
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

        StudentInfo2 info = new StudentInfo2();
        info.testStudents(students, new CheckOverGrade());
        /**
         * Чтобы не создавать отдельный класс который имплиментирует нужный интерфейс,
         * можно сразу создать объект ананимного класса из интерфейча
         */
        System.out.println("------------------------------------------------");
        info.testStudents(students, new StudentChecks() { // при добавлении анонимного класса
            // автоматом предлагает переписать check(), т.к. StudentChecks являетя и интерфейсом
            // и анонимным классом созданным из интерфейса
            @Override
            public boolean check(Student s) {
                return s.age < 30;
            }
        }); // <--- не забывать про ";"
    }
}

interface StudentChecks {
    boolean check(Student s);
}

class CheckOverGrade implements StudentChecks {
    @Override
    public boolean check(Student s) {
        return s.avgGrade > 8;
    }
}