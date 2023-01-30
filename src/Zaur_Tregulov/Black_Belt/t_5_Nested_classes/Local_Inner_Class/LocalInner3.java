package Zaur_Tregulov.Black_Belt.t_5_Nested_classes.Local_Inner_Class;

public class LocalInner3 {
    public static void main(String[] args) {
        class Slojenie implements Math1{
            @Override
            public int doOperation(int a, int b) {
                return a +b;
            }
        }
        Slojenie slojenie = new Slojenie();
        System.out.println(slojenie.doOperation(3, 5)); // 8
    }
}

interface Math1{
    int doOperation(int a, int b);
}