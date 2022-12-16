package Alex;
/*Создать массив из 100 элементов от 1 до 100, вывести на экран только элементы с четными индексами
3
5
7
...
99
*/

public class ЧетныеИндексы {
    public static void main(String[] args) {
        int[] myList = new int [101];


        for (int i = 2; i < myList.length; i++) {
            myList[i] = i;
            if(i%2 != 0){
                System.out.println( + myList[i] + ", ");
            }
        }

    }
}