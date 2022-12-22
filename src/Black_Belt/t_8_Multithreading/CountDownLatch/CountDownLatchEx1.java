package Black_Belt.t_8_Multithreading.CountDownLatch;

import java.util.concurrent.CountDownLatch;

/**
 * CountDownLatch–это синхронизатор, позволяющий любому количеству
 * потоков ждать пока не завершится определённое количество операций.
 * В конструктор CountDownLatch нужно передавать количество операций,
 * которые должны завершится, чтобы потоки продолжили свою работу.
 */
public class CountDownLatchEx1 {
    static CountDownLatch countDownLatch = new CountDownLatch(3);

    private static void marketStaffIsOnPlace() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Market staff came to work");
        // Уменьшаем счетчик CountDownLatch на 1
        countDownLatch.countDown();
        // getCount() - возвращает значение счетчика
        System.out.println("CountDownLatch = " + countDownLatch.getCount());
    }

    private static void everythingIsReady() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Everything Is Ready, so let's open market");
        // Уменьшаем счетчик CountDownLatch на 1
        countDownLatch.countDown();
        // getCount() - возвращает значение счетчика
        System.out.println("CountDownLatch = " + countDownLatch.getCount());
    }

    private static void openMarket() throws InterruptedException {
        Thread.sleep(4000);
        System.out.println("Market is open");
        // Уменьшаем счетчик CountDownLatch на 1
        countDownLatch.countDown();
        // getCount() - возвращает значение счетчика
        System.out.println("CountDownLatch = " + countDownLatch.getCount());
    }


    public static void main(String[] args) throws InterruptedException {
        new Friend("Andrey", countDownLatch);
        new Friend("Oleg", countDownLatch);
        new Friend("Elena", countDownLatch);
        new Friend("Viktor", countDownLatch);
        new Friend("Marina", countDownLatch);

        marketStaffIsOnPlace();
        everythingIsReady();
        openMarket();
    }
}

class Friend extends Thread {
    String name;
    private CountDownLatch countDownLatch;

    public Friend(String name, CountDownLatch countDownLatch) {
        this.name = name;
        this.countDownLatch = countDownLatch;
        this.start();
    }

    @Override
    public void run() {

        try {
            // Если счетчик > 0, то заблокирует поток, пока счетчик не станет равен 0
            countDownLatch.await();
            System.out.println(name + " приступил(а) к покупкам");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}