package Zaur_Tregulov.Black_Belt.t_3_Generics;

public class ParametrizedClass {
    public static void main(String[] args) {
        // Создаем объект класса Info с параметром <String>
        Info<String> info1 = new Info<>("Привет");
        // Выводим при помощи перезаписанного метода toString
        System.out.println(info1); // {[Привет]}
        // Вызов метода getValue()
        String s = info1.getValue();
        System.out.println(s); // Привет

        Info<Integer> info2 = new Info<>(123454321);
        System.out.println(info2); // {[123454321]}
        // Вызов метода getValue()
        Integer i = info2.getValue();
        System.out.println(i); // 123454321
    }
}

// Создаем параметризированный класс
class Info<T> {
    /*T - type placeholder (заполнитель типа/хранитель типа)
      Временно исполняет роль типа данных который потом будет подставлен
      Буква Е - если используются элементы
      Буква К - если используются ключи
      Буква V - если работаете с value*/
    // переменная типа Т под именем value
    private T value; // не может быть static

    // Создаем конструктор класса
    public Info(T value) {
        this.value = value;
    }

    // Переписываем метод toString
    @Override
    public String toString() {
        return "{[" + value + "]}";
    }

    // Создали метод который возвращает переменную типа Т
    public T getValue() {
        return value;
    }
}

