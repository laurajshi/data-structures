/**
 * Created by laurashi on 10/4/17.
 */
public class SodaCanTester
{
    public static void main (String [] args)
    {
        SodaCan can= new SodaCan(5,10);
        System.out.println("Surface Area: " + can.getSurfaceArea());
        System.out.println( "Volume: " + can.getVolume());
    }
}
