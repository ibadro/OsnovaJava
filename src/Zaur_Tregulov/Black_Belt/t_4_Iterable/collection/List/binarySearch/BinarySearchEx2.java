package Zaur_Tregulov.Black_Belt.t_4_Iterable.collection.List.binarySearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchEx2 {
    public static void main(String[] args) {
        Employee emp1 = new Employee(100, "Andrey", 12345);
        Employee emp2 = new Employee(15, "Ivan", 6542);
        Employee emp3 = new Employee(123, "Petr", 8542);
        Employee emp4 = new Employee(15, "Mariya", 5678);
        Employee emp5 = new Employee(182, "Kolya", 125);
        Employee emp6 = new Employee(15, "Sasha", 9874);
        Employee emp7 = new Employee(250, "Elena", 1579);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        employeeList.add(emp5);
        employeeList.add(emp6);
        employeeList.add(emp7);
        System.out.println("До сортировки: \n" + employeeList);
        Collections.sort(employeeList);
        /**
         * Чтобы отсортировать объекты надо прописать Comparator или Comparable
         */
        System.out.println("После сортировки: \n" + employeeList);
        int index = Collections.binarySearch(employeeList, new Employee(182, "Kolya", 125));
        System.out.println(index);
    }

}

class Employee implements Comparable<Employee>{
    int id;
    String name;
    int salary;

    @Override
    public String toString() {
        return "Employee{" + "id=" + id +
                ", name='" + name + '\'' + ", salary=" + salary + '}';
    }

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee anotherEmp) {
        int result = this.id - anotherEmp.id;
            if (result == 0){
                result = this.name.compareTo(anotherEmp.name);
            }
            return result;
    }
}
