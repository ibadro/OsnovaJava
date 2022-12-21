package Black_Belt.Multithread.ThreadMethods;

public class Example3_sleep {
    public static void main(String[] args) throws InterruptedException{
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }
        /** sleep() задержка потока милисекунд (выбрасывает InterruptedException)*/
        Thread.sleep(1000);
        System.out.println("Поехали!!!");
    }
}
