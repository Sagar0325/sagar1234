import java.util.*;
public class mensuration {
    public static void main(String  args[])
    {
        Scanner sc=new Scanner(System.in);
        mensuration m=new mensuration();
        int l,b,s;
        float h;
        System.out.println("Enter the length:");
        l=sc.nextInt();
        System.out.println("Enter the breadth:");
        b=sc.nextInt();
        System.out.println("Enter the base:");
        s=sc.nextInt();
        System.out.println("Enter the height:");
        h=sc.nextFloat();
        m.area(l,b);
        m.area(s,h);
    }
    void area(int l,int b)
    {
        int ar=l*b;
        System.out.println("Area of rectangle is:"+ar);
    }
    void area(int s,float h)
    {
        float ar;
        ar=(float)(0.5*s*h);
        System.out.println("Area of triangle is:"+ar);
    }
    
}
