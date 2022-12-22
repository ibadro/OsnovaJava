package Black_Belt.t_7_Streams.Parallel_stream;

import java.util.ArrayList;
import java.util.List;

public class ParallelStream {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        list.add(10.0);
        list.add(5.0);
        list.add(1.0);
        list.add(0.25);

        double sumResult = list.stream().reduce((accumulator, element) -> accumulator + element).get();
        System.out.println("sumResult = " + sumResult); // 16.25

        double sumResultP = list.parallelStream().reduce((accumulator, element) -> accumulator + element).get();
        System.out.println("sumResultP = " + sumResultP); // 16.25

        double divisionResult = list.stream().reduce((accumulator, element) -> accumulator / element).get();
        System.out.println("divisionResult = " + divisionResult); // 8

        double divisionResultP = list.parallelStream().reduce((accumulator, element) -> accumulator / element).get();
        System.out.println("divisionResultP = " + divisionResultP); // 0.5 т.к.
        // распаралел. потоки (10/5) / (1/0.25) = 0.5 - лучше не использовать
    }
}
