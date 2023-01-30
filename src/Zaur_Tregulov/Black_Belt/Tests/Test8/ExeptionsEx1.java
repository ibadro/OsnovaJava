package Zaur_Tregulov.Black_Belt.Tests.Test8;

public class ExeptionsEx1 {

    public static int fibo(int i){
        if(i == 0 || i == 1){
            return i;
        }else return fibo(i - 1) + fibo(i -2);
    }






    public static void main(String[] args) {

        int a = fibo(4);
        System.out.println(a);

//        methodabc();
//
//        int vc;

    }


    private static void methodabc() {
        try{
            int a = 2/0;

        } catch (ArithmeticException e){
            System.err.println("нельзя делить на 0");
        } finally {
            System.out.println("Это finally");
        }
    }
}
