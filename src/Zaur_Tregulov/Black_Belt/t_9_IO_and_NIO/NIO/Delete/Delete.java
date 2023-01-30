package Zaur_Tregulov.Black_Belt.t_9_IO_and_NIO.NIO.Delete;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class Delete {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\Users\\Andrey\\Desktop\\CopyHere");

        Files.walkFileTree(path, new MyFileVisitor());
        System.out.println("Delete Done!");
    }
}

class MyFileVisitor extends SimpleFileVisitor<Path>{

    @Override
    /** срабатывает при обращении к фалу; */
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs)
            throws IOException {
        System.out.println("Delete file: " + file.getFileName() + " - visitFile");
        Files.delete(file); // удаляет файл
        return FileVisitResult.CONTINUE;
    }

    @Override
    /** срабатывает после обращения ко всем элементам папки; */
    public FileVisitResult postVisitDirectory(Path dir, IOException exc)
            throws IOException {
        System.out.println("Delete Directory: " + dir + " - preVisitDirectory");
        Files.delete(dir); // удаляет директорию
        return FileVisitResult.CONTINUE; // означает, что нужно продолжать обход по файлам
    }

}