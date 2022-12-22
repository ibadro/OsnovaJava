package Black_Belt.t_7_Streams.Intermediate.peek;

import java.util.stream.Stream;

public class Stream_peek {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1,2,3,4,5,1,2,3);

        System.out.println(stream1
                // передает только уникальные элементы
                .distinct()
                /** просматривает каждый элемент */
                .peek(System.out::println)
                // возвращает количество элементов в стриме
                .count());
    }
}
