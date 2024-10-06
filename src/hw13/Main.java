package hw13;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the circle.");
        int r = scanner.nextInt();
        System.out.println("Enter the base and height of the triangle.");
        int a = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println("Enter the side of the square.");
        int b = scanner.nextInt();
        Shape[] shapes = new Shape[]{
                new Circle(r),
                new Triangle(a, c),
                new Square(b)
        };
        double totalArea = calculateTotalArea(shapes);
        System.out.println("The total sum of all the figures is: " + totalArea);
    }
    public static double calculateTotalArea(Shape[] shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.area();
        }
        return totalArea;
    }
}
