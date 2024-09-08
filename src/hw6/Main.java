package hw6;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 6; i++) {
            sum += i;
            System.out.printf("%d) Number is %d, sum is %d %n", i, i, sum);
        } System.out.printf("Sum of numbers %d.", sum);
    }
}
