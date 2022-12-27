package test;

public class testtttt {
    public static void main(String[] args) {
        Test22 test = new Test22();
        Thread thread = new Thread(test);
        thread.start();
    }
}


class Test22 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}