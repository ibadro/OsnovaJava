package Zaur_Tregulov.Black_Belt.t_9_IO_and_NIO.IO.Serialization.Proger1;

import java.io.Serializable;

/** Чтобы объект превратить в бинарный файл, надо имплиментировать в нем Serializable */
public class Employee implements Serializable {
    /**В сериализируемом классе необходимо использовать serialVersionUID для обозначения версии класса.*/
    static final long serialVersionUID = 1; // Указываем версию для сериализации объекта

    String name;
    String department;
    int age;
    /**Поля класса, помеченные ключевым словом transient, не записываются в файл при сериализации.*/
    transient double salary;
    /** Чтобы объект превратить в бинарный файл, надо имплиментировать в нем Serializable */
    Car car;

    public Employee(String name, String department, int age, double salary, Car car) {
        this.name = name;
        this.department = department;
        this.age = age;
        this.salary = salary;
        this.car = car;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", car=" + car +
                '}';
    }
}
