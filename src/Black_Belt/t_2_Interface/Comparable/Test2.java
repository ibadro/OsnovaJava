package Black_Belt.t_2_Interface.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(8, "Andrey", "Kravcov", 2500);
        Employee emp2 = new Employee(10, "Ivan", "Ivanov", 1500);
        Employee emp3 = new Employee(1, "Sergey", "Sergeev", 1000);
        Employee emp4 = new Employee(13, "Petr", "Petrovich", 500);
        Employee emp5 = new Employee(54, "Alla", "Allova", 2500);
        Employee emp6 = new Employee(2, "Benny", "Benson", 3000);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        list.add(emp5);
        list.add(emp6);
        System.out.println("Перед сортировкой \n" + list);
        Collections.sort(list); // не сработает сделать не получится т.к. Java не знает по какому
        // параметру сортировать список, пока не расписать метод compareTo
        System.out.println("После сортировки \n" + list);
    }
}

class Employee implements Comparable<Employee> { // имплементируем Comparable <Дженерик (обобщение)>
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
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

//    @Override
//    public int compareTo(Employee drugRabotnik) {
//        if(this.id == drugRabotnik.id){
//            return 0;
//        }
//        else if(this.id < drugRabotnik.id){
//            return -1;
//        }
//        else {
//            return 1;
//        }
//    }

//    @Override
//    public int compareTo(Employee drugRabotnik) {
//        return this.id - drugRabotnik.id;
//        // если результат вычитания отрицательный то вернет отрицательное
//        // если результат 0, то вернет 0
//        // если результат положительный, то вернет положительный
//    }

        @Override
    public int compareTo(Employee drugRabotnik) {
            int result = this.name.compareTo(drugRabotnik.name);
            if (result == 0){ // если результат равен 0
                result = this.surname.compareTo(drugRabotnik.surname); // то результат равен
                // сравнению surname (-1 or 0 or +1)
            }
            return result; // возвращаем result (-1 or 0 or +1)
//        return this.id.compareTo(drugRabotni k.id);
        // потому что Integer и String имплементируют Comparable
        // public final class Integer extends Number
        //        implements Comparable<Integer>, Constable, ConstantDesc{}

    }
}
/**
 * Сравниваем текущий объект, который мы создадим с объектом в параметре
 * метода compareTo т.е.Employee . Если текущий объект больше объекта в скобках
 * то вернуть положительное число, если меньше - отрицательное, если равны, то 0
 */
