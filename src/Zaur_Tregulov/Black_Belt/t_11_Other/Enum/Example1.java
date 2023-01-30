package Zaur_Tregulov.Black_Belt.t_11_Other.Enum;

public class Example1 {
    void method(String dayOfWeek){
        System.out.println("Today is " + dayOfWeek);
    }

    public static void main(String[] args) {
        Example1 ex1 = new Example1();
        ex1.method("monday");
        Today today1 = new Today(WeekDays.MONDAY);
        today1.daysInfo();



    }
}

enum WeekDays{
    MONDAY(),
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

}

class Today {
    WeekDays weekDay;
    public Today(WeekDays weekDayIN){this.weekDay = weekDayIN;}

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
    }

}