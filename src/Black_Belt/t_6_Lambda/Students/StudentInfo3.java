package Black_Belt.t_6_Lambda.Students;

import java.util.ArrayList;

public class StudentInfo3 {
    void testStudents(ArrayList<Student> al, StudentChecksS sc) {
        for (Student s : al) {
            if (sc.check(s)) {
                System.out.println(s);
            }
        }
    }
}

class Test2 {
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

        StudentInfo3 info = new StudentInfo3();
        // лямбда выражение прошлых вариантов
        info.testStudents(students, (Student stud) -> {
            return stud.age < 30;
        });
        /**
         * таким образом лямбда выражение заменило анонимный класс
         * внутри параметра метода testStudents() прописали метод без названия
         * (Student stud) - параметр метода
         * { return stud.age < 30; } - тело метода
         * лямбда выражением можно заменить только функц-ый метод
         */
        System.out.println("------------------------------------------");
        info.testStudents(students, (Student stud) -> { return stud.avgGrade > 8; });
        System.out.println("------------------------------------------");
        info.testStudents(students, (Student stud) -> {
            return stud.age > 20 && stud.avgGrade < 9.3 && stud.sex == 'f';
        });

        /** Есть вариант еще более краткого написания*/

        info.testStudents(students, (Student stud) -> stud.age < 30);
        info.testStudents(students, stud -> { return stud.age < 30; });
        info.testStudents(students, std -> std.age < 30);

        /** Если в правой части лямбда выражения вы пишите более одного statement-а,
         то вы должны использовать его полный вариант написания. */
        info.testStudents(students, stud -> { System.out.println("Hello") ;return stud.age < 30; });

        /** Лямбда выражение можно вынести за параметр */
        StudentChecksS sc1 = std -> std.age < 30;
        info.testStudents(students, sc1);

    }
}

interface StudentChecksS { // функциональный интерфейс - это тот,
    // который содержит в себе всего один абстрактный метод
    boolean check(Student s);
}


