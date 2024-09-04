package hw5;

import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        double income;
        double incomeWithTaxes;
        double result;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your primary income");
        income = scanner.nextDouble();

        if (income <= 10000) {
            result = income * 0.025;
            incomeWithTaxes = income - result;
            System.out.printf("Your gross income is %s. The tax is %s", incomeWithTaxes, result);
        } else if (income > 10000 && income <= 25000){
            result = income * 0.043;
            incomeWithTaxes = income - result;
            System.out.printf("Your gross income is %s. The tax is %s", incomeWithTaxes, result);
        } else{
            result = income * 0.067;
            incomeWithTaxes = income - result;
            System.out.printf("Your gross income is %s. The tax is %s", incomeWithTaxes, result);
        }
    }
}
