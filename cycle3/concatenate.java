import java.util.*;
public class concatenate {
    void conc(String str1,String str2)
    {
        String str3=str1.concat(str2);
        System.out.println("Concatenated String is:"+str3);
    }   
    void conc(int a,int b)
    {
        System.out.println("Concatenated number is:"+a+b);
    } 
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int ch,m,n;
        do{
            System.out.println("\n1.String\n2.Number\n3.Exit");
            System.out.print("Enter your choice:");
            ch=sc.nextInt();
            concatenate c=new concatenate();
            switch(ch)
            {
                case 1: System.out.println("Enter first srting:");
                        String str1=sc.next();
                        System.out.println("Enter the second string:");
                        String str2=sc.next();
                        c.conc(str1,str2);
                        break;
                case 2: System.out.println("Enter the first number:");
                        m=sc.nextInt();
                        System.out.println("Enter the second number:");
                        n=sc.nextInt();
                        c.conc(m,n);
                        break;
                case 3: break;

              default:System.out.println("Wrong choice!!");
                      break;
            }
        }
        while(ch!=3);
    }
}
