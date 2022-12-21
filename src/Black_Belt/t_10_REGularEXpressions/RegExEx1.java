package Black_Belt.t_10_REGularEXpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Регулярные выражения необходимы для создания
 * шаблонов, с помощью которых производят такие
 * операции, как поиск, сравнение, замена.
 * Регулярные выражения  - это совокупность
 * символов, некоторые из которых являются
 * специальными - метасимволами, т.е. обладают
 * каким-то функционалом.
 */
public class RegExEx1 {
    public static void main(String[] args){
        String s
                = "Ivanov Vasiliy, Russia, Lenin street, 51, Flat 48," +
                "email:vivanov@mail.ru, Postcode: AA99, Phone Number + +123456789;"
                + "Petrova Mariya, Ukraine, Kiyev, Lomonosov street, 33, Flat 18," +
                "email: masha@yandex.ru, Postcode: UKR54, Phone Number: +987654321;"
                + "Chuck Norris, USA, Hollywood< All stars street, 87, Flat 21," +
                "email: chuck@gmail.com, Postcode: USA23, Phone Number: +136478952.";

        System.out.println("-------------Найти все слова------------------");
        Pattern pattern = Pattern.compile("\\w+"); // найдет [A-Za-z0-9_]
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()){ // пока будут найдены совпадения
            System.out.println(matcher.group());
        }

        System.out.println("-------------Найти все двузначные числа------------------");
        Pattern pattern2 = Pattern.compile("\\b\\d{2}\\b"); // граница слова - 2 символа - граница слова "_XX_"
        Matcher matcher2 = pattern2.matcher(s);
        while (matcher2.find()){ // пока будут найдены совпадения
            System.out.println(matcher2.group());
        }

        System.out.println("-------------Найти номера телефона------------------");
        Pattern pattern3 = Pattern.compile("\\+\\d{9}");
        Matcher matcher3 = pattern3.matcher(s);
        while (matcher3.find()){ // пока будут найдены совпадения
            System.out.println(matcher3.group());
        }

        System.out.println("-------------Найти email------------------");
        Pattern pattern4 = Pattern.compile("\\w+\\@\\w+\\.(ru|com)"); // или ("\\w+\\@\\w+\\.\\w+\\b")
        Matcher matcher4 = pattern4.matcher(s);
        while (matcher4.find()){ // пока будут найдены совпадения
            System.out.println(matcher4.group());
        }
    }
}
