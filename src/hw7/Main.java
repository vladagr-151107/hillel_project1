package hw7;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        int[] arr = new int[]{20};
        for(int element:arr){
            int randomInt = (int) Math.random();
            Random random = new Random();
            int nextInt = random.nextInt(-100,100);
            System.out.println(nextInt);
        }
       // for(int rand = 0; rand == 20; rand++){
        //    Random random = new Random();
       //     int nextInt = random.nextInt(-1000000, 1000000);
         //   System.out.println(random);
        }
        //int randomInt = (int) Math.random();
        //Random random = new Random();
        //int nextInt = random.nextInt(-1000000, 1000000);
        //System.out.println(nextInt); element:arr
    }
