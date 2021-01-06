/**
 * Created by laurashi on 10/4/17.
 */
public class ConverterTester
{
    public static void main (String [] args)
    {
        final double MILE_TO_KM= 1.609; //initialize final variable for conversion factor
        Converter milesToMeters= new Converter(1000 * MILE_TO_KM);
        System.out.println("Distance in meters: " + milesToMeters.convertTo(1.00));
    }
}
