package Zaur_Tregulov.Black_Belt.Tests.Test2;

public class RoboHead implements Head{
    private int size;
    private String s = "голова из набора - 1";
    private String s2 = "так-то";

    public RoboHead(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return s +
                "размер=" + size +
                '}' + s2;
    }

    @Override
    public int getSize() {
        return size;
    }
}
