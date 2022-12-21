package Black_Belt.t_10_REGularEXpressions;

import java.util.Arrays;

public class RegExEx3 {
    public static void main(String[] args){
        String str
                = "Ivanov Vasiliy, Russia, Lenin street, 51, Flat 48," +
                "email:vivanov@mail.ru, Postcode: AA99, Phone Number + +123456789;"
                + "Petrova Mariya, Ukraine, Kiyev, Lomonosov street, 33, Flat 18," +
                "email: masha@yandex.ru, Postcode: UKR54, Phone Number: +987654321;"
                + "Chuck Norris, USA, Hollywood< All stars street, 87, Flat 21," +
                "email: chuck@gmail.com, Postcode: USA23, Phone Number: +136478952.";

        String str2 = "chuck@gmail.com";
        /** public boolean matches (String regex) */
        boolean result = str2.matches("\\w+@\\w+\\.(com|ru)"); // str2 соответствует регулярному выражению?
        System.out.println(result); // true

        /** public String [] split (String regex) */
        String [] array = str.split(" "); // в параметре указываем разделитель
        System.out.println(Arrays.toString(array));
    }
}
