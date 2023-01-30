package Zaur_Tregulov.Black_Belt.t_5_Nested_classes.Local_Inner_Class;

/**
 * • Local inner класс располагается в блоках кода таких,
 * как, например, метод или конструктор
 * • Local inner класс не может быть static
 * • Область видимости local inner класса – это блок, в
 * котором он находится
 * • Local inner класс может обращаться даже к private
 * элементам внешнего класса
 * • Local inner класс может обращаться к элементам
 * блока, в котором он написан при условии, что они
 * final или effectively final

 */
public class LocalInner1 {
    public static void main(String[] args) {
        Math math = new Math();
        math.getResult();
    }
}

class Math {

    private int a = 10;
    int delimoe = 21;

    void getResult() {

        class Delenie {
//            private int delimoe;
            private int delitel;

//            public int getDelimoe() {
//                return delimoe;
//            }
//
//            public void setDelimoe(int delimoe) {
//                this.delimoe = delimoe;
//            }

            public int getDelitel() {
                return delitel;
            }

            public void setDelitel(int delitel) {
                this.delitel = delitel;
            }

            public int getChastnoe() {
                return delimoe / delitel;
            }

            public int getOstatok() {
                System.out.println("a = "+ a);
                return delimoe % delitel;
            }
        }
        Delenie delenie = new Delenie();
//        delenie.setDelimoe(21);
        delenie.setDelitel(4);
//        System.out.println("Delimoe = " + delenie.getDelimoe());
        System.out.println("Delimoe = " + delimoe);
        System.out.println("Delitel = " + delenie.getDelitel());
        System.out.println("Chastnoe = " + delenie.getChastnoe());
        System.out.println("Ostatok = " + delenie.getOstatok());
    }
}

