package Black_Belt.t_5_Nested_classes.Inner_class;

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

public class Car2 {
    String color;
    int doorCount;
    Engine engine;

    public Car2(String color, int doorCount) {
        this.color = color;
        this.doorCount = doorCount;
//        this.engine = this.new Engine(horsePower); // создали объект Inner класса
        /** ОБРАТИТЬ ВНИМАНИЕ НА СИНТАКСИС */
    }

    public void setEngine(Engine engine){
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "My Car2: {" +
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

class Test2 {
    public static void main(String[] args) {
        Car2 car2 = new Car2("Black", 4);
        System.out.println(car2); // My Car2: {color='Black', doorCount=4, engine=null}
        Car2.Engine engine = car2.new Engine(150); // нельзя обратиться без объекта класса Car2
        car2.setEngine(engine); // передали объект engine в объект car2
        System.out.println(engine); // My Engine: {horsePower=150}
        System.out.println(car2); // My Car2: {color='Black', doorCount=4, engine=My Engine: {horsePower=150}}

        Car2.Engine engine2 = new Car2("Yellow", 4).new Engine(200); // можно и так,
        // но он не распространен
    }
}
