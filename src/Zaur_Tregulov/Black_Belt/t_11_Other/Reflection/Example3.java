package Zaur_Tregulov.Black_Belt.t_11_Other.Reflection;

import java.lang.reflect.Field;

public class Example3 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Employee2 employee = new Employee2(10, "Andrey", "IT");
        Class employeeClass = employee.getClass();
        Field field = employeeClass.getDeclaredField("salary"); // получаем private поле "salary"

        /** Получаем значение private поля */
        field.setAccessible(true); // получаем доступ к полю даже если оно Private
        double salaryValue = (Double) field.get(employee); // получаем поле "salary" объекта "employee" (кастим)
        System.out.println(salaryValue);

        /** Изменяем значение private поля */
        field.set(employee, 1500);
        System.out.println(employee); // Employee{id=10, name='Andrey', department='IT', salary=1500.0}






    }
}
