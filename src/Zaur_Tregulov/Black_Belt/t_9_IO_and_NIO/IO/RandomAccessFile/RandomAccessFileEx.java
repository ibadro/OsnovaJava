package Zaur_Tregulov.Black_Belt.t_9_IO_and_NIO.IO.RandomAccessFile;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Класс RandomAccessFile позволяет читать
 * информацию из любого места файла и записывать
 * информацию в любое место файла.
 */
public class RandomAccessFileEx {
    public static void main(String[] args) {
        try(RandomAccessFile file =
                new RandomAccessFile("test10.txt", "rw")){

            int a = file.read(); // указатель, читает 1 байт и перемещает курсор
            System.out.println((char)a); // H
            String s1 = file.readLine(); // прочитать строку начиная с позиции пойнтера
            System.out.println(s1); // ad I the heavens' embroidered cloths,

            file.seek(101); // переместить позицию на поинтер 101
            String s2 = file.readLine(); // прочитать строку начиная с позиции пойнтера
            System.out.println(s2); //  and the dark cloths

            long position = file.getFilePointer(); // возвращает текущую позицию поинтера
            System.out.println(position); // 123

//            file.seek(0); // переместить позицию на поинтер 0
//            file.writeBytes("!!!Privet!!! "); // запишет поверх старых байт новые

            // Чтобы добавить что-то в конец
            file.seek(file.length()-1);
            file.writeBytes("\n\t\t\t\t\tWilliam Butler Yeats");


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
