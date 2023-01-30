package Zaur_Tregulov.Black_Belt.t_9_IO_and_NIO.IO.FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx1 {
    public static void main(String[] args) throws IOException{
        String rubai = "Много лет размышлял я над жизнью земной.\n" +
        "Непонятного нет для меня под луной.\n" +
        "Мне известно, что мне ничего не известно! —\n" +
        "Вот последняя правда, открытая мной.\n" ;

        FileWriter writer = null;
        try {
            writer = new FileWriter("Test2.txt"); // если не указать путь, создаст файл в корне
            for (int i = 0; i < rubai.length(); i++) {
                // записываем в файл по символам
                writer.write(rubai.charAt(i));
            }
            System.out.println("Done!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            writer.close(); // обязательно закрывать stream
        }
    }
}
