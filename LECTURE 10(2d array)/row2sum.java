import java.util.*;

public class search1 {
    public static void sum1(int matrix[][])
    {
        int sum=0;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(i==1)
                {
                    sum=sum+matrix[i][j];
                }
            }
        }
        System.out.println(sum);
    }
    

    public static void main(String args[]) {
        int matrix[][] = {
            {10, 20, 30, 40},
            {15, 25, 33, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 33}
        };
        sum1(matrix);
    }
}
