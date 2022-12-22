package Black_Belt.t_7_Streams.Intermediate.distinct;

import java.util.stream.Stream;

public class Stream_distinct {
    /** Возвращает Stream уникальных (не одинаковых) элементов */
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1,2,3,4,5,1,2,3);
        stream1.distinct().forEach(System.out::println); // 1 2 3 4 5
    }
}
