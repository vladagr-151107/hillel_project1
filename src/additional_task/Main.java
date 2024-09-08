package additional_task;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int reversed = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter a number");
        int number = scanner.nextInt();
        while(number !=0){
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        System.out.println(reversed);
    }
}
