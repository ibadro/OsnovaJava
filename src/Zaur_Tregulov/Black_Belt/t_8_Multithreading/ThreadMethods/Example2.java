package Zaur_Tregulov.Black_Belt.t_8_Multithreading.ThreadMethods;



public class Example2 implements Runnable{
    @Override
    public void run() {
        System.out.println("Method run. Thread name =  " + Thread.currentThread().getName());
        /** Thread.currentThread() - текущий поток */
        // .getName() - узнать его имя
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Example2());
        thread.run(); // запускает метод, а не поток
        System.out.println("Method main. Thread name =  " + Thread.currentThread().getName());
    }
}
