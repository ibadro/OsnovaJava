package Black_Belt.t_9_IO_and_NIO.IO.FileInputStream_FileOutputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) {
        /** В блоке try создали 2 объекта обертки */
        try(FileInputStream inputStream =
                    new FileInputStream("E:\\JavaProjekts\\Chuck_Java" +
                            "\\src\\t_9_IO_and_NIO\\FileInputStream_FileOutputStream\\java.jpg");
            FileOutputStream outputStream= new FileOutputStream("java_copy.jpg")
        ){
            int i;
            while ((i = inputStream.read()) != -1){
                outputStream.write(i);
            }
            System.out.println("Done!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
