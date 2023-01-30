package Zaur_Tregulov.Black_Belt.t_4_Iterable.collection.List.vector;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> vector = new Vector();
        vector.add("Andrey");
        vector.add("Misha");
        vector.add("Kolya");
        vector.add("Petya");
        System.out.println(vector); // [Andrey, Misha, Kolya, Petya]
        System.out.println(vector.firstElement()); // Andrey
        System.out.println(vector.lastElement()); // Petya
        vector.remove(2);
        System.out.println(vector); // [Andrey, Misha, Petya]
        System.out.println(vector.get(1)); // Misha
    }
}
