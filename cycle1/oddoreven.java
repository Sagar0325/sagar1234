import java.util.*;
public class oddoreven {
    public static void main(String args[])
    {
        int a;
        System.out.println("Enter the number:");
        Scanner obj=new Scanner(System.in);
        a=obj.nextInt();
        if(a%2==0)
           System.out.println(a+ "is an even number");
        else
           System.out.println(a+ "is an odd number");
    }
    
}
