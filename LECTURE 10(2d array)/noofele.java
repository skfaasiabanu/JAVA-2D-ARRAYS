import java.util.*;

public class search1 {
    public static void ele(int matrix[][],int key)
    {
        int count=0;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==key)
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    

    public static void main(String args[]) {
        int matrix[][] = {
            {10, 20, 30, 40},
            {15, 25, 33, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 33}
        };
        int key = 33; 
        ele(matrix, key);
    }
}
