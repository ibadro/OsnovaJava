package Black_Belt.t_9_IO_and_NIO.IO.Serialization.Proger1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializationEx1 {
    public static void main(String[] args) {
        List<String> employeesNames = new ArrayList<>();
        employeesNames.add("Andrey");
        employeesNames.add("Ivan");
        employeesNames.add("Elena");
        try(ObjectOutputStream outputStream = new ObjectOutputStream(
                new FileOutputStream("employees1.bin"))){
            outputStream.writeObject(employeesNames);
            System.out.println("Done!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
