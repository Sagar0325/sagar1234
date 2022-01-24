import java.util.*;

import java.util.*;
public class prime {
    public static void main(String args[])
    {
        int num,flag=0;
        System.out.println("Enter the number:");
        Scanner a=new Scanner(System.in);
        num=a.nextInt();
        for(int i=2;i<=num/2;i++)
        if(num%2==0)
          {
              flag=1;
              break;
          }
        if(flag==0)
        {
            System.out.println(num+ "is a prime number");
        }  
        else
        {
            System.out.println(num+ "is not a prime number");
        }     
    }

}
