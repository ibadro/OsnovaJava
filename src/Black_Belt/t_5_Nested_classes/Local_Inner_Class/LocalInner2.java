package Black_Belt.t_5_Nested_classes.Local_Inner_Class;

public class LocalInner2 {
    public static void main(String[] args) {
        Math2 math2 = new Math2();
        math2.getResult(21, 4);
    }
}

class Math2 {

    void getResult(final int delimoe, final int delitel) {

        class Delenie { /** нельзя присваивать модификаторы класса */

            public int getChastnoe() {
                return delimoe / delitel;
            }

            public int getOstatok() {
                return delimoe % delitel;
            }
        }
        Delenie delenie = new Delenie();
        System.out.println("Delimoe = " + delimoe);
        System.out.println("Delitel = " + delitel);
        System.out.println("Chastnoe = " + delenie.getChastnoe());
        System.out.println("Ostatok = " + delenie.getOstatok());
    }
}