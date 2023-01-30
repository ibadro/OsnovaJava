package Zaur_Tregulov.Black_Belt.t_2_Interface.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        Employee2 emp1 = new Employee2(8, "Andrey", "Andreev", 2500);
        Employee2 emp2 = new Employee2(1, "Sergey", "Sergeev", 1500);
        Employee2 emp3 = new Employee2(23, "Dmitriy", "Pavlov", 2000);
        Employee2 emp4 = new Employee2(3, "Pavel", "Dmitriev", 500);
        Employee2 emp5 = new Employee2(14, "Pavel", "Pavlov", 1000);
        List<Employee2> list = new ArrayList<>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        list.add(emp5);
        System.out.println("--------- До сортировки ---------");
        System.out.println(list);
        Collections.sort(list, new ID2Comparator());
        System.out.println("--------- После сортировки по id ---------");
        System.out.println(list);
        Collections.sort(list, new Name2Comparator());
        System.out.println("--------- После сортировки по name ---------");
        System.out.println(list);
        Collections.sort(list, new Salary2Comparator());
        System.out.println("--------- После сортировки по salary ---------");
        System.out.println(list);
        /**
         * Compare + Comparator
         * Collections.sort(list); - сортировка по методу compareTo
         * Collections.sort(list, new Name2Comparator()); - сортировка по классу Name2Comparator
         */

    }
}

class Employee2 implements Comparable<Employee2>
{
    int id;
    String name;
    String surname;
    int salary;

    public Employee2(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee2{" + "id=" + id + ", name='" + name + '\'' +
                ", surname='" + surname + '\'' + ", salary=" + salary + '}';
    }

    @Override
    public int compareTo(Employee2 o) {
        if (o.id == o.id){
            return 0;
        }else if (o.id > o.id){
            return -1;
        }else {
            return 1;
        }
    }
}

class ID2Comparator implements Comparator<Employee2>{
    @Override
    public int compare(Employee2 emp1, Employee2 emp2) {
        if (emp1.id == emp2.id){
            return 0;
        }else if (emp1.id > emp2.id){
            return -1;
        }else {
            return 1;
        }
    }
}

class Name2Comparator implements Comparator<Employee2>{
    @Override
    public int compare(Employee2 emp1, Employee2 emp2) {
        return emp1.name.compareTo(emp2.name);
    }

}

class Salary2Comparator implements Comparator<Employee2>{
    @Override
    public int compare(Employee2 emp1, Employee2 emp2) {
        return emp1.salary-emp2.salary;
    }
}
