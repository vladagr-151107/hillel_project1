package hw9;
import java.util.Random;
public class Main {

    public static void main(String[] args)
    {
        int [][] matrix = new int [4][4];
        Random random = new Random();
        for(int i = 0; i < 4; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                matrix[i][j] = random.nextInt(50)+1;
            }
        }
        for(int i = 0; i < 4; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        int sumEvenRows = 0;
        int sumOddRows = 0;
        for(int i = 0; i < 4; i++)
        {
            if(i%2 == 0)
            {
                for(int j = 0; j < 4; j++)
                {
                    sumEvenRows = sumEvenRows + matrix[i][j];
                }
            }
            else
            {
                for(int j = 0; j < 4; j++)
                {
                    sumOddRows = sumOddRows + matrix[i][j];
                }
            }
        }
        long productEvenColumns = 1;
        long productOddColumns = 1;
        for(int i = 0; i < 4; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                if(j%2 == 0)
                {productEvenColumns = productEvenColumns * matrix[i][j];
                }
                else
                {productOddColumns = productOddColumns * matrix[i][j];
                }
            }
        }
        System.out.println("The sum of all elements in even rows(row 0,2) : "+ sumEvenRows);
        System.out.println("The sum of all elements in odd rows(row 1,3) : "+ sumOddRows);
        System.out.println("The product of all elements in even columns(column 0,2) : "+ productEvenColumns);
        System.out.println("The product of all elements in odd columns(column 1,3) : "+ productOddColumns);
        int sum = 0, counter = 1;
        for(int j = 0; j < 4; j++)
        {sum = sum + matrix[0][j];
        }
        for(int i = 1; i < 4; i++)
        {
            int rowSum = 0;
            for(int j = 0; j < 4; j++)
            {rowSum = rowSum + matrix[i][j];
            }
            if(rowSum == sum)
            {counter++;
            }
            else
            {continue;
            }
        }
        for(int j = 0; j < 4; j++)
        {
            int colSum = 0;
            for(int i = 0; i < 4; i++)
            {colSum = colSum + matrix[i][j];
            }
            if(colSum != sum)
            {counter++;
            }
            else
            {continue;
            }
        }
        int diagonalSum1 = 0;
        int diagonalSum2 = 0;
        for(int i = 0; i < 4; i++)
        {
            diagonalSum1 = diagonalSum1 + matrix[i][i];
            diagonalSum2 = diagonalSum2 + matrix[i][3 - i];
        }
        if(diagonalSum1 == sum || diagonalSum2 == sum)
        {
            counter = counter + 2;
        }

        if(counter == 10)
        {
            System.out.println("The matrix is a magic square");
        }
        else
        {
            System.out.println("The matrix is not a magic square");
        }
    }
}