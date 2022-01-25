import java.util.*;
public class factor {
    public static void main(String args[])
    {
        int n;
        System.out.println("Enter the number:");
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();
        System.out.println("The factors of" +n+ "are:");
        for(int i=1;i<=n;i++)
        if(n%i==0)
        System.out.println(i+",");
    }
    
}
