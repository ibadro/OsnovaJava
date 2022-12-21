package Black_Belt.t_10_REGularEXpressions;

public class RegExEx4 {
    public static void main(String[] args) {
        String s1 = "Privet,    moj drug!    Kak idet izuchenie       Java      ?";
        System.out.println(s1);
        s1 = s1.replace("Java", "SQL"); // меняем "Java" на "SQL"
        System.out.println(s1);

        s1 = s1.replaceAll(" {2,}", " " ); // меняем несколько пробелов на один
        System.out.println(s1);

        s1 = s1.replaceAll("\\bi\\w+", "4444"); // слова начинающиеся на i заменить на 4444
        System.out.println(s1);

        s1 = s1.replaceFirst("4{4}", "idet"); // заменить только первое совпадение
        System.out.println(s1);
    }
}
