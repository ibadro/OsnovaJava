package Zaur_Tregulov.Black_Belt.t_8_Multithreading.ThreadMethods;

public class Example5 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Method main begins");
        Thread thread = new Thread(new Worker());
        System.out.println(thread.getState()); // NEW
        thread.start();
        System.out.println(thread.getState()); // RUNNABLE
//        thread.join(1500); // ждать либо 1,5 сек либо завершения Worker
//        // (что быстрее то и сработает), т.к. Worker работает дольше 1,5 секунды,
        thread.join();
        System.out.println(thread.getState()); // TERMINATED
//        Method main begins
//        Work begin
//        Method main ends
//        Work ends

        System.out.println("Method main ends");
    }
}

class Worker implements Runnable{

    @Override
    public void run() {
        System.out.println("Work begin");
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Work ends");
    }
}