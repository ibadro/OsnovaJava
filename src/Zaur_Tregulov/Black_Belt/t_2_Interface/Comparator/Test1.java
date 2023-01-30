package Zaur_Tregulov.Black_Belt.t_2_Interface.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        Employee emp1 = new Employee(8, "Andrey", "Andreev", 2500);
        Employee emp2 = new Employee(1, "Sergey", "Sergeev", 1500);
        Employee emp3 = new Employee(23, "Dmitriy", "Pavlov", 2000);
        Employee emp4 = new Employee(3, "Pavel", "Dmitriev", 500);
        Employee emp5 = new Employee(14, "Pavel", "Pavlov", 1000);
        List<Employee> list = new ArrayList<>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        list.add(emp5);
        System.out.println("--------- До сортировки ---------");
        System.out.println(list);
        Collections.sort(list, new IDComparator());
        System.out.println("--------- После сортировки по id ---------");
        System.out.println(list);
        Collections.sort(list, new NameComparator());
        System.out.println("--------- После сортировки по name ---------");
        System.out.println(list);
        Collections.sort(list, new SalaryComparator());
        System.out.println("--------- После сортировки по salary ---------");
        System.out.println(list);

    }
}

class Employee
//        implements Comparable<Employee>
{
    int id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name='" + name + '\'' +
                ", surname='" + surname + '\'' + ", salary=" + salary + '}';
    }
//    @Override
//    public int compareTo(Employee drugRabotnik) {
//        return 0;
//    }
}

class IDComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee emp1, Employee emp2) {
        if (emp1.id == emp2.id){
            return 0;
        }else if (emp1.id < emp2.id){
            return -1;
        }else {
            return 1;
        }
    }
}

class NameComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.name.compareTo(emp2.name);
    }

}

class SalaryComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.salary-emp2.salary;
    }
}
