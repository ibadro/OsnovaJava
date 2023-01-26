package Alishev.zadania;

public class geometric {
    public static void main(String[] args) {
        int rectangle = 5; //Прямоугольник

//Прямоугольник
        for (int i = 2; i < rectangle; i++){
            for (int j = -5; j < rectangle; j++){
                System.out.print("+");
            }
            System.out.println("*");
        }

//1-й вариант Прямоугольного треугольника
        for (int i = 0; i < rectangle; i++){
            for (int j = i; j < rectangle; j++){
                System.out.print("+");
            }
            System.out.println("  *"+i);
        }

//2-й вариант Прямоугольного треугольника
        for (int i = 0; i < rectangle; i++){
            for (int j = rectangle; j > i; j--){
                System.out.print("+");
            }
            System.out.println(" *"+i);
        }

//3-й вариант Прямоугольного треугольника
        for (int i = rectangle; i >= 0; i--){

            for (int j = i; j <= rectangle; j++){
                System.out.print("+");
            }
            System.out.println("  *"+i);
        }

//4-й вариант Прямоугольного треугольника
        for (int i = rectangle; i >= 0; i--) {
            //Левое пустое пространство
            for (int j = i; j <= rectangle; j++){
                System.out.print("+");
                for (int j2 = i; j2 <= j; j2++){
                    System.out.print("-");
                }
            }

            //Левая часть треугольника
            for (int j1 = 0; j1 <= i; j1++){
                System.out.print(" ");
            }
            System.out.println("  *" + i);
        }

//1-й вариант Треугольника
        for (int i = 0; i <= rectangle; i++){

            //Левое пустое пространство
            for (int j = rectangle; j > i; j--){
                System.out.print(" ");
            }

            //Левая часть треугольника
            for (int j1 = 0; j1 <= i; j1++){ //Здесь можно изменить счётчик или поставить равенство с внешним счётчиком что бы пирамидка была остроугольная
                System.out.print("+");
            }

            //Правая часть треугольника
            for (int j = 0; j < i; j++){
                System.out.print("+");
            }

            //Правое пустое пространство
            for (int j = rectangle; j > i; j--){
                System.out.print(" ");
            }

            System.out.println("*"+i);
        }

//1-й вариант Ромб
        for (int i = 0; i < rectangle; i++){

            //Левое пустое пространство
            for (int j = rectangle; j > i; j--){
                System.out.print(" ");
            }

            //Левая часть треугольника
            for (int j1 = 0; j1 <= i; j1++){ //Здесь можно изменить счётчик или поставить равенство с внешним счётчиком что бы пирамидка была остроугольная
                System.out.print("+");
            }

            //Правая часть треугольника
            for (int j = 0; j < i; j++){
                System.out.print("+");
            }

            //Правое пустое пространство
            for (int j = rectangle; j > i; j--){
                System.out.print(" ");
            }

            System.out.println("*"+i);
        }
        for (int i = rectangle; i >= 0; i--){ //Заменили всего одну строку и поменяли знак >= Что бы Ромб был острый

            //Левое пустое пространство
            for (int j = rectangle; j > i; j--){
                System.out.print(" ");
            }

//            //Левая часть треугольника
            for (int j1 = 0; j1 <= i; j1++){ //Здесь можно изменить счётчик или поставить равенство с внешним счётчиком что бы пирамидка была остроугольная
                System.out.print("+");
            }

            //Правая часть треугольника
            for (int j = 0; j < i; j++){
                System.out.print("+");
            }

            //Правое пустое пространство
            for (int j = rectangle; j > i; j--){
                System.out.print(" ");
            }

            System.out.println("*"+i);
        }
    }
}