import java.util.*;
public class multiplymatrix {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m,n,p,q;
        System.out.println("Enter the number of rows in matrix1:");
        m=sc.nextInt();
        System.out.println("Enter the number of columns in matrix1:");
        n=sc.nextInt();
        System.out.println("Enter the number of rows in matrix2:");
        p=sc.nextInt();
        System.out.println("Enter the number of columns in matrix2:");
        q=sc.nextInt();
        if(n==p)
        {
            int a[][]=new int[m][n];
            int b[][]=new int[p][q];
            System.out.println("Enter matrix1:");
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    a[i][j]=sc.nextInt();
                }
            }
            System.out.println("Enter matrix2:");
            for(int i=0;i<p;i++)
            {
                for(int j=0;j<q;j++)
                {
                    b[i][j]=sc.nextInt();
                }
            }
            int pt[][]=new int[m][q];
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<q;j++)
                {
                    pt[i][j]=0;
                    for(int k=0;k<q;k++)
                    {
                        pt[i][j]+=a[i][k]*b[k][j];
                    }
                }
            }
            System.out.println("The product matrix:");
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<q;j++)
                {
                    System.out.println(pt[i][j]+" ");
                }
                System.out.println();
            }
        }
        else
        {
            System.out.println("Multiplication not possible!!");
        }
    }    
}
