package Zaur_Tregulov.Black_Belt.t_10_REGularEXpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExEx5 {
    public static void main(String[] args) {
        String myString = "12345678912345670325987;" +
                "98765432165498750921654;" +
                "85274196345612381122333";

        // 03/25 1234 5678 9123 4567 (987)

        Pattern pattern =
                Pattern.compile("(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{2})(\\d{2})(\\d{3})");
        Matcher matcher = pattern.matcher(myString);

//        String myNewString = matcher.replaceAll
//                ("$5/$6 $1 $2 $3 $4 ($7)"); // $5 - 5 я группа
//        System.out.println(myNewString);

        while (matcher.find()){
            System.out.println(matcher.group(7)); // вывести только 7-ю группу
        }
    }
}
