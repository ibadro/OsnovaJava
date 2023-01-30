package Zaur_Tregulov.Black_Belt.Tests.Test5;

import java.io.FileWriter;
import java.io.IOException;


public class Test<T> {
    public static void main(String[] args) throws InterruptedException, IOException {
        String message = "Привет! \n" + "Как дела?\n";
        String message2 = "Man!\n";

        FileWriter writer = new FileWriter("C:\\Users\\un9331\\Desktop\\test2.doc", true);

        try {
//            writer = new FileWriter("C:\\Users\\un9331\\Desktop\\test2.doc", true);
//            writer = new FileWriter("Test2.txt", true);
            for (int i = 0; i < message.length(); i++) {
                writer.write(message.charAt(i));
            }
            writer.write("Man!");
            System.out.println("Записано!");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            writer.close();
        }


    }
}
