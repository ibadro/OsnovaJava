package Black_Belt.t_8_Multithreading.AtomicInteger;

public class AtomicIntegerEx1 {
    static int counter = 0;

    public synchronized static void increment(){
        counter++;
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyRunnableImpl18());
        Thread thread2 = new Thread(new MyRunnableImpl18());
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
        System.out.println(counter);
    }
}

class MyRunnableImpl18 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            AtomicIntegerEx1.increment();
        }
    }
}