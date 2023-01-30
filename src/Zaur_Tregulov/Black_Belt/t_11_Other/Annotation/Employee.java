package Zaur_Tregulov.Black_Belt.t_11_Other.Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@MyAnnotationClassInerfEnum
public class Employee {
    @MyAnnotationField
    String name;
    double salary;

    public Employee(String name, @MyAnnotationParameter double salary) {
        this.name = name;
        this.salary = salary;
    }

    @MyAnnotationMethod
    public void increaseSalary(){
        salary *=2;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

@Target(ElementType.METHOD) // задаем область применения - методы
@interface MyAnnotationMethod {} // создаем собственную аннотацию

@Target(ElementType.TYPE) // задаем область применения - class, interface, enum;
@interface MyAnnotationClassInerfEnum {} // создаем собственную аннотацию

@Target(ElementType.FIELD) // задаем область применения - поле класса
@interface MyAnnotationField{} // создаем собственную аннотацию

@Target(ElementType.PARAMETER) // задаем область применения - параметры метода или конструктора
@interface MyAnnotationParameter{} // создаем собственную аннотацию

@Target({ElementType.LOCAL_VARIABLE, ElementType.TYPE})
@interface MyAnnotationLocalVar{} // создаем собственную аннотацию