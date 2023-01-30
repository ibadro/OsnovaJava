package Zaur_Tregulov.Black_Belt.t_10_REGularEXpressions;

public class PrintfEx1 {

    static void employeeInfo(Employee emp) {
        System.out.printf("%03d \t " + // 0 - если число из 1 символа,
                        // то остальные три заполнить нулями; 3 - 3 символа; 3 символа d - целые числа,
                        "%-12s \t" + // - - выравнивать по левой стороне, 12 - выделить 12 символов, s - string
                        "%-12s \t" +
                        "%,.1f \n", // , - разделитель разрадов в числах; .1 - округлять до 1 символа после запятой;
                // f - ltcznbxyjt xbckj
                emp.id, emp.name, emp.surname, emp.salary * (1 + emp.bonusPct));
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Ivan", "Ivanov", 12345, 0.15);
        Employee emp2 = new Employee(15, "Petr", "Petrov", 6542, 0.08);
        Employee emp3 = new Employee(123, "Sergey", "Sergeev", 8542, 0.12);
        employeeInfo(emp1);
        employeeInfo(emp2);
        employeeInfo(emp3);

        String newString = String.format("%03d \t %-12s \t%-12s \t%,.1f \n",
                emp1.id, emp1.name, emp1.surname, emp1.salary * (1 + emp1.bonusPct));

        System.out.println(newString);

    }
}

class Employee {
    int id;
    String name;
    String surname;
    int salary;
    double bonusPct;

    public Employee(int id, String name, String surname, int salary, double bonusPct) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.bonusPct = bonusPct;
    }
}