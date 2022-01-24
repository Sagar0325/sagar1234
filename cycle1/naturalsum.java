import java.util.*;
public class naturalsum {
    public static void main(String args[])
    {
        int i,n,sum=0;
        System.out.println("Enter the number:");
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();
        for(i=1;i<=n;i++)
        sum=sum+i;
        System.out.println("Sum of natural numbers is"+sum);
    }
}
