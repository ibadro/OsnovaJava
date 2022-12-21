package Black_Belt.Multithread.Volatile;

public class VolatileEx1 extends Thread{
    volatile boolean b = true;

    /**
     * Без volatile память о переменной будет храниться в кэше потока
     * С volatile память о переменной будет храниться в основной памяти
     */

    @Override
    public void run() {
        long counter = 0;
        while (b){
            counter++;
        }
        System.out.println("Loop is finished. counter = " + counter);
    }

    public static void main(String[] args) throws InterruptedException {

        VolatileEx1 thread = new VolatileEx1();
        thread.start();
        Thread.sleep(1);
        System.out.println("Через 3 секунды пора просыпаться!!!");
        thread.b = false;
        thread.join();
        System.out.println("Конец программы");
    }
}
