package Zaur_Tregulov.Black_Belt.t_5_Nested_classes.Inner_class;

/**
 * • Каждый объект inner класса всегда ассоциируется с
 * объектом внешнего класса
 * • Создавая объект inner класса, нужно перед этим
 * создать объект его внешнего класса
 * • Inner класс может содержать только non-static
 * элементы
 * • Inner класс может обращаться даже к private
 * элементам внешнего класса
 * • Внешний класс может обращаться даже к private
 * элементам inner класса, прежде создав его объект
 */

public class Car {
    String color;
    int doorCount;
    Engine engine;

    public Car(String color, int doorCount, int horsePower) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = this.new Engine(horsePower); // создали объект Inner класса
        /** ОБРАТИТЬ ВНИМАНИЕ НА СИНТАКСИС */
    }

    @Override
    public String toString() {
        return "My Car: {" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    public class Engine { // можно сделать extends A
        private int horsePower;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
        }

        @Override
        public String toString() {
            return "My Engine: {" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}

class Test {
    public static void main(String[] args) {
        Car car = new Car("Black", 4, 300);
        System.out.println(car); // My Car: {color='Black', doorCount=4, engine=My Engine: {horsePower=300}}
    }
}
