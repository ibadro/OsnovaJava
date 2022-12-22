package Black_Belt.t_8_Multithreading.ThreadMethods;

public class Example1 {
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread();
        // присвоение имени потоку
        myThread1.setName("Поток №1");
        // присвоение приоритета потоку
        myThread1.setPriority(9);
        myThread1.setPriority(Thread.MIN_PRIORITY); // 1
        myThread1.setPriority(Thread.NORM_PRIORITY); // 5
        myThread1.setPriority(Thread.MAX_PRIORITY); // 10

        System.out.println("Name of myThread1 = " + myThread1.getName() +
                " Priority of myThread1 = " + myThread1.getPriority());
        // Name of myThread1 = Поток №1 Priority of myThread1 = 9

        MyThread myThread2 = new MyThread();
        System.out.println("Name of myThread2 = " + myThread2.getName() +
                " Priority of myThread2 = " + myThread2.getPriority());
        // Name of myThread2 = Thread-1 Priority of myThread2 = 5
    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("Hello");;
    }
}