package Zaur_Tregulov.Black_Belt.t_9_IO_and_NIO.IO.FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx2 {
    public static void main(String[] args) throws IOException {
        String rubai = "Много лет размышлял я над жизнью земной.\n" +
                "Непонятного нет для меня под луной.\n" +
                "Мне известно, что мне ничего не известно! —\n" +
                "Вот последняя правда, открытая мной.\n" ;

        String s = "Hello!";

        FileWriter writer = null;
        try {
            writer = new FileWriter("Test3.txt"); // если не указать путь, создаст файл в корне
             writer.write(rubai);
//            writer.write(s); // перепишет файл
            System.out.println("Done!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            writer.close(); // обязательно закрывать stream
        }
    }
}
