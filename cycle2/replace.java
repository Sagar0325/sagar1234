import java.util.*;
public class replace {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=sc.nextInt();
        System.out.println("Enter the elements of the array:");
        int a[]=new int[size];
        int i;
        for(i=0;i<size;i++)
        a[i]=sc.nextInt();
        System.out.println("Enter the element to be searched:");
        int l=sc.nextInt();
        for(i=0;i<size;i++)
        {
            if(a[i]==l)
            {
                System.out.println("Search successful!!");
                System.out.println("Enter the replacing number:");
                int x=sc.nextInt();
                a[i]=x;
            }
        }
        System.out.println("The replaced array is:");
        for(i=0;i<size;i++)
        {
            System.out.println(a[i]);
        }
    }
    
}
