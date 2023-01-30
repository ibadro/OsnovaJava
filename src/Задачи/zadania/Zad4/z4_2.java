package Задачи.zadania.Zad4;

import java.util.Arrays;
import java.util.Random;

/**
 * Создать новый массив размера 100 и заполнить его случайными числами из
 * диапазона от 0 до 10000.
 * Затем, используя циклы  for each вывести:
 * - наибольший элемент массива
 * - наименьший элемент массива
 * - количество элементов массива, оканчивающихся на 0
 * - сумму элементов массива, оканчивающихся на 0
 */
public class z4_2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }
         System.out.println(Arrays.toString(array));
        //System.out.println(array.length);

        int max = 0; // наибольший элемент массива
        for (int element : array) {
            if (element > max)
                max = element;
        }
        System.out.println("max:  " + max);

        int min = 10000; // наименьший элемент
        for (int element : array) {
            if (element < min)
                min = element;
        }
        System.out.println("min:   " + min);

        int counter = 0; //количество элементов массива, оканчивающихся на 0
        for (int element : array) {
            if (element % 10 == 0)
                counter++;
        }
        System.out.println(counter);

        int sum = 0; // сумму элементов массива, оканчивающихся на 0
        for (int element : array) {
            if (element % 10 == 0)
                sum += element;
        }
        System.out.println(sum);
    }
}
