package Black_Belt.t_6_Lambda.Students;

import java.util.ArrayList;

public class StudentInfo {
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
        info.printStudentsOverGrade(students, 8);
        System.out.println("---------------------------------------------");
        info.printStudentsUnderAge(students, 30);
        System.out.println("---------------------------------------------");
        info.printStudentsMixConditions(students,20,9.5, 'f');
    }

    void printStudentsOverGrade(ArrayList<Student> al, double grade){
        for (Student s : al){
            if (s.avgGrade > grade){ // если avgGrade студента больше grade из параметра
                System.out.println(s); // то выводим студента
            }
        }
    }

    void printStudentsUnderAge(ArrayList<Student> al, int age){
        for (Student s : al){
            if (s.age < age){ // если age студента меньше age из параметра
                System.out.println(s); // то выводим студента
            }
        }
    }

    void printStudentsMixConditions(ArrayList<Student> al, int age, double grade, char sex){
        for (Student s : al){
            if (s.age > age && s.avgGrade < grade && s.sex == sex){ // если age студента больше
                // age из параметра и avgGrade студента меньше grade из параметра и sex студента
                // равен sex из параметра
                System.out.println(s); // то выводим студента
            }
        }
    }
}
