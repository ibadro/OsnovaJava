package Black_Belt.t_6_Lambda.Predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class RemoveIf {
    public static void main(String[] args) {
        ArrayList<String> als = new ArrayList<>();
        als.add("Privet");
        als.add("Poka");
        als.add("Ok");
        als.add("U4im Java");
        als.add("A imenno lambdas");

        // удалить из списка String длина которого меньше 5
        als.removeIf(string -> string.length() < 5);
        //Второй вариант через Predicate
        Predicate<String> prk = element -> element.length() < 5;
        als.removeIf(prk);
        System.out.println(als);
    }
}
