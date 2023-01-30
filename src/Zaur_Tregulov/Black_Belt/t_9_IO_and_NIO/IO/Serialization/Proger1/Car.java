package Zaur_Tregulov.Black_Belt.t_9_IO_and_NIO.IO.Serialization.Proger1;

import java.io.Serializable;

/** Чтобы объект превратить в бинарный файл, надо имплиментировать в нем Serializable */
public class Car implements Serializable {
    String model;
    String color;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
