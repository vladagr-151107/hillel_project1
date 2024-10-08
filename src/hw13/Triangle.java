package hw13;

public class Triangle extends Shape {
    private double base;   // Основа треугольника
    private double height; // Высота треугольника

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Реализация метода area() для треугольника
    @Override
    public double area() {
        return 0.5 * base * height;
    }
}