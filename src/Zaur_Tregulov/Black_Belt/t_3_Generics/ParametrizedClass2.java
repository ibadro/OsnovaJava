package Zaur_Tregulov.Black_Belt.t_3_Generics;

public class ParametrizedClass2 {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("Hello", 8);
        System.out.println("Значение pair1: value1 = " + pair1.getFirstValue() +
                " value2 = " + pair1.getSecondValue());
        // Значение pair1: value1 = Hello value2 = 8

        Pair<Integer, Double> pair2 = new Pair<>(8, 8.88);
        System.out.println("Значение pair2: value1 = " + pair2.getFirstValue() +
                " value2 = " + pair2.getSecondValue());
        // Значение pair2: value1 = 8 value2 = 8.88

        OtherPair<String> otherPair = new OtherPair<>("Hello", "World");
        System.out.println(otherPair.getFirstValue() + " " + otherPair.getSecondValue());
        // Hello World

        OtherPair<Integer> otherPair2 = new OtherPair<>(3, 2);
        System.out.println(otherPair2.getFirstValue() + otherPair2.getSecondValue());
        // 5
    }
}

// Если использовать два разных типа то:
class Pair<V1, V2> {
    private V1 value1;
    private V2 value2;

    public Pair(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getFirstValue() {
        return value1;
    }

    public V2 getSecondValue() {
        return value2;
    }
}

// Если использовать два однотипных: placeholder'a
class OtherPair<V> {
    private V value1;
    private V value2;

    public OtherPair(V value1, V value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V getFirstValue() {
        return value1;
    }

    public V getSecondValue() {
        return value2;
    }
}
