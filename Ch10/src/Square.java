import java.awt.*;

/**
 * Created by 18shil on 2/12/2018.
 */
public class Square extends Rectangle
{
    private int xPos;
    private int yPos;
    private int sideLength;

    /**
     *
     * @param xPos x position at center of square
     * @param yPos y position at center of square
     * @param sideLength of square
     */
    public Square (int xPos, int yPos, int sideLength)
    {
        this.xPos = xPos;
        this.yPos= yPos;
        this.sideLength= sideLength;
    }

    /**
     * set Location using method inherited from the Rectangle class
     * center coordinates must be converted to corner coordinates.
     */
    public void setLocation()
    {
        int cornerPosx= xPos - (sideLength/2);
        int cornerPosy= yPos - (sideLength/2);
        super.setLocation(cornerPosx,cornerPosy);
    }

    public void setSize()
    {
        super.setSize(sideLength,sideLength);
    }

    public double getArea()
    {
        return sideLength * sideLength;
    }

    public String toString ()
    {
        super.toString();
        return "Square Area: " + getArea();
    }

    /*
    tester class for square class
     */
    public static void main (String [] args)
    {
        Square mySquare = new Square (2,2, 4);
        mySquare.setLocation();
        mySquare.setSize();
        System.out.println(mySquare.getArea());
        System.out.println(mySquare.toString());
    }
}
