package Zaur_Tregulov.Black_Belt.Tests.Test1;

public abstract class AnimalAbstaract implements AnimalVoise {
    protected String name;
    protected int age;

    public AnimalAbstaract(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract void showMyAge();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void animalVoise() {
        System.out.println("Звук голоса");
    }

    @Override
    public String toString() {
        return "AnimalAbstaract{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Cat extends AnimalAbstaract{

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void animalVoise() {
        System.out.println("Мяу-мфу");
    }

    void showMyAge(){
        System.out.println("мне " + age + " лет");
    };
}

class Dog extends AnimalAbstaract {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void animalVoise() {
        System.out.println("Гав-гав");
    }

    void showMyAge(){
        System.out.println("мне " + age + " лет");
    };


}

class Test{
    public static void main(String[] args) {
       Cat cat = new Cat("Барсик", 3);
        System.out.println(cat);
       AnimalAbstaract dog = new Dog("Лайка", 5);
        System.out.println(dog);
       Dog dog2 = (Dog)dog;
       dog.abc();
       dog.def();
       AnimalVoise dog3 = new Dog("Чарли", 8);
       dog3.animalVoise();



//        System.out.println(cat.getName());
//        System.out.println(cat.getAge());
//        System.out.println(cat);
    }
}

interface AnimalVoise extends A, B{
    void animalVoise();
}

interface A{
    default void abc(){
        System.out.println("Это метод abc интерфейса A");
    };
}
interface B{
    default void def(){
        System.out.println("Это метод def интерфейса B");
    };
}