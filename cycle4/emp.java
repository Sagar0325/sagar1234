import java.util.*;
public class emp {
    String name,addr,phone;
    int age,salary;
    static officer o=new officer();
    static manager m=new manager();
    void print_salary(int salary)
    {
        System.out.println(salary);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the details of officer:");
        o.input();
        System.out.printf("Enter the specialization:");
        o.specialization=scan.next();
        System.out.println("Enter the details of the manager:");
        m.input();
        System.out.println("Enter the department:");
        m.dept=scan.next();
        o.details();
        System.out.println("Slary of officer:");
        o.print_salary(o.salary);
        m.details();
        System.out.println("Salary of manager:");
        m.print_salary(m.salary);
    }

    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter the name:");
        name=sc.nextLine();
        System.out.printf("Enter the address:");
        addr=sc.nextLine();
        System.out.printf("Enter the phone number:");
        phone=sc.next();
        System.out.printf("Enter the age:");
        age=sc.nextInt();
        System.out.println("Enter the salary:");
        salary=sc.nextInt();
    }

    void details()
    {
        System.out.println(name+" "+addr+" "+phone+" "+age);
    }
      
}
class officer extends employee{
    public string specialization;
}
class manager extends employee
{
    public String dept;
}
