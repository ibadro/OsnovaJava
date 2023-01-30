package Zaur_Tregulov.Black_Belt.t_8_Multithreading.SynchronizedMeth;

public class Example1 {
    public static void main(String[] args) {
        MyRunnableImpl1 runnable = new MyRunnableImpl1();
        Thread thred1 = new Thread(runnable);
        Thread thred2 = new Thread(runnable);
        Thread thred3 = new Thread(runnable);
        // Между потоками нету синхронизации
        thred1.start();
        thred2.start();
        thred3.start();
    }
}

class Counter {
    static int count = 0;
}

class MyRunnableImpl1 implements Runnable{
    public void increment(){
        Counter.count++;
        System.out.print(Counter.count + " "); // 2 4 5 1 6 7 3 8 9
        // чтобы исправить надо прописать synchronized в методе
    }
    @Override
    public void run() {
        for (int i = 0; i <3; i++) {
            increment();
        }
    }
}