package Black_Belt.t_11_Other.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Example2 {
    public static void main(String[] args) throws ClassNotFoundException,
            IllegalAccessException, InstantiationException, NoSuchMethodException,
            InvocationTargetException {
        Class employeeClass = Class.forName("Black_Belt.t_11_Other.Reflection.Employee");

        Object o = employeeClass.newInstance(); // устаревший метод

        Constructor<Employee> constructor = employeeClass.getConstructor();
        Employee obj1 = constructor.newInstance();

        Constructor constructor2 = employeeClass.getConstructor(int.class,
                String.class, String.class); // получаем конструктор объекта
        Object obj2 = constructor2.newInstance(5, "Andrey", "IT"); // получаем объект с полученым конструктором
        System.out.println(obj2); // Employee{id=5, name='Andrey', department='IT', salary=0.0}

        Method method = employeeClass.getMethod("setSalary", double.class); // получаем метод с указаным параметром
        method.invoke(obj2, 800.88); // запускаем метод на выбранном объекте и указываем параметр метода
        System.out.println(obj2); // Employee{id=5, name='Andrey', department='IT', salary=800.88}

    }

}
