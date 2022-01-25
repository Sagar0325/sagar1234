import java.util.Scanner;
public class addmatrix {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter the size of the first array:");
        int size1=sc.nextInt();
        int size2=sc.nextInt();
        System.out.printf("Enter the elements of the first array");
        int arr1[][]=new int[size1][size2];
        for(int i=0;i<size1;i++)
        {
            for(int j=0;j<size2;j++)
            arr1[i][j]=sc.nextInt();
        }
        int size3=size1,size4=size2;
        System.out.printf("Enter the size of the second array:");
        size1=sc.nextInt();
        size2=sc.nextInt();
        int arr3[][]=new int[size1][size2];
        if(size1*size2!=size3*size4)
        {
            System.out.printf("Addition not possible!!");
        }
        System.out.printf("Enter the elements of the array:");
        int arr2[][]=new int[size1][size2];
        for(int i=0;i<size1;i++)
        {
            for(int j=0;j<size2;j++)
            arr2[i][j]=sc.nextInt();
        }
        for(int i=0;i<size3;i++)
            for(int j=0;j<size4;j++)
              arr3[i][j]=arr1[i][j]+arr2[i][j];

                 System.out.printf("The sum of matrix is:");
                 for(int i=0;i<size3;i++)
               {
                     for(int j=0;j<size4;j++)
                 System.out.printf("%d",arr3[i][j]);
               }
                 System.out.printf("%d");
   }
    
}
