package ОсновыJava.УправляющиеИнструкции;
/*С помощью инструкции break можно организовать немедленный выход из
цикла в обход любого кода, оставшегося в теле цикла, а также минуя проверку
условия цикла. Когда в теле цикла встречается инструкция b re ak , цикл завершается,
а выполнение программы возобновляется с инструкции, следующей
после этого цикла. Рассмотрим следующий краткий пример программы.*/
// Применение инструкции break для выхода из цикла
public class BreakDemo {
    public static void main(String args[]) {
        int num;
        num = 100;
// Выполнение цикла до тех пор, пока квадрат значения
// переменной i меньше значения переменной num
        for (int i = 0; i < num; i++) {
            if (i * i >= num) break; // прекращение выполнения цикла, // если i*i >= 100
            System.out.print(i + " ");
        }
        System.out.println("Цикл завершен.");
    }
}
/* В результате выполнения этой программы будет получен следующий результат:
0 1 2 3 4 5 6 7 8 9 Цикл завершен.
Как видите, цикл f o r организован для выполнения в пределах значений переменной
num от 0 до 100. Но, несмотря на это, инструкция b re a k прерывает
цикл раньше, когда квадрат значения переменной i становится больше значения
переменной num. */