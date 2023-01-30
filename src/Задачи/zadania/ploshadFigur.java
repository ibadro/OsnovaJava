package Задачи.zadania;

import static java.lang.Math.PI;

/**
 * Задача. На входе есть N геометрических фигур (например, круг, квадрат). Приложение должно считать
 * суммарную площадь всех фигур и печатать её на экране. Спроектировать в парадигме ООП.
 * Написать тесты.
 * <p>
 * Площадь круга - 3.14*R^2
 * Площадь квадрата - A^2
 * Площадь прямоугольника -A*B
 */
public class ploshadFigur {

    public static void main(String[] args) {
        Circle circle = new Circle(10);
        Rect rect = new Rect(10, 29);
        Square square = new Square(5);
        System.out.println("Площадь всех фигур:" + circle.area() + rect.area() + square.area());
    }

}

class Shape {//форма

    public double area() {
        //площадь
        return 0;
    }

    public double girth() {
        // периметр
        return 0;
    }
}

class Circle extends Shape {//Круг
    private double radius;//радиус

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return PI * radius * radius;
    }

    public double girth() {
        if (radius < 0) {
            return -1.0;
        }
        return 2 * PI * radius;
    }
}

class Rect extends Shape {//прямоугольник
    private double length;//длинна
    private double width;//ширина

    public Rect(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }

    public double girth() {
        return 2 * (length + width);
    }
}

class Square extends Shape {//квадрат
    private double length;

    public Square(double length) {
        this.length = length;
    }

    public double area() {
        return length * length;
    }

    public double girth() {
        return 4 * length;
    }
}


