import java.util.*;
public class sumele {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=sc.nextInt();
        System.out.println("Enter the elements of the array:");
        int arr[]=new int[size];
        int sum=0;
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        System.out.printf("Sum of elements is %d",sum);
    }
    
}
