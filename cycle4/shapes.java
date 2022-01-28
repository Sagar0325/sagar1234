abstract class shape
{
    void numberofsides(){};
    
}
class rectangle extends shape
{
    void numberofsides()
    {
        System.out.println("Rectangle contains 4 sides.");
    }
}
class triangle extends shape
{
    void numberofsides()
    {
        System.out.println("Triangle contains 3 sides.");
    }
}
class hexagon extends shape
{
    void numberofsides()
    {
        System.out.println("Hexagon contains 6 sides.");
    }
}
public class shapes
{
    public static void main(String args[])
    {
        rectangle r=new rectangle();
        triangle t=new triangle();
        hexagon h=new hexagon();
        r.numberofsides();
        t.numberofsides();
        h.numberofsides();
    }
}
