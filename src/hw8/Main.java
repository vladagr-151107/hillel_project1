package hw8;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int[] numbers = new int[15];
        Random random = new Random();
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = random.nextInt(1, 100);
        }
        System.out.print("Initial Random Array Elements : ");
        for(int i = 0; i < numbers.length; i++)
        {
            System.out.print(numbers[i] + " ");
        }
        int n = numbers.length;
        for(int i = 0; i <n -1; i++){
            for(int j = 0; j < n - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        System.out.print(System.lineSeparator() + "Result of random array elements:" + Arrays.toString(numbers));
        Scanner scanner = new Scanner(System.in);
        System.out.println(System.lineSeparator() + "Enter a number");
        int userNumber = scanner.nextInt();
        int left = 0;
        int right = numbers.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (numbers[mid] == userNumber) {
                System.out.print(System.lineSeparator() + "This is index of your number: " + mid); // Повертаємо індекс, якщо знайдено
            } else if (numbers[mid] < userNumber) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.print("Your number doesn't exist in this array.");
    }
}