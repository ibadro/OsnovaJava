package Black_Belt.t_5_Nested_classes.Anonymous_Inner_Class;

/**
 * • Anonymous класс – это «объявление» класса и
 * одновременное создание объекта
 * • Анонимный класс может обращаться даже к private
 * элементам внешнего класса
 * • Lambda expressions – это краткая форма для
 * написания анонимных классов
 * • Anonymous класс не имеет имени
 * • В анонимных классах невозможно написать
 * конструктор
 */

public class AnonymousClass {
    public static void main(String[] args) {
        Math math = new Math() {
            int c = 10;
            void abc(){}

            @Override
            public int doOperation(int a, int b) {
                return a + b;
            }
        }; // <-- обязательно ";"
        System.out.println(math.doOperation(3, 6)); // 9

        Math math2 = new Math() {
            @Override
            public int doOperation(int a, int b) {
                return a * b;
            }
        }; // <-- обязательно ";"
        System.out.println(math2.doOperation(3, 6)); // 18
    }
}

interface Math {
    int doOperation(int a, int b);
}
