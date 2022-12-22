package Black_Belt.t_7_Streams.Terminal.forEach;

import java.util.Arrays;

public class Stream_forEach {
    public static void main(String[] args) {
        int[] array = {5, 9, 3, 8, 1};
        Arrays.stream(array).forEach(el -> {el *= 2;System.out.println(el);});
        // Короткая запись
        Arrays.stream(array).forEach(System.out::println);
        Arrays.stream(array).forEach(el -> Utils.myMethod(el));
        // краткое написание
        Arrays.stream(array).forEach(Utils::myMethod);
    }
}

class Utils{
    public static void myMethod(int i){
        i += 5;
        System.out.println("Element = " + i);
    }
}