package Black_Belt.Tests.Test7;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Test {
    public static void main(String[] args) {
        // Создали файл для записи и чтения
        try(RandomAccessFile file = new RandomAccessFile("test_t.txt", "rw");
            // Получили канал из файла
            FileChannel channel = file.getChannel();
        ){
            /** ------------------- Запись текста в файл ------------------- */

            String text = "On a dark desert highway, cool wind in my hair\n" +
                    "Warm smell of colitas, rising up through the air\n" +
                    "Up ahead in the distance, I saw a shimmering light\n" +
                    "My head grew heavy and my sight grew dim\n" +
                    "I had to stop for the night\n" +
                    "There she stood in the doorway;\n" +
                    "I heard the mission bell\n" +
                    "And I was thinking to myself,\n" +
                    "\"This could be Heaven or this could be Hell\"\n" +
                    "Then she lit up a candle and she showed me the way\n" +
                    "There were voices down the corridor,\n" +
                    "I thought I heard them say...";

            // Создал буфер = массив байт полученных из text + flip()
            ByteBuffer buffer = ByteBuffer.wrap(text.getBytes());
            // Запись в файл через канал из буфера
            channel.write(buffer);

            /** ------------------- Чтение текста из файла через тот же буфер ------------------- */

            buffer.clear(); // перевожу буфер в режим чтения
            StringBuilder words = new StringBuilder();

                while (buffer.hasRemaining()){ // hasRemaining() - пока есть что читать - читаем из буфера
                    words.append((char)buffer.get()); // В StringBuilder добавляем (кастим в чар) байты из buffer по-порядку
                }
                buffer.clear(); // меняет режим буфера с чтения на запись (position = 0),
                // старые байты не удаляются а записываются поверх старых

            System.out.println(words);

            /** ------------------- Чтение текста из файла через буфер размер 10 ------------------- */

            file.seek(0); // Pointer файла Указатель в позицию 0

            ByteBuffer buffer2 = ByteBuffer.allocate(10); // Создал буфер размером 10 байт
            StringBuilder words2 = new StringBuilder();
            int byteRead = channel.read(buffer2);

            while (byteRead > 0){
                buffer2.flip(); // меняет режим буфера с записи на чтение (position = 0)

                while (buffer2.hasRemaining()){ // hasRemaining() - пока есть что читать - читаем
                    words2.append((char)buffer2.get()); // В StringBuilder добавляем (кастим в чар)
                }
                buffer2.clear(); // меняет режим буфера с чтения на запись (position = 0),
                // старые байты не удаляются а записываются поверх старых

                byteRead = channel.read(buffer2); // дальше читаем информацию из файла и записываем ее в
            }
            System.out.println("\n" + words2);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
