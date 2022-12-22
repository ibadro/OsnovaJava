package Black_Belt.t_9_IO_and_NIO.NIO.InterfacePath_classFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Files_and_PathEx2 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test15.txt"); // обращается к файлу
        Path directoryPath = Paths.get("C:\\Users\\un9331\\Desktop\\M"); // обращается к директории
        Path directoryBPath = Paths.get("C:\\Users\\un9331\\Desktop\\B"); // обращается к директории

        // filePath файл скопируется в directoryPath в файл с таким же названием
        // можно было прописать (filePath, "C:\\Users\\un9331\\Desktop\\M\\test15.txt")
        // создает и копирует в файл, при повторном запуске выдаст исключение, т.к. такой файл уже создан
        Files.copy(filePath, directoryPath.resolve(filePath)); // создает и копирует в файл
        //Files.copy(filePath, Paths.get("C:\\Users\\un9331\\Desktop\\M\\test15-1.txt"));
        Files.copy(filePath, directoryPath.resolve("test15-2.txt"));
        System.out.println("Done!");

        Files.copy(filePath, directoryPath.resolve(filePath),
                StandardCopyOption.REPLACE_EXISTING); // заменяет информацию в файле

        Files.copy(directoryBPath, directoryPath.resolve("B")); // копируем папку В(пустую) в папку М

        Files.move(filePath,directoryPath.resolve("test15-3.txt")); // скопирует содержимое файла в указанный файл и
        // удалит исходный, при повторном запуске выдаст ошибку, т.к. исходный файл был уудален при первом запуске

        Files.move(Paths.get("test10.txt"), Paths.get("test11.txt")); // замена rename, скопирует содержимое файла в указанный файл и
        // удалит исходный, при повторном запуске выдаст ошибку, т.к. исходный файл был уудален при первом запуске
        Files.move(Paths.get("test11.txt"), Paths.get("test10.txt"));


        Files.delete(Paths.get("delete.txt")); // удалит указанный файл, при повторном запуске выдаст исключение
        // удалить директорию можно только если она не пуста

    }
}
