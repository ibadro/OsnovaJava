package Black_Belt.t_9_IO_and_NIO.IO.TryWithResources;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args) throws IOException {
        String rubai = "Много лет размышлял я над жизнью земной.\n" +
                "Непонятного нет для меня под луной.\n" +
                "Мне известно, что мне ничего не известно! —\n" +
                "Вот последняя правда, открытая мной.\n";

        /** Если FileWriter прописать в параметре try, то поток сам закроется
         * после завершения, finally можно не писать */
        try (FileWriter writer = new FileWriter("Test2.txt")) {
            for (int i = 0; i < rubai.length(); i++) {
                // записываем в файл по символам
                writer.write(rubai.charAt(i));
            }
            System.out.println("Done!");
        } catch (
                IOException e) {
            e.printStackTrace();
        }

        /** Аналогично и с FileReader */
        try (FileReader reader = new FileReader("Test3.txt")) {
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            System.out.println();
            System.out.println("Выполнено!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        /** Можно и объеденить */

        try (FileWriter writer2 = new FileWriter("Test3.txt", true);
             FileReader reader2 = new FileReader("Test3.txt");) {
            for (int i = 0; i < rubai.length(); i++) {
                // записываем в файл по символам
                writer2.write(rubai.charAt(i));
            }

            int character;
            while ((character = reader2.read()) != -1) {
                System.out.print((char) character);
            }

            System.out.println("Done!");

        } catch (IOException e){ // если в main прописан throws IOException блок catch можно не писать
            e.printStackTrace();
        }

    }
}
