package Zaur_Tregulov.Black_Belt.Tests.Test9;

import java.util.Objects;

public class CPU {
    public CPU(String name, double clockSpeed, double price) {
        this.name = name;
        this.clockSpeed = clockSpeed;
        this.price = price;
    }

    private String name;
    private double clockSpeed;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getClockSpeed() {
        return clockSpeed;
    }

    public void setClockSpeed(double clockSpeed) {
        this.clockSpeed = clockSpeed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CPU cpu = (CPU) o;
        return Double.compare(cpu.clockSpeed, clockSpeed) == 0 && Double.compare(cpu.price, price) == 0 && Objects.equals(name, cpu.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, clockSpeed, price);
    }

    @Override
    public String toString() {
        return "CPU{" +
                "Модель = " + name + '\'' +
                ", Тактовая частота = " + clockSpeed +
                "ГГц "+ price + " руб.}";
    }
}
