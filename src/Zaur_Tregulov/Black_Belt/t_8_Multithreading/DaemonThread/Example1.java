package Zaur_Tregulov.Black_Belt.t_8_Multithreading.DaemonThread;

public class Example1 {
    public static void main(String[] args) {
        System.out.println("Main Thread starts");
        UserThread userThread = new UserThread();
        userThread.setName("Пользовательский поток");
        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setName("Поток-демон");
        /** Указываем что  daemonThread это Поток-демон
         * setDaemon() вызывается ПОСЛЕ создания потока и ДО запуска потока
         * иначе выдаст исключение
         */
        daemonThread.setDaemon(true);
        userThread.start();
        daemonThread.start();

        System.out.println("Main Thread ends");
    }
}

class UserThread extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is Daemon " + isDaemon());
        for (char i = 'A'; i <= 'J'; i++) {
            try {
                sleep(300);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class DaemonThread extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is Daemon " + isDaemon());
        for (int i = 1; i < 1000; i++) {
            try {
                sleep(100);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}