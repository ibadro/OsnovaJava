package Black_Belt.Tests.Test2;

public class RoboHead2 implements Head{
    private int size;
    private String s = "голова из набора - 2";

    public RoboHead2(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return s +
                "размер=" + size +
                '}';
    }

    @Override
    public int getSize() {
        return size;
    }
}
