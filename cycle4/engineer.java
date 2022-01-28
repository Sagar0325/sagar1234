class employee
{
    void display()
    {
        System.out.println("Name of class is Employee");
    }

    void calcsalary()
    {
        System.out.println("Salary of employee is 10000");
    }
}

class engineer extends employee
{
    void calcsalary()
    {
        super.calcsalary();
        System.out.println("Salary of engineer is 20000");
    }

    public static void main(String args[])
    {
        engineer e=new engineer();
        e.display();
        e.calcsalary();
    }
}