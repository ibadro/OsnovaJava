package Zaur_Tregulov.Black_Belt.t_8_Multithreading.StartThread;

public class Example4 {
    public static void main(String[] args) {
        /** Через создание объекта и добавление в параметр объекта интерфейса*/
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello1");
            }
        }).start();

        /** Еще короче через лямбда */
        new Thread(()-> System.out.println("Hello2")).start();
    }
}
