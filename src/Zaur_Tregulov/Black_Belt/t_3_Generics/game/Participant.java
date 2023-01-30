package Zaur_Tregulov.Black_Belt.t_3_Generics.game;

// Создали абстрактный класс, параметры которого будут у всех его суб-классов
public abstract class Participant {
    private String name;
    private int age;

    // Конструктор, который передастся всем его суб-классам и будет в них переопределен
    public Participant(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
