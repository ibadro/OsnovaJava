package Zaur_Tregulov.Black_Belt.t_11_Other.Scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int i = scanner.nextInt();
        System.out.println("Вы ввели: " + i);

        System.out.print("Введите дробное число: ");
        double d = scanner.nextDouble(); // 2,6
        System.out.println("Вы ввели: " + d); // Вы ввели: 2.6

        System.out.print("Введите первое число: ");
        int x = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int y = scanner.nextInt();
        System.out.println("Частное = " + x / y);
        System.out.println("Остаток = " + x % y);

        System.out.print("Еапишите пару слов: ");
        String message = scanner.nextLine();
        System.out.println("Вы ввели: " + message);

        System.out.print("Еапишите пару слов: ");
        String message2 = scanner.next(); // Hello world! считывает первое слово
        System.out.println("Вы ввели: " + message2); // Hello

        Scanner scanner1 = new Scanner("Privet moj drug. \nKak tvoi dela? \nChto horoshego?");
        String s = scanner1.next();
        System.out.println(s); // Privet
        String s2 = scanner1.nextLine();
        System.out.println(s2); // Privet moj drug.
        System.out.println(scanner1.nextLine()); // Kak tvoi dela?
        System.out.println(scanner1.nextLine()); // Chto horoshego?

        /** Пишут так: */
        while (scanner1.hasNextLine()){ // пока есть непрочтенные строки
            System.out.println(scanner1.nextLine());
        }

        System.out.println(scanner1.next().charAt(2)); // i

        scanner.close();
        scanner1.close();
    }
}
