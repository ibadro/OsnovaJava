package Black_Belt.t_7_Streams.Terminal.count;

import java.util.stream.Stream;

public class Stream_count {
    /** Возвращает количество элементов в стриме - long */
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1,2,3,4,5,1,2,3);
        Stream<Integer> stream2 = Stream.of(1,2,3,4,5,1,2,3);
        System.out.println(stream1.count()); // 8
        System.out.println(stream2.distinct().count()); // 5
        System.out.println(stream1.distinct().count()); // выдаст IllegalStateException
        /** Stream нельзя переиспользовать */
    }
}
