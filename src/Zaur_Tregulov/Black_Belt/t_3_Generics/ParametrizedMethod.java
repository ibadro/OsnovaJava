package Zaur_Tregulov.Black_Belt.t_3_Generics;

import java.util.ArrayList;

public class ParametrizedMethod {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(3);
        al1.add(6);
        al1.add(9);
        int a = GenMethod.getSecondElement(al1);
        System.out.println(a); // 6
        // Можно и так:
        GenMethod gM = new GenMethod();
        int b = gM.getSecondElement(al1);
        System.out.println(b); // 6

        ArrayList<String> al2 = new ArrayList<>();
        al2.add("Abc");
        al2.add("Def");
        al2.add("Ghi");
        String s = GenMethod.getSecondElement(al2);
        System.out.println(s); // Def

    }
}

class GenMethod {
    // Если в класс есть параметр <> в методе его можно не указывать
    public static <T> T getSecondElement(ArrayList<T> al) {
        /*ArrayList<T> al - массив неопределенного типа данных,
          который будет подставлен позже*/
        return al.get(1); // В теле метода возвращаю второй элемент типа Т ArrayList'а (индекс 1)
    }
}