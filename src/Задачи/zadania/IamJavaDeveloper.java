package Задачи.zadania;

import java.util.stream.Stream;

public class IamJavaDeveloper {

    private static final String TEXT = "I am Java Developer";

    /*
     *   *************
     *   * I         *
     *   * am        *
     *   * Java      *
     *   * Developer *
     *   *************
     */

    public static void main(String[] args) {
        final IamJavaDeveloper task1 = new IamJavaDeveloper();
        task1.printFormattedText(TEXT);

    }

    /**
     * Реализовать функцию вывода на консоль текста в параметре TEXT в формате указанном выше
     * постараться сделать универсальное решение, текст может отличаться
     */
    public void printFormattedText(String text) {
        var massiv = text.split(" ");
        int maxLength = Stream.of(massiv).map(x-> x.length()).max(Integer::compare).get();
        String firstAndLastLine = "*".repeat(maxLength+4);
        StringBuilder result = new StringBuilder();
        result.append(firstAndLastLine).append("\n");
        for (String line:massiv) {
            String formatline = "* %s"+" ".repeat(maxLength-line.length())+" *\n";
            result.append(String.format(formatline,line));
        }
        result.append(firstAndLastLine).append("\n");
        System.out.println(result);
    }
}
