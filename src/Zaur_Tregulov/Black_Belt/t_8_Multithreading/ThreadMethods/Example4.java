package Zaur_Tregulov.Black_Belt.t_8_Multithreading.ThreadMethods;

public class Example4 extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000); // вызывает Exception, надо try/catch
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyRunnable1());
        Example4 thread2 = new Example4();
        thread1.start();
        thread2.start();

        System.out.println("Start"); // вывод первым, т.к. на других потоках задержка

        thread1.join(); // поток main ждет пока выполнится поток thread1 потом след строка
        thread2.join(); // поток main ждет пока выполнится поток thread2 потом след строка
        System.out.println("Fin!!!"); // вывод первым, т.к. на других потоках задержка
    }

}
class MyRunnable1 implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000); // вызывает Exception, надо try/catch
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}