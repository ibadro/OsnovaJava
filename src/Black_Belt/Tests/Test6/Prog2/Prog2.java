package Black_Belt.Tests.Test6.Prog2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Prog2 {
    public static void main(String[] args) {

        try(ObjectInputStream inputStream = new ObjectInputStream(
                new FileInputStream("photo.bin"));
            FileOutputStream outputStream= new FileOutputStream("java_copy2.jpg")
            ){

            /** Как получить обратно файл java.jpg из photo.bin ??? */
            inputStream.readObject();

            FileOutputStream input = (FileOutputStream) inputStream.readObject();

            int i;
            while ((i = inputStream.read()) != -1){
                outputStream.write(i);
            }

            System.out.println("Done!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
