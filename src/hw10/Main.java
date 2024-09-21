package hw10;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        numberSquared();
        radiusHeight();
        sumInArray();
        reversed();
        exponantiation();
        repeatText();
    }
    public static void numberSquared(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Enter the number.");
        int number = scanner.nextInt();
        System.out.printf("Number squared is " + Math.pow(number, 2));
    }
    public static void radiusHeight(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("2. Enter the radius.");
        int radius = scanner.nextInt();
        System.out.println("Enter the height.");
        int height = scanner.nextInt();
        System.out.println("The volume of cylinder is " + (Math.PI * radius * height));
    }
    public  static void sumInArray(){
        int sum;
        Scanner scanner = new Scanner(System.in);
        System.out.println("3. Enter 5 numbers for array.");
        int one = scanner.nextInt();
        int two = scanner.nextInt();
        int three = scanner.nextInt();
        int four = scanner.nextInt();
        int five = scanner.nextInt();
        int[] numbers = {one, two, three, four, five};
        System.out.println(Arrays.toString(numbers));
        sum = Arrays.stream(numbers).sum();
        System.out.println("Sum of 5 numbers in array: " + sum);
    }
    public static void reversed(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("4. Enter one word.");
        StringBuilder str = new StringBuilder(scanner.next());
        str.reverse();
        System.out.println(str);
    }
    public static void exponantiation(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("5. Write two numbers.");
        int numOne = scanner.nextInt();
        int numTwo = scanner.nextInt();
        double result = Math.pow(numOne, numTwo);
        System.out.printf("%d ^ %d = %f \n", numOne, numTwo, result);
    }
    public static void repeatText() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write everything you want.");
        String text = scanner.nextLine();
        System.out.println("Write the amount of times you want to repeat this phrase.");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(text);
        }
    }
}
