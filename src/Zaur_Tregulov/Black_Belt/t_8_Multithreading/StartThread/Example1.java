package Zaur_Tregulov.Black_Belt.t_8_Multithreading.StartThread;

public class Example1 {
    public static void main(String[] args) {
        MyThreadFirst myThreadFirst = new MyThreadFirst();
        MyThreadSecond myThreadSecond = new MyThreadSecond();
        myThreadFirst.start();
        myThreadSecond.start();
    }
}

/** Через наследование класса Thread */
class MyThreadFirst extends Thread{
    public void run(){
        for (int i = 1; i <= 1000 ; i++) {
            System.out.println(i);
        }
    }
}

class MyThreadSecond extends Thread{
    public void run(){
        for (int i = 1000; i > 0; i--) {
            System.out.println(i);
        }
    }
}