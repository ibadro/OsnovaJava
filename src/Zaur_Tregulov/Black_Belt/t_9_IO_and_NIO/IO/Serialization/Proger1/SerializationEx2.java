package Zaur_Tregulov.Black_Belt.t_9_IO_and_NIO.IO.Serialization.Proger1;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEx2 {
    public static void main(String[] args) {
        Car car = new Car("Mersedes", "Black");
        Employee employee1 = new Employee("Marina", "IT",
                28, 500, car);

        try(ObjectOutputStream outputStream = new ObjectOutputStream(
                new FileOutputStream("employees2.bin"))){

            outputStream.writeObject(employee1);
            System.out.println("Done!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
