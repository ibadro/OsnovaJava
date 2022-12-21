package Black_Belt.Multithread;

public class Ex2 {
    public static void main(String[] args) {
        MyThrea1  myThrea1 =new MyThrea1();
        MyThrea2  myThrea2 =new MyThrea2();
        myThrea2.start();
        myThrea1.start();

    }
}

class  MyThrea1 extends Thread {
    public void  run(){
        for (int i = 1; i <=1000; i++) {
            System.out.println(i);
        }
    }
}class  MyThrea2 extends Thread {
    public void run(){
        for (int i = 1000; i >0; i--) {
            System.out.println(i);
        }
    }
}