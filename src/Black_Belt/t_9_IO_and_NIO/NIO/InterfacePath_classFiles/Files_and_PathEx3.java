package Black_Belt.t_9_IO_and_NIO.NIO.InterfacePath_classFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Files_and_PathEx3 {
    public static void main(String[] args) throws IOException {
        Path filePaths = Paths.get("testing.txt");
//        // создаем файл из Path
//        Files.createFile(filePaths);
//        String dialog = "-Привет\n-Как дела?\n-Хорошо\n-А у тебя как?\n-Спасибо, тоже ничего";
//        // записываем в filePaths из dialog переведенного в массив байтов
//        Files.write(filePaths, dialog.getBytes());


        // readAllLines() возвращает лист стрингов из всех строк
        List<String> list = Files.readAllLines(filePaths);
        for(String s : list){
            System.out.println(s);
        }
    }
}
