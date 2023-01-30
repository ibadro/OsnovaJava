package Задачи.zad_Alishev.Zad3;

import java.util.Scanner;

/**1. Реализовать программу, которая в консоль выводит название страны, принимая на
вход название города. Программа должна работать до тех пор, пока не будет введено
слово “​Stop​”.
Реализовать, используя следующие данные:
Москва, Владивосток, Ростов - Россия
Рим, Милан, Турин - Италия
Ливерпуль, Манчестер, Лондон - Англия
Берлин, Мюнхен, Кёльн - Германия

При вводе любого другого города, вывести сообщение “Неизвестная страна”.
*/
public class z3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String city = scanner.nextLine();
            if (city.equals("Stop"))
                break;
            switch (city) {
                case "Москва":
                case "Владивосток":
                case "Ростов":
                    System.out.println("RF");
                    break;
                case "Рим":
                case "Милан":
                case "Турин":
                    System.out.println("Italy");
                    break;
                default:
                    System.out.println("Неизвестная страна");

            }
        }
    }
}