package Black_Belt.Tests.Test2;

public class Main {
    public static void main(String[] args) {
        Head head1 = new RoboHead(12);
        Head head2 = new RoboHead2(15);

        Robot robot1 = new Robot(head1, "Вертер");
        Robot robot2 = new Robot(head2, "Вертер2");
        System.out.println(robot1);
        System.out.println(robot2);


    }
}
