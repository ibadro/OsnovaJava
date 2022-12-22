package Black_Belt.t_9_IO_and_NIO.IO.Serialization.Proger2;



import Black_Belt.t_9_IO_and_NIO.IO.Serialization.Proger1.Employee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializationEx2 {
    public static void main(String[] args) {
        Employee employee;

        try(ObjectInputStream inputStream = new ObjectInputStream(
                new FileInputStream("employees2.bin"))){

            employee = (Employee) inputStream.readObject();
            System.out.println(employee);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
