import java.util.*;
public class smallele {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=sc.nextInt();
        System.out.println("Enter the elements of the array:");
        int a[]=new int[size];
        for(int j=0;j<size;j++)
        {
            a[j]=sc.nextInt();
        }
        int i=0,small=0;
        small=a[i];
        while(i<size-1)
        {
            if(small>a[i+1])
            {
                small=a[i+1];
            }
            ++i;
        }
        System.out.println("The smallest element is"+small);
    }    
}
