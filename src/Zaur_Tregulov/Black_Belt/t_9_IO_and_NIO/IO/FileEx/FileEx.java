package Zaur_Tregulov.Black_Belt.t_9_IO_and_NIO.IO.FileEx;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 * Класс File позволяет управлять информацией о
 * файлах и директориях.
 * File file = new File (“test1.txt”);
 * getAbsolutePath  isAbsolute
 * isDirectory      exists
 * createNewFile    mkdir
 * length           delete
 * listFiles        isHidden
 * canRead          canWrite
 * canExecute
 */
public class FileEx {
    public static void main(String[] args) throws IOException {
        File file = new File("Test3.txt"); // Относительный путь
        File folder = new File("E:\\02.Java\\Books"); // Абсолютный путь
        File file2 = new File("E:\\02.Java\\Books\\test30.txt");
        File folder2 = new File("E:\\02.Java\\Books\\B"); // Абсолютный путь


        System.out.println("file.getAbsolutePath() " + file.getAbsolutePath());
        // E:\JavaProjekts\Chuck_Java\Test3
        System.out.println("folder.getAbsolutePath() " + folder.getAbsolutePath());
        // E:\02.Java\Books

        // Абсолютный ли путь
        System.out.println("file.isAbsolute() " + file.isAbsolute()); // false
        System.out.println("folder.isAbsolute() " + folder.isAbsolute()); // true

        // Является ли файл директорией
        System.out.println("file.isDirectory() " + file.isDirectory()); // false
        System.out.println("folder.isDirectory() " + folder.isDirectory()); // true

        // Существует ли файл
        System.out.println("file.exists() " + file.exists()); // true
        System.out.println("folder.exists() " + folder.exists()); // true
        System.out.println("file2.exists() " + file2.exists()); // false
        System.out.println("folder2.exists() " + folder2.exists()); // false

        // Создает файл
        System.out.println("file2.createNewFile() " + file2.createNewFile()); // true
        // Создает директорию
        System.out.println("folder2.mkdir() " + folder2.mkdir()); // true
        System.out.println("file.createNewFile() " + file.createNewFile()); // false т.к. такой фал уже есть

        // Узнать размер файла
        System.out.println("file2.length() " + file2.length()); // 6
        System.out.println("folder.length() " + folder.length()); // 8192

        // Удаляет файл
        System.out.println("file2.createNewFile() " + file2.delete()); // true
        // Удаляет директорию только если она пуста
        System.out.println("folder2.mkdir() " + folder2.delete()); // true

        // listFiles() - возвращает массив объектов типа File
        File [] files = folder.listFiles();
        System.out.println(Arrays.toString(files));

        // Проверяет файл/директорию на скрытость
        System.out.println("file.isHidden() " + file.isHidden()); // false т.к. файл не скрыт

        // Есть ли доступ на чтение файла
        System.out.println("file.canRead() " + file.canRead()); // true

        // Есть ли доступ на запись файла
        System.out.println("file.canWrite() " + file.canWrite()); // true

        // Есть ли доступ на выполнение файла
        System.out.println("file.canExecute() " + file.canExecute()); // true

    }
}
