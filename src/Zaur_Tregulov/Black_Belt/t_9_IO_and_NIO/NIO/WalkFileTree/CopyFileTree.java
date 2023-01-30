package Zaur_Tregulov.Black_Belt.t_9_IO_and_NIO.NIO.WalkFileTree;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;

public class CopyFileTree {
    public static void main(String[] args) throws IOException {
        Path source = Paths.get("C:\\Users\\Andrey\\Desktop\\X");
        Path destination = Paths.get("C:\\Users\\Andrey\\Desktop\\CopyHere");

//        Path source = Paths.get("E:\\BandiCamVideo\\bandicam 2021-03-05 19-10-56-419.mp4");
//        Path destination = Paths.get("G:\\test");

        // source - откуда начать, new MyFileVisitor2(source, destination) - что делать
        Files.walkFileTree(source, new MyFileVisitor2(source, destination));
        System.out.println("Done!");

    }
}

class MyFileVisitor2 extends SimpleFileVisitor<Path> {
    Path source;
    Path destination;

    public MyFileVisitor2(Path source, Path destination) {
        this.source = source;
        this.destination = destination;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        Path newDestination = destination.resolve(source.relativize(dir));
        Files.copy(dir, newDestination, StandardCopyOption.REPLACE_EXISTING);
        return FileVisitResult.CONTINUE; // означает, что нужно продолжать обход по файлам
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        Path newDestination = destination.resolve(source.relativize(file));
        Files.copy(file, newDestination, StandardCopyOption.REPLACE_EXISTING);
        return FileVisitResult.CONTINUE;
    }
}
