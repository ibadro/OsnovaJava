package Black_Belt.t_8_Multithreading.SynchronizedMeth;

public class SynchronizedBlock1 {
    public static void main(String[] args) {
        MyRunnableImpl2 runnable = new MyRunnableImpl2();
        Thread thred1 = new Thread(runnable);
        Thread thred2 = new Thread(runnable);
        Thread thred3 = new Thread(runnable);
        // Между потоками нету синхронизации
        thred1.start();
        thred2.start();
        thred3.start();
    }
}

class Counter2 {
    static int count = 0;
}

class MyRunnableImpl2 implements Runnable{

    private void doWork2(){
        System.out.println("Ura!!!");
    }

    private void doWork1(){
        doWork2();
        /** Синхронизированный блок */
        synchronized (this){
        Counter2.count++;
        System.out.println(Counter2.count); // 2 4 5 1 6 7 3 8 9
        // чтобы исправить надо прописать synchronized в методе
        }
    }
    @Override
    public synchronized void run() {
        for (int i = 0; i <3; i++) {
            doWork1();
        }
    }
}
