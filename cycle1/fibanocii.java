import java.util.*;
public class fibanocii {
    public static void main(String args[])
    {
        int n1=0,n2=1,n3,i,count;
        System.out.println("Enter the number:");
        Scanner obj=new Scanner(System.in);
        count=obj.nextInt();
        System.out.println("Fibanocii series is"+n1+""+n2);
        for(i=2;i<count;i++)
        {
            n3=n1+n2;
            System.out.println(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
    
}
