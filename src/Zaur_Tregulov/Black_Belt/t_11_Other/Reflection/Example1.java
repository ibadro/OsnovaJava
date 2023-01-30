package Zaur_Tregulov.Black_Belt.t_11_Other.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class  Example1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class employeeClass = Class.forName("Zaur_Tregulov.Black_Belt.t_11_Other.Reflection.Employee"); // 1 вариант

//        Class employeeClass2 = Employee.class; // 2 вариант
//
//        Employee emp = new Employee();
//        Class employeeClass3 = emp.getClass(); // 3 вариант

        /** Получить информацию о поле о котором знаешь */
        Field someField = employeeClass.getField("id"); // getField() дай поле, если поля нет выбросится NoSuchFieldException
        System.out.println("Type of id field = " + someField.getType()); // int getType() дай тип
        System.out.println("-------------------------------------------");

        /** Получить информацию о всех public полях */
        Field [] fields = employeeClass.getFields();
        for(Field field : fields){
            System.out.println("Type of " + field.getName() + ": " + field.getType());
        }
        System.out.println("-------------------------------------------");

        /** Получить информацию о ВСЕХ полях */
        Field [] allFields = employeeClass.getDeclaredFields(); // вернет все поля даже private
        for(Field field : allFields){
            System.out.println("Type of " + field.getName() + ": " + field.getType());
        }
        System.out.println("-------------------------------------------");

        /** Получить информацию о методе о котором знаешь */
        Method someMethod =  employeeClass.getMethod("increaseSalary"); // getMethod() дай метод, если поля нет выбросится NoSuchMethodException
        System.out.println("Return type of method increaseSalary = " +
                someMethod.getReturnType() + ", parameters types = " + Arrays.toString(someMethod.getParameterTypes()));
        System.out.println("-------------------------------------------");

        Method someMethod2 =  employeeClass.getMethod("setSalary", double.class); // getMethod() дай метод, если поля нет выбросится NoSuchMethodException
        System.out.println("Return type of method setSalary = " +
                someMethod2.getReturnType() + ", parameters types = " +
                Arrays.toString(someMethod2.getParameterTypes())); // массив параметров метода
        System.out.println("-------------------------------------------");

        /** Получить информацию о всех не скрытых методах + о наследованных */
        Method [] methods = employeeClass.getMethods();
        for (Method method : methods){
            System.out.println("Name of method = " + method.getName() + // getName() возвращает имя метода
                    ", return type = " + method.getReturnType() + // getReturnType() возвращает тип метода
                    ", parameters types = " +
                    Arrays.toString(method.getParameterTypes())); // массив параметров метода
        }
        System.out.println("-------------------------------------------");

        /** Получить информацию о всех методах класса */
        Method [] allMethods = employeeClass.getDeclaredMethods();
        for (Method method : allMethods){
            System.out.println("Name of method = " + method.getName() + // getName() возвращает имя метода
                    ", return type = " + method.getReturnType() + // getReturnType() возвращает тип метода
                    ", parameters types = " +
                    Arrays.toString(method.getParameterTypes())); // массив параметров метода
        }
        System.out.println("-------------------------------------------");

        /** Получить информацию о всех PUBLIC методах класса */
        Method [] allPublicMethods = employeeClass.getDeclaredMethods();
        for (Method method : allPublicMethods){
            if(Modifier.isPublic(method.getModifiers())) // если метод public то
            System.out.println("Name of method = " + method.getName() + // getName() возвращает имя метода
                    ", return type = " + method.getReturnType() + // getReturnType() возвращает тип метода
                    ", parameters types = " +
                    Arrays.toString(method.getParameterTypes())); // массив параметров метода
        }
        System.out.println("-------------------------------------------");

        /** Получить информацию о конструкторе */
        Constructor constructor = employeeClass.getConstructor();
        System.out.println("Constructor has " + constructor.getParameterCount()+
                " parameters, their types are: " +
                Arrays.toString(constructor.getParameterTypes()));
        System.out.println("-------------------------------------------");

        /** Получить информацию о конструкторе c параметрами */
        Constructor constructor2 = employeeClass.getConstructor(int.class,
                String.class, String.class);
        System.out.println("Constructor has " + constructor2.getParameterCount()+
                " parameters, their types are: " +
                Arrays.toString(constructor2.getParameterTypes()));
        System.out.println("-------------------------------------------");

        /** Получить информацию о всех конструкторах c параметрами */
        Constructor [] constructors = employeeClass.getConstructors();
        for(Constructor constr : constructors){
            System.out.println("Constructor " + constr.getName() +
                    " has " + constr.getParameterCount()+
                    " parameters, their types are: " +
                    Arrays.toString(constr.getParameterTypes()));
        }







    }
}
