package Black_Belt.Tests.Test8;

import java.util.ArrayList;

public class Errors {
    public static void main(String[] args) {

        String a = "hello";
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(5);
        throw new MyArrayIndexOutOfBoundsException();



    }

    static class MyArrayIndexOutOfBoundsException extends IndexOutOfBoundsException{


        public MyArrayIndexOutOfBoundsException() {
        }

        public MyArrayIndexOutOfBoundsException(String s) {
            super(s);
        }

        public MyArrayIndexOutOfBoundsException(int index) {
            super(index);
        }
    }

    static class MyIndexOutOfBoundsException extends RuntimeException{
        public MyIndexOutOfBoundsException() {
        }

        public MyIndexOutOfBoundsException(String message) {
            super(message);
        }

        public MyIndexOutOfBoundsException(String message, Throwable cause) {
            super(message, cause);
        }

        public MyIndexOutOfBoundsException(Throwable cause) {
            super(cause);
        }

        public MyIndexOutOfBoundsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
            super(message, cause, enableSuppression, writableStackTrace);
        }
    }



}


