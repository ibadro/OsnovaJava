package Zaur_Tregulov.Black_Belt.t_3_Generics.game;

public class Game {
    public static void main(String[] args) {
        // Создаем двух школьников
        Schoolboy schoolboy1 = new Schoolboy("Иван", 13);
        Schoolboy schoolboy2 = new Schoolboy("Мария", 15);
        Schoolboy schoolboy3 = new Schoolboy("Сергей", 14);
        Schoolboy schoolboy4 = new Schoolboy("Дарья", 12);

        // Создаем двух студентов
        Student student1 = new Student("Сергей", 18);
        Student student2 = new Student("Светлана", 20);

        // Создаем двух работников
        Employee employee1 = new Employee("Григорий", 28);
        Employee employee2 = new Employee("Ксения", 32);

        // Создаем команду школьников и добавляем в нее школьников
        Team<Schoolboy> schoolTeam = new Team("\"Школьные Драконы\"");
        /*Добавили дженерик чтобы можно было добавлять только объекты класса Schoolboy*/
        schoolTeam.addNewParticipant(schoolboy1);
        schoolTeam.addNewParticipant(schoolboy2);
        Team<Student> studentTeam = new Team("\"Студенческие Будни\"");
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);
        Team<Employee> еmployeeTeam = new Team("\"Работяги\"");
        еmployeeTeam.addNewParticipant(employee1);
        еmployeeTeam.addNewParticipant(employee2);

        // Создаем вторую команду школьников
        Team<Schoolboy> schoolTeam2 = new Team("\"Школьные Тигры\"");
        schoolTeam.addNewParticipant(schoolboy3);
        schoolTeam.addNewParticipant(schoolboy4);
        schoolTeam.palayWith(schoolTeam2);
    }
}
