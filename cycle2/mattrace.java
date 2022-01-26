import java.util.*;
public class mattrace {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m,sum=0;
        System.out.println("Enter the size of the matrix:");
        m=sc.nextInt();
        int a[][]=new int[m][m];
        System.out.println("Enter the elements of the matrix:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                if((i+j)%m==0)
                {
                    sum+=a[i][j];
                }
            }
        }
        System.out.println("The trace is:"+sum);
    }
    
}
