import java.util.*;
public class transmatrix {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m,n;
        System.out.println("Enter the number of rows in matrix:");
        m=sc.nextInt();
        System.out.println("Enter the number of columns in matrix:");
        n=sc.nextInt();
        int a[][]=new int[m][n];
        System.out.println("Enter the number of elements:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        int c[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                c[i][j]=a[j][i];      
            }
        }
        System.out.println("The transposed matrix is:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.printf("%d",c[i][j]);
            }
        }
        System.out.println();
    }
    
}
