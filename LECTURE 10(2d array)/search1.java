import java.util.*;

public class search1 {
    public static boolean sea(int matrix[][], int key) {
        int n = matrix.length;
        int m = matrix[0].length;
        int row = 0;
        int col = m-1;

        while (row<n && col>=0) {
            if (matrix[row][col] == key) {
                System.out.println("Element found at (" + row + ", " + col + ")");
                return true;
            } else if (key < matrix[row][col]) {
                col--; // Move up
            } else {
                row++; // Move right
            }
        }
        System.out.println("Element not found");
        return false;
    }

    public static void main(String args[]) {
        int matrix[][] = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        };
        int key = 33; 
        sea(matrix, key);
    }
}
