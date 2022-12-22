package Black_Belt.t_11_Other.Reflection;

public class Employee2 {
    public int id;
    public String name;
    public String department;
    private double salary = 1000;

    public Employee2() {
    }

    public Employee2(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

//    public Employee2(int id, String name, String department, double salary) {
//        this.id = id;
//        this.name = name;
//        this.department = department;
//        this.salary = salary;
//    }

//    public double getSalary() {
//        return salary;
//    }
//
//    public void setSalary(double salary) {
//        this.salary = salary;
//    }

    private void changeDepartment(String newDepartment){
        department = newDepartment;
        System.out.println("New department is: " + department);
    }

    public void increaseSalary(){
        salary *=2;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
