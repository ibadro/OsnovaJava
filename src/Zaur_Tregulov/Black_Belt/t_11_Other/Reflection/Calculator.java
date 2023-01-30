package Zaur_Tregulov.Black_Belt.t_11_Other.Reflection;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Calculator {
    void sum(int a , int b){
        int result = a + b;
        System.out.println("Сумма " + a + " и " + b + " = " + result);
    }

    void subtraction(int a , int b){
        int result = a - b;
        System.out.println("Разница " + a + " и " + b + " = " + result);
    }

    void multiplication(int a , int b){
        int result = a * b;
        System.out.println("Произведение " + a + " на " + b + " = " + result);
    }

    void division(int a , int b){
        int result = a / b;
        System.out.println("Частное " + a + " и " + b + " = " + result);
    }
}

class TestCalculator{
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(
                new FileReader("test100.txt"))) { // читаем файл
            String methodName = reader.readLine(); // считываем 1-ю строку в String
            String firstArg = reader.readLine(); // считываем 2-ю строку в String
            String secondArg = reader.readLine(); // считываем 3-ю строку в String

            Calculator calculator = new Calculator();
            Class cl = calculator.getClass();
            Method method = null;

            Method [] methods = cl.getDeclaredMethods(); // получаем массив методов
            for(Method myMethod : methods){
                if(myMethod.getName().equals(methodName)) { // если имя метода равно имени метода из прочтенного файла
                    method = myMethod; // тогда присваиваю это имя переменной method
                }
            }
            // метод invoke() на объекте калькулятор, все методы с 2-мя параметрами, так что пишем 2 метода,
            // парсим их из String в Integer
            method.invoke(calculator, Integer.parseInt(firstArg), Integer.parseInt(secondArg));



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

}
