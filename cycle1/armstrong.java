import java.util.*;
public class armstrong {
    public static void main(String args[])
    {
        int a,b,s=0,d;
        System.out.println("Enter the number:");
        Scanner obj=new Scanner(System.in);
        a=obj.nextInt();
        d=a;
        while(a>0)
        {
            b=a%10;
            s=s+(b*b*b);
            a=a/10;
        }
        if(d==s)
         System.out.println(d+ "is an armstrong number");
        else
         System.out.println(d+ "is not an armstrong number");
    }
    
}
