import java.util.*;
public class student {
    void read()
    {
        Scanner sc=new Scanner(System.in);
        student s=new student();
        int rno;
        String name;
        int marks[]=new int[5];
        System.out.println("Enter the name:");
        name=sc.nextLine();
        System.out.println("Enter rno:");
        rno=sc.nextInt();
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter marks of 5 subjects:"+(i+1));
            marks[i]=sc.nextInt();
        }
        s.display(name,rno,marks);
    }
    void display(String name,int rno,int marks[])
    {
        System.out.println("Name is:"+name);
        System.out.println("Roll no is:"+rno);
        for(int i=0;i<5;i++)
        {
            System.out.println("Marks of subjects:"+(i+1)+" is "+marks[i]);
        }
    }
    public static void main(String args[])
    {
        student s1=new student();
        s1.read();
    }
    
}
