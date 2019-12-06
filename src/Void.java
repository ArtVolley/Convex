import java.awt.*;
import java.awt.Graphics;
// Класс "нульугольник", реализующий интерфейс фигуры.
class Void implements Figure {
    public double upperimeter() {
        return 0.0;
    } // периметр верхней полуплоскости
    public double perimeter() {
        return 0.0;
    }
    public double area() {
        return 0.0;
    }
    public Figure add(R2Point p) {
        return new Point(p);
    }
    public void draw(Graphics g) // пустой метод, т. к. ничего рисоваться не должно
    {

    }
}