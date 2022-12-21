package Black_Belt.Multithread;

public class Ex3 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyThrea3());
        Thread t1 = new Thread(new MyThrea4());
        t1.start();
        t.start();
    }
}

class MyThrea3 implements Runnable {
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.println(i);
        }
    }
}

class MyThrea4 implements Runnable {
    public void run() {
        for (int i = 1000; i > 0; i--) {
            System.out.println(i);
        }
    }
}