import java.util.*;
public class seclar {
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
        int t;
        t=a[0];
        for(i=0;i<size-1;i++)
        {
            if(a[i]>a[i+1])
            {
                t=a[i];
                a[i]=a[i+1];
                a[i+1]=t;
            }
        }
        System.out.println("The size of the second largest element is"+a[size-2]);
    }
    
}
