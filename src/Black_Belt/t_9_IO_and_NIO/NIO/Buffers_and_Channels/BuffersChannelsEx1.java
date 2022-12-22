package Black_Belt.t_9_IO_and_NIO.NIO.Buffers_and_Channels;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class BuffersChannelsEx1 {
    public static void main(String[] args) {
        try(RandomAccessFile file =
                    new RandomAccessFile("test10.txt", "rw");
            // RandomAccessFile преобразовали в FileChannel
            FileChannel channel = file.getChannel();
        ){

            ByteBuffer buffer = ByteBuffer.allocate(25); // Создали Buffer размером 25 байт
            StringBuilder stix = new StringBuilder();

            // Создаем переменную = при помощи channel читаем информацию из файла
            // и записываем ее в buffer (возвращает количество прочитанных байт)
            int byteRead = channel.read(buffer);

            while (byteRead >0){ // пока есть что читать
                System.out.println("Read " + byteRead);

                buffer.flip(); // меняет режим буфера с записи на чтение (position = 0)

                while (buffer.hasRemaining()){ // hasRemaining() - пока есть что читать - читаем из буфера
                    stix.append((char)buffer.get()); // В StringBuilder добавляем (кастим в чар) байты из buffer по-порядку
                }

                buffer.clear(); // меняет режим буфера с чтения на запись (position = 0),
                // старые байты не удаляются а записываются поверх старых

                byteRead = channel.read(buffer); // читаем информацию из файла и записываем ее в буфер
            }
            System.out.println(stix);

            String text = "\nThere are only two ways to live your life."+
                    "\nOne is as though nothing is a miracle."+
                    "\nThe other is as though everything is a miracle.";

            /** Записываем текст в файл ВАРИАНТ 1*/
            ByteBuffer buffer2 = ByteBuffer.allocate(text.getBytes().length); // Создали буфер размером байт текста
            // заносим текст в буфер массив байтов
            buffer2.put(text.getBytes());

            buffer2.flip(); // меняет режим буфера с записи на чтение (position = 0)

            channel.write(buffer2); // буфер -> канал -> файл

            /** Записываем текст в файл ВАРИАНТ 1*/

            // Передаем в буфер массив байт text и устаанвливает
            // автоматом нужный размер буфера + сам вызывает flip
            ByteBuffer buffer3 = ByteBuffer.wrap(text.getBytes());
            channel.write(buffer3); // буфер -> канал -> файл

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
