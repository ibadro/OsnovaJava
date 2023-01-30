package Задачи.zadania;

import java.util.Arrays;
import java.util.Random;

public class vrem {
    final static int ITERATION = 100;

    public static void main(String[] args) {
        String str = generateString();
        System.out.println("str.length() = " + str.length());
        long time = System.nanoTime();
        for (int i = 0; i < ITERATION; i++) {
            bigSort(str);
        }
        long nanoStreamTime = (System.nanoTime() - time) / ITERATION;
        System.out.println("nanoStreamTime = " + nanoStreamTime);

        time = System.nanoTime();
        for (int i = 0; i < ITERATION; i++) {
            withStream(str);
        }
        long streanTime = (System.nanoTime() - time) / ITERATION;
        System.out.println("STREAM" + streanTime);

        System.out.println("SREAM /NO STREAM" + streanTime / nanoStreamTime);
    }

    private static String withStream(String str) {
        StringBuilder sb = new StringBuilder();
        str.chars().distinct().sorted().forEachOrdered(c -> sb.append((char) c));
        return sb.toString();
    }

    private static String bigSort(String str) {
        StringBuilder sb = new StringBuilder();
        if (!str.isEmpty()) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            sb.append(chars[0]);
            for (int i = 1; i < chars.length; i++) {
                if (chars[i] != chars[i - 1]) {
                    sb.append(chars[i]);
                }
            }
        }
        return sb.toString();
    }

    private static String generateString() {
        String[] arr = {"a", "b", "c", "d", "e", "i", "j", "z", "k", "l", "m", "n", "o"};
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 100_000_000; i++) {
            builder.append(arr[new Random().nextInt(1, arr.length - 1)]);
        }
        return builder.toString();
    }

}
