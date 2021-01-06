/**
 * Created by laurashi on 10/4/17.
 */
public class SodaCan
{
    private double height;
    private double diameter;

    public SodaCan(double height, double diameter)
    {
        this.height= height;
        this.diameter= diameter;
    }
    public double getSurfaceArea()
    {
        double radius= diameter / 2.0;
        double surfaceArea= (2 * Math.PI * radius * height)+ (2 * Math.PI * (Math.pow(radius, 2))) ;
        return surfaceArea;
    }
    public double getVolume()
    {
        double radius= diameter / 2.0;
        double volume= Math.PI* (Math.pow(radius,2)) * (height);
        return volume;
    }
}


