package hw7;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        int[] numbers = new int[20];
        Random random = new Random();
        for(int i = 0; i < numbers.length; i++)
        {numbers[i] = random.nextInt(201) - 100;
        }
        System.out.print("Random Array Elements : ");
        for(int i = 0; i < numbers.length; i++)
        {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        int sumOfNegatives = 0;
        for(int i = 0; i < numbers.length; i++)
        {
            if(numbers[i]<0)
            {
                sumOfNegatives += numbers[i];
            }
        }
        System.out.println("Sum of the negative numbers : "+ sumOfNegatives);
        int countEven = 0, countOdd = 0;
        for(int i = 0; i < numbers.length; i++)
        {
            if(numbers[i]%2 == 0)
            {
                countEven++;
            }
            else
            {
                countOdd++;
            }
        }
        System.out.println("The number of even numbers : " + countEven);
        System.out.println("The number of odd numbers : " + countOdd);
        int largest = numbers[0];
        int smallest = numbers[0];
        int largestIndex = 0;
        int smallestIndex = 0;

        for(int i = 1; i < numbers.length; i++)
        {
            if(numbers[i] > largest)
            {
                largest = numbers[i];
                largestIndex = i;
            }
            if(numbers[i] < smallest)
            {
                smallest = numbers[i];
                smallestIndex = i;
            }
        }
        System.out.println("The largest element : "+ largest+" index : "+ largestIndex);
        System.out.println("The smallest element : "+ smallest + " index : "+ smallestIndex);
        int sumAfterFirstNegative = 0;
        int count = 0;
        for(int i = 0; i < numbers.length; i++)
        {
            if(numbers[i] < 0)
            {
                while(i < numbers.length)
                {
                    sumAfterFirstNegative += numbers[i];
                    count++;
                    i++;
                }
                break;

            }
        }
        double average = (double) sumAfterFirstNegative / count;
        if(count>0)
        {System.out.println("The mean of the numbers after the first negative number : "+ average);
        }
        else {System.out.println("There is no negative number");
        }
        }
    }
