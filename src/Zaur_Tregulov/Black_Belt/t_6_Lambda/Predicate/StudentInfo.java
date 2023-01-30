package Zaur_Tregulov.Black_Belt.t_6_Lambda.Predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class StudentInfo {
    // Через Predicate а не через интерфейс
    void testStudents(ArrayList<Student> al, Predicate<Student> pr) {
        for (Student s : al) {
            if (pr.test(s)) {
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

        StudentInfo info = new StudentInfo();
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
        System.out.println("------------------------------------------");
        info.testStudents(students, (Student stud) -> stud.age < 30);
        System.out.println("------------------------------------------");
        info.testStudents(students, stud -> { return stud.age < 30; });
        System.out.println("------------------------------------------");
        info.testStudents(students, std -> std.age < 30);
        System.out.println("------------------------------------------");

        /** Если в правой части лямбда выражения вы пишите более одного statement-а,
         то вы должны использовать его полный вариант написания. */
        info.testStudents(students, stud -> { System.out.println("Hello, age < 30 ") ;return stud.age < 30; });
        System.out.println("------------------------------------------");

        /** Распишу через Predicate */
        Predicate<Student> pdk1 = stud_t -> stud_t.avgGrade > 7.5;
        Predicate<Student> pdk2 = stud_t -> stud_t.sex== 'm';
        info.testStudents(students, pdk1);
        info.testStudents(students, pdk2);
        // С двумя и более условиями .and() аналог &&
        info.testStudents(students, pdk1.and(pdk2)); // pdk1.and(pdk2).and(pdk3)....and(pdk n)
        // С двумя и более условиями .and() аналог ||
        info.testStudents(students, pdk1.or(pdk2)); // pdk1.or(pdk2).or(pdk3)... .or(pdk n)
        // .negate() Реверсирует условие, < в > или > в <
        info.testStudents(students, pdk1.negate());


    }
}


