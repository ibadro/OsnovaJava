package Zaur_Tregulov.Black_Belt.t_3_Generics.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Добавляем дженерик, чтобы Team ассоциировался с суб-классом Participant
public class Team<T extends Participant> { // Добавляем дженерик, чтобы Team ассоциировался с конкретным объектом
    // Переменная name - название команды
    private String name;
    // Список participants - для создания списка участников
    private List<T> participants = new ArrayList<>();

    // Конструктор
    public Team(String name) {
        this.name = name;
    }

    // Метод для добавления игроков в команду
    public void addNewParticipant(T participant) {
        participants.add(participant);
        System.out.println("В команду " + name + " был добавлен новый участник" + // выдает имя команды
                " по имени " + ((Participant) participant).getName()); // Скастил объект до Participant, выдает имя игрока
    }                           // если выше прописать <T extends Participant>, то можно не кастить

    // Метод две команды играют друг с другом
    public void palayWith(Team<T> team) { // Применили дженерик чтобы метод работал только на объектах одного типа
        // Имя команды победителя
        String winnerName;
        Random random = new Random();
        // Переменная которая получит либо 0 либо 1
        int i = random.nextInt(2);
        if (i == 0) { // если i = 0
            winnerName = this.name; // то победитель команда которая вызывает на себе этот метод
        } else {
            winnerName = team.name; // то команда с которой сравнивают/идет игра
        }
        System.out.println("Выиграла команда !!!" + winnerName + "!!!");
    }
}
