import java.util.*;
public class palindrome {
    public static void main(String args[])
    {
        int sum=0,a,b,temp;
        System.out.println("Enter a number:");
        Scanner obj=new Scanner(System.in);
        b=obj.nextInt();
        temp=b;
        while(b>0)
        {
            a=b%10;
            sum=(sum*10)+a;
            b=b%10;
        }
        if(temp==sum)
            System.out.println(temp+ "is palindrome");
        else
            System.out.println(temp+ "is not palindrome");
    }

}
