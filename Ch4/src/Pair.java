/**
 * Created by laurashi on 10/4/17.
 */
public class Pair
{
    private double aFirst; //@param aFirst the first value of the pair
    private double aSecond;  //@param aSecond the second value of the pair
    public Pair (double a, double b)
    {
        this.aFirst= a;
        this.aSecond= b;
    }
    public double getSum()
    {
        return aFirst+ aSecond;
    }
    public double getDifference()
    {
        return aFirst-aSecond;
    }
    public double getProduct()
    {
        return aFirst*aSecond;
    }
    public double getAverage()
    {
        return ((aFirst+aSecond)/2.0);
    }
    public double getDistance()
    {
        return Math.abs(getDifference());
    }
    public double getMax ()
    {
        return Math.max(aFirst, aSecond);
    }
    public double getMin ()
    {
        return Math.min(aFirst, aSecond);
    }
}

