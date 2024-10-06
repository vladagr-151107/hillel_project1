package hw13;

public class Square extends Shape {
    private double side;   // Сторона квадрата

    public Square(double side) {
        this.side = side;
    }

    // Реализация метода area() для квадрата
    @Override
    public double area() {
        return side * side;
    }
}