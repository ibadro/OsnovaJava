package Black_Belt.t_8_Multithreading.Exchanger;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

/**
 * Exchanger – это синхронизатор, позволяющий
 * обмениваться данными между двумя потоками,
 * обеспечивает то, что оба потока получат информацию
 * друг от друга одновременно.
 */

public class ExchangerEx1 {
    public static void main(String[] args) {
        // Создаем exchanger для сонхронизации потока
        Exchanger <Action> exchanger = new Exchanger<>();

        List<Action> friend1Action = new ArrayList<>();
        friend1Action.add(Action.NOJNICI);
        friend1Action.add(Action.BUMAGA);
        friend1Action.add(Action.NOJNICI);

        List<Action> friend2Action = new ArrayList<>();
        friend2Action.add(Action.BUMAGA);
        friend2Action.add(Action.KAMEN);
        friend2Action.add(Action.KAMEN);

        new BestFriend("Vanja", friend1Action, exchanger);
        new BestFriend("Petya", friend2Action, exchanger);
    }
}

enum Action {
    KAMEN, NOJNICI, BUMAGA;
}

class BestFriend extends Thread {
    private String name;
    private List<Action> myActions;
    private Exchanger<Action> exchanger;

    public BestFriend(String name, List<Action> myActions, Exchanger<Action> exchanger) {
        this.name = name;
        this.myActions = myActions;
        this.exchanger = exchanger;
        // Запуск потока при создании
        this.start();
    }

    private void whoWins(Action myAction, Action friendAction) {
        // мой Action бъет Action друга
        if ((myAction == Action.KAMEN && friendAction == Action.NOJNICI)
                || (myAction == Action.NOJNICI && friendAction == Action.BUMAGA)
                || (myAction == Action.BUMAGA && friendAction == Action.KAMEN)){
            // выводи сообщение
            System.out.println(name + "WINS!!!");
        }
    }

    @Override
    public void run() {
       // Создаем дефолтную переменную класса Action
       Action replay;
       // Перебираем myActions массив объектов Action
       for (Action myActions : myActions){
           try {
               // Присваиваем переменной replay значение потока который надо ждать
               replay = exchanger.exchange(myActions);
               whoWins(myActions, replay);
               sleep(2000);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
    }
}