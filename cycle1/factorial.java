import java.util.*;
public class factorial {
    public static void main(String args[])
    {
        int n,f=1,i;
        System.out.println("Enter a number:");
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();
        for(i=1;i<=n;i++)
        {
            f=f*i;
        }
        System.out.println("Factorial="+f);
    }
    
}
