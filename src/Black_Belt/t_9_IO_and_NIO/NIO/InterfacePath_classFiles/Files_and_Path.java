package Black_Belt.t_9_IO_and_NIO.NIO.InterfacePath_classFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

public class Files_and_Path {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test15.txt"); // обращается к файлу
        Path directoryPath = Paths.get("C:\\Users\\un9331\\Desktop\\M"); // обращается к директории

        // Возвращает имя файла или директории
        System.out.println("filePath.getFileName() - " + filePath.getFileName()); // test15.txt
        System.out.println("directoryPath.getFileName() - " + directoryPath.getFileName()); // M
        System.out.println("--------------------------------------------------------------");

        // Возвращает родителя файла или директории
        System.out.println("filePath.getParent() - " + filePath.getParent()); // null
        System.out.println("directoryPath.getParent() - " + directoryPath.getParent()); // C:/Users/un9331/Desktop
        System.out.println("--------------------------------------------------------------");

        // Возвращает родителя файла или директории
        System.out.println("filePath.getRoot() - " + filePath.getRoot()); // null
        System.out.println("directoryPath.getRoot() - " + directoryPath.getRoot()); // C:/
        System.out.println("--------------------------------------------------------------");

        // Возвращает абсолютный путь или нет
        System.out.println("filePath.isAbsolute() - " + filePath.isAbsolute()); // false
        System.out.println("directoryPath.isAbsolute() - " + directoryPath.isAbsolute()); // true
        System.out.println("--------------------------------------------------------------");

        // Возвращает абсолютный путь
        System.out.println("filePath.toAbsolutePath() - " + filePath.toAbsolutePath());
        // E:/JavaProjekts/Chuck_Java/test15.txt
        System.out.println("directoryPath.toAbsolutePath() - " + directoryPath.toAbsolutePath()); // C:/Users/un9331/Desktop/M
        System.out.println("--------------------------------------------------------------");


        System.out.println("filePath.toAbsolutePath().getParent() - " +
                filePath.toAbsolutePath().getParent()); // E:/JavaProjekts/Chuck_Java
        System.out.println("filePath.toAbsolutePath().getRoot() - " +
                filePath.toAbsolutePath().getRoot()); // C:/
        System.out.println("--------------------------------------------------------------");

        // Метод объединяет два пути в один
        System.out.println("directoryPath.resolve(filePath) - " +
                directoryPath.resolve(filePath)); // C:/Users/un9331/Desktop/M/test15.txt
        System.out.println("--------------------------------------------------------------");

        Path anotherPath = Paths.get("C:\\Users\\un9331\\Desktop\\M\\N\\Z\\test20.txt");

        // Возвращает относительный путь относительно параметра(anotherPath)
        System.out.println("directoryPath.resolve(filePath) - " +
                directoryPath.relativize(anotherPath)); // N/Z/test20.txt
        System.out.println("--------------------------------------------------------------");

        if (!Files.exists(filePath)){ // если не существует файла
            Files.createFile(filePath); // создать файл
        }

        if (!Files.exists(directoryPath)){ // если не существует директории
            Files.createDirectory(directoryPath); // создать директорию
        }

        // Можно ли (есть ли парва) читать файл
        System.out.println("Files.isReadable(filePath) - " + Files.isReadable(filePath)); // true
        // Можно ли (есть ли парва) записывать в файл
        System.out.println("Files.isWritable(filePath) - " + Files.isWritable(filePath)); // true
        // Можно ли (есть ли парва) запускать файл
        System.out.println("Files.isExecutable(filePath) - " + Files.isExecutable(filePath)); // true
        System.out.println("--------------------------------------------------------------");

        Path filePath2 = Paths.get("E:\\JavaProjekts\\Chuck_Java\\test15.txt"); // обращается к файлу

        // Ссылаются ли пути на один и тот же файл
        System.out.println("Files.isSameFile(filePath, filePath2) - " + Files.isSameFile(filePath, filePath2)); // true
        System.out.println("--------------------------------------------------------------");

        // Возвращает размер файла
        System.out.println("Files.size(filePath) - " + Files.size(filePath)); // 44
        System.out.println("--------------------------------------------------------------");

        // Возвращает атрибут файла
        System.out.println("Files.getAttribute(filePath, \"creationTime\") - " + Files.getAttribute(filePath, "creationTime")); // 2021-03-05T13:31:37.6533203Z
        System.out.println("Files.getAttribute(filePath, \"size\") - " + Files.getAttribute(filePath, "size")); // 2021-03-05T13:31:37.6533203Z
        System.out.println("--------------------------------------------------------------");

        // Возвращает указанные атрибуты (* - все атрибуты)
        Map<String, Object> attributes = Files.readAttributes(filePath, "*");
        System.out.print("Files.readAttributes(filePath, \"*\") - " );
        for(Map.Entry<String, Object> entry : attributes.entrySet()){
            System.out.println(entry);
        }
        System.out.println("--------------------------------------------------------------");
    }
}
