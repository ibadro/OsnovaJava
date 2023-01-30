package Zaur_Tregulov.Black_Belt.t_3_Generics;

public class TypeErasure {
    public static void main(String[] args) {

    }

    public void abc(Infoo<String> info) {
        String s = info.getValue();
    }

//    public void abc(Infoo<Integer> info){
//        Integer i = info.getValue();
//    }

    /*Нельзы создавать перегружаемые методы, т.к. GVM видит емтод
      как  abc(Infoo info)*/
}

class Infoo<T> {
    /*T - type placeholder (заполнитель типа/хранитель типа)
      Временно исполняет роль типа данных который потом будет подставлен
      Буква Е - если используются элементы
      Буква К - если используются ключи
      Буква V - если работаете с value*/
    // переменная типа Т под именем value
    private T value; // не может быть static

    // Создаем конструктор класса
    public Infoo(T value) {
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

class Parent {
    public void abc(Infoo<String> info) {
        String s = info.getValue();
    }
}

class Child extends Parent {
//    public void abc(Infoo<Integer> info) {
//        Integer i = info.getValue();
//    }
}

/*Так же нельзя переписывать метод с разными параметрами в child классе*/