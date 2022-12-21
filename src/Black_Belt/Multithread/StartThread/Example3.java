package Black_Belt.Multithread.StartThread;

/** Через наследование Thread основным классом*/
public class Example3 extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        // первый поток
        Example3 thread1 = new Example3();
        thread1.start();

        // второй поток
        for (int i = 1000; i > 0; i--) {
            System.out.println(i);
        }
    }
}
