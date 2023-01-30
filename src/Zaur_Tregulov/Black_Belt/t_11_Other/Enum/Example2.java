package Zaur_Tregulov.Black_Belt.t_11_Other.Enum;

import java.util.Arrays;

public class Example2 {

    public static void main(String[] args) {
        Today2 today2 = new Today2(WeekDay.SATURDAY);
        today2.daysInfo();
        System.out.println(today2.weekDay);
        WeekDay w1 = WeekDay.FRIDAY;
        WeekDay w2 = WeekDay.FRIDAY;
        WeekDay w3 = WeekDay.MONDAY;
        System.out.println(w1 == w2); // true
        System.out.println(w1 == w3); // false

        System.out.println(WeekDay.FRIDAY.equals(WeekDay2.FRIDAY)); // false - т.к. разыне типы

        System.out.println(WeekDay.valueOf("MONDAY"));

        // Передать значения констант в массив
        WeekDay [] array = WeekDay.values();
        System.out.println(Arrays.toString(array)); // [MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY]

        for(WeekDay day : array){
            System.out.println(day.toString());
        }
    }
}

enum WeekDay{
    /** ЭЛЕМЕНТЫ */
    MONDAY("bad"),
    TUESDAY("bad"),
    WEDNESDAY("so-so"),
    THURSDAY("so-so"),
    FRIDAY("good"),
    SATURDAY("great"),
    SUNDAY("good");

    /** ПЕРЕМЕННЫЕ */
    private String nastroenie;

    /** КОНСТРУКТОРЫ */
    private WeekDay(String nastroenie){ // конструктор только private!!!
        this.nastroenie = nastroenie;
    }

    WeekDay() { } // можно создать пустой конструктор

    /** МЕТОДЫ */
    public  String getNastroenie(){
        return nastroenie;
    }
}


enum WeekDay2{
    /** ЭЛЕМЕНТЫ */
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

}

class Today2 {
    WeekDay weekDay;
    public Today2(WeekDay weekDayIN){this.weekDay = weekDayIN;}

    void daysInfo(){
        switch (weekDay){
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("Idi na raboty");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Vyhodnoj!");
                break;
        }
        System.out.println("Nastroenie v etot den': " + weekDay.getNastroenie());
    }

}