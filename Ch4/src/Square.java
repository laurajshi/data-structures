/**
 * Created by laurashi on 10/4/17.
 */
public class Square
{
    private double length1;
    private double length2;

    public Square(double l1, double l2)
    {
        this.length1 = l1;
        this.length2 = l2;
    }

    public double getArea()
    {
        return (length1 * length2);
    }

    public double getPerimeter()
    {
        return (2 * length1 + 2 * length2);
    }

    public double getDiagonal()
    {
        return (Math.sqrt((Math.pow(length1, 2) + Math.pow(length2, 2))));
    }
// test program
    public static void main(String[] args)
    {
        Square square = new Square (3,4);
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());
        System.out.println("Diagonal: " + square.getDiagonal());
    }
}

