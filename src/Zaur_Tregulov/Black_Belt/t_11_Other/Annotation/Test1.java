package Zaur_Tregulov.Black_Belt.t_11_Other.Annotation;

/**
 * Аннотации – это специальные
 * комментарии/метки/метаданные, которые нужны
 * для передачи определённой информации.
 * @Target показывает область кода, к которой
 * Аннотация может быть применима. Самые
 * распространённые области кода:
 * • TYPE – class, interface, enum;
 * • FIELD – поле класса;
 * • METHOD – метод класса;
 * • PARAMETER – параметры метода или конструктора
 */

public class Test1 {
    public static void main(String[] args) {
        Parent pi = new Child("Andrey");
        pi.showInfo();
    }
}


class Parent{
    String name;

    public Parent(String name) {
        this.name = name;
    }

    @Deprecated // метод устарел
    void showInfo(){
        System.out.println("It's Parent class. Name = " + name);
    }
}

class Child extends Parent{
    public Child(String name) {
        super(name);
    }

    @Override
    void showInfo(){
        System.out.println("It's Child class. Name = " + name);
    }
}