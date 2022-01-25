import java.util.Scanner;
public class largest {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter the size of the array:");
        int size1=sc.nextInt();
        int size2=sc.nextInt();
        System.out.println("Enter the elements of the array:");
        int arr[][]=new int[size1][size2];
        for(int i=0;i<size1;i++)
        {
            for(int j=0;j<size2;j++)
            arr[i][j]=sc.nextInt();
        }
        int large=0;
        for(int i=0;i<size1;i++)
        {
            for(int j=0;j<size2;j++)
            {
                if(arr[i][j]>large)
                large=arr[i][j];
            }
        }
        System.out.printf("The largest element is %d",large);        
    }
    
}
