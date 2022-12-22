package Black_Belt.t_7_Streams.chaining;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_chaining2 {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1,2,3,4,5,1,2,3);
        stream1.filter(el->{ // метод filter() не сработает пока не будет вызвал терминальный метод
            System.out.println("!!!");
            return el%2==0;
        }).collect(Collectors.toList()); // терминальный метод
    }
}
