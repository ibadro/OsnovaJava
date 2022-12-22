package Black_Belt.Tests.Test2;

public class Robot {
    private Head head;
    private String name;

    public Robot(Head head, String name) {
        this.head = head;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "head=" + head +
                ", name='" + name + '\'' +
                '}';
    }
}
