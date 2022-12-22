package Black_Belt.t_5_Nested_classes.Static_Nested_Class;

/**
 * • static nested класс очень похож на обычный внешний,
 * но находится внутри другого класса
 * • Создавая объект static nested класса, нужно
 * указывать и класс, содержащий его
 * • static nested класс может содержать static и non-static
 * элементы
 * • static nested класс может обращаться даже к private
 * элементам внешнего класса, но только к static
 * • Внешний класс может обращаться даже к private
 * элементам static nested класса
 */

public class Car {
    String color;
    int doorCount;
    Engine engine;
    private static int a;

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }

    void method() {
        //Внешний класс может обращаться даже к private
        //элементам static nested класса
        System.out.println(Engine.counterOfObjekts);
        Engine engine = new Engine(200);
        System.out.println(engine.horsePower);
    }

    @Override
    public String toString() {
        return "My Car: {" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    public static class Engine { // можно сделать extends A
        private int horsePower;
        static int counterOfObjekts; // можно добавить static переменную

        public Engine(int horsePower) {
            System.out.println(Car.a); // static nested класс может обращаться
            // даже к private элементам внешнего класса, но только к static
            this.horsePower = horsePower;
            counterOfObjekts++; // и в конструкторе ее изменять
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
        Car.Engine engine = new Car.Engine(256);
        System.out.println(engine); // My Engine: {horsePower=256}

        Car car = new Car("red", 2, engine);
        System.out.println(car); // My Car: {color='red', doorCount=2, engine=My Engine: {horsePower=256}}

        System.out.println(Car.Engine.counterOfObjekts); // 1

    }
}

class A {
}

class B extends Car.Engine {

    public B(int horsePower) {
        super(horsePower);
    }
}
