/**
 * Created by laurashi on 10/4/17.
 */
public class IceCreamCone
{
    private double height;
    private double radius;

    public IceCreamCone(double height, double radius)
    {
        this.height= height;
        this.radius= radius;
    }
    public double getSurfaceArea()
    {
        double area= (Math.PI*radius*(radius+Math.sqrt((Math.pow(height,2))+ Math.pow(radius,2))))-(Math.PI*(Math.pow(radius,2)));
        return area;
    }
    public double getVolume()
    {
        double volume= Math.PI*(Math.pow(radius,2))*(height/3);
        return volume;
    }
    public static void main (String [] args)
    {
        IceCreamCone a= new IceCreamCone(5.00, 4.00);
        System.out.println(a.getVolume());
    }
}

