import java.util.*;
public class o1basic
{ 
    public static void search(int matrix[][],int key)
    {
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                
                if(matrix[i][j]==key)
                {
                    System.out.println("element is found at "+"("+i+j+")");
                }
            }

        }
        System.out.println("element not found");

    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int matrix[][]=new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                matrix[i][j]=sc.nextInt();
            }

        }
        //output
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }
        search(matrix,5);

    }
}