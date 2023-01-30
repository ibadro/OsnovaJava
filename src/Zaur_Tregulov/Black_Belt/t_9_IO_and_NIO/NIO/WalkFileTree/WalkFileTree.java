package Zaur_Tregulov.Black_Belt.t_9_IO_and_NIO.NIO.WalkFileTree;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * Метод Files.walkFileTree(Path start, FileVisitor visitor) используется
 * для обхода дерева файлов.
 * Логика обхода дерева файлов заключается в классе,
 * имплементирующем интерфейс FileVisitor .
 * preVisitDirectory - срабатывает перед обращением к элементам
 * папки;
 * visitFile - срабатывает при обращении к фалу;
 * postVisitDirectory - срабатывает после обращения ко всем
 * элементам папки;
 * visitFileFailed - срабатывает когда файл по каким-то причинам
 * недоступен.
 */
public class WalkFileTree {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\Users\\un9331\\Desktop\\X");
        Files.walkFileTree(path, new MyFileVisitor());

    }
}

/**
 * Значения FileVisitResult:
 * CONTINUE – означает, что нужно продолжать обход по
 * файлам;
 * TERMINATE – означает, что нужно немедленно
 * прекратить обход по файлам;
 * SKIP_SUBTREE – означает, что в данную директорию
 * заходить не надо;
 * SKIP_SIBLINGS – означает, в данной директории
 * продолжать обход по файлам не нужно.
 */
class MyFileVisitor implements FileVisitor<Path>{

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        System.out.println("Enter to Directory: " + dir + " - preVisitDirectory");
        return FileVisitResult.CONTINUE; // означает, что нужно продолжать обход по файлам
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        System.out.println("File name: " + file.getFileName() + " - visitFile");
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        System.out.println("Error while visiting file: " + file.getFileName() + " - visitFileFailed");
        return FileVisitResult.TERMINATE; // означает, что нужно немедленно прекратить обход по файлам;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        System.out.println("Exit from Directory: " + dir + " - postVisitDirectory");
        return FileVisitResult.CONTINUE;
    }
}