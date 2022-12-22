package Black_Belt.Tests.Test3;

public class Threeeeds {
    public static void main(String[] args) {
        Thread thread = new Thread(new Test());
        thread.start();
        Test2 test2 = new Test2();
        test2.start();
    }
}

class Test implements Runnable {
    int a = 1;
    int b = 2;
    int c = 3;

    public void run() {
        System.out.println(a+b+c);
    }
}

class Test2 extends Thread{
    @Override
    public void run() {
        int a=0;
        for (int i = 1; i <= 10; i++) {
            a+=i;
        }
        System.out.println(a);
    }
}