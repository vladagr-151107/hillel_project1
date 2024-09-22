package hw10;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Enter the number.");
        int number = scanner.nextInt();
        numberSquared(number);

        System.out.println("2. Enter the radius.");
        int radius = scanner.nextInt();
        System.out.println("Enter the height.");
        int height = scanner.nextInt();
        radiusHeight(radius, height);

        System.out.println("3. Enter 5 numbers for array.");
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }
        sumInArray(numbers);

        System.out.println("4. Enter one word.");
        String word = scanner.next();
        reversed(word);

        System.out.println("5. Write two numbers.");
        int numOne = scanner.nextInt();
        int numTwo = scanner.nextInt();
        exponantiation(numOne, numTwo);

        scanner.nextLine();
        System.out.println("Write everything you want.");
        String text = scanner.nextLine();
        System.out.println("Write the amount of times you want to repeat this phrase.");
        int n = scanner.nextInt();
        repeatText(text, n);
    }
    public static void numberSquared(int number){
        System.out.printf("Number squared is " + Math.pow(number, 2));
    }
    public static void radiusHeight(int radius, int height){
        System.out.println("The volume of cylinder is " + (Math.PI * radius * height));
    }
    public  static void sumInArray(int[] numbers){
        System.out.println(Arrays.toString(numbers));
        int sum = Arrays.stream(numbers).sum();
        System.out.println("Sum of 5 numbers in array: " + sum);
    }
    public static void reversed(String word) {
        StringBuilder str = new StringBuilder(word);
        str.reverse();
        System.out.println(str);
    }
    public static void exponantiation(int numOne, int numTwo){
        double result = Math.pow(numOne, numTwo);
        System.out.printf("%d ^ %d = %f \n", numOne, numTwo, result);
    }
    public static void repeatText(String text, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(text);
        }
    }
}