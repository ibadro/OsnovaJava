package Black_Belt.t_8_Multithreading.Semaphore;

import java.util.concurrent.Semaphore;

/**
 * Semaphore–это синхронизатор, позволяющийограничить доступ
 * к какому-то ресурсу. В конструктор Semaphore нужно передавать
 * количество потоков,которым Semaphore будет разрешать
 * одновременноиспользовать этот ресурс.
 */
public class SemaphoreEx1 {
    public static void main(String[] args) {
        Semaphore callBox = new Semaphore(2);
        new Person("Andrey", callBox);
        new Person("Oleg", callBox);
        new Person("Elena", callBox);
        new Person("Viktor", callBox);
        new Person("Marina", callBox);
    }
}

class Person extends Thread{
    String name;
    private Semaphore callBox;

    public Person(String name, Semaphore callBox) {
        this.name = name;
        this.callBox = callBox;
        // Запускает поток при его создании
        this.start();
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " ждет...");
            // acquire() - попытка получить разрешение от Semaphore,
            // блокирует поток до тех пор пока Semaphore не даст добро
            // после получения разрешения counter Semaphore уменьшается на 1
            callBox.acquire();
            System.out.println(name + " пользуется телефоном");
            sleep(2000);
            System.out.println(name + " завершил(а) звонок");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Освободить счетчик Semaphore
            callBox.release();
        }
    }
}