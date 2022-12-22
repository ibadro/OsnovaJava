package Black_Belt.t_8_Multithreading.InterruptThread;

public class InterruptEx1 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main starts");
        InterruptThread thread = new InterruptThread();
        thread.start();
        Thread.sleep(2000);
        thread.interrupt();

        thread.join();
        System.out.println("Main ends");

    }
}

class InterruptThread extends Thread {
    double sqrtSum = 0;

    public void run() {
        for (int i = 0; i <= 1000000000; i++) {
            if (isInterrupted()) {
                System.out.println("Поток хотят прервать.");
                System.out.println("Мы убедились, что состояние всех объектов нормальное" +
                        " и решили завершить работу потока.");
                System.out.println(sqrtSum);
                return; // завершает работу потока
            }
            sqrtSum += Math.sqrt(i);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Поток хотят прервать во время сна." +
                        " Завершаем его работу.");
                System.out.println(sqrtSum);
                return; // завершает работу потока
            }
        }
        System.out.println(sqrtSum);
    }
}