package Black_Belt.Tests.Test8;

public class Loop {
    static int count = 0;

    public static void fibo(int n){
        int[] arr = new int[n];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < arr.length; ++i) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

    }




    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i-2] + arr[i-1];

        }




        for (int i = 0; i < arr.length; ++i) {
            System.out.println(arr[i]);
        }









    }



}
