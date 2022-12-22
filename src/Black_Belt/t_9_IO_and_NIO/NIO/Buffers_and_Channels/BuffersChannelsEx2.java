package Black_Belt.t_9_IO_and_NIO.NIO.Buffers_and_Channels;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class BuffersChannelsEx2 {
    public static void main(String[] args) {
        try(RandomAccessFile file = new RandomAccessFile("test5.txt", "r");
            FileChannel channel = file.getChannel()){

            ByteBuffer buffer = ByteBuffer.allocate(5); // создал буфер на 5 байт
            channel.read(buffer); // записали 5 байт из файла в буфер
            buffer.flip(); // перевели буфер в режим чтения
            System.out.println((char) buffer.get()); // a
            System.out.println((char) buffer.get()); // b
            System.out.println((char) buffer.get()); // c
            buffer.rewind(); // переместит position на 0
            System.out.println((char) buffer.get()); // a
            System.out.println("-----------------------------------------------");
            buffer.compact();
            channel.read(buffer);
            buffer.flip(); // перевели буфер в режим чтения
            while (buffer.hasRemaining()){ // пока есть что читать
                System.out.println((char)buffer.get());
            }
            System.out.println("-----------------------------------------------");
            buffer.clear();// меняет режим буфера с чтения на запись (position = 0),
            // старые байты не удаляются а записываются поверх старых
            channel.read(buffer);
            buffer.flip(); // перевели буфер в режим чтения
            System.out.println((char) buffer.get()); // g
            buffer.mark(); // поставили отметку
            System.out.println((char) buffer.get()); // h
            System.out.println((char) buffer.get()); // i
            buffer.reset(); // вернуться к отметке
            while (buffer.hasRemaining()){
                System.out.println((char)buffer.get());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
