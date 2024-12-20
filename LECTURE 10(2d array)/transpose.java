import java.util.*;

public class transpose {
    public static void reverse(int matrix[][])
    {
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                
                System.out.print(matrix[j][i]);
            }
            System.out.println();
        }
        
    }
    

    public static void main(String args[]) {
        int matrix[][] = {
            {10, 20, 30, 40},
            {15, 25, 33, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 33}
        };
        reverse(matrix);
    }
}
