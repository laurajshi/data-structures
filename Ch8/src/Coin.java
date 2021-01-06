/**
 * Created by laurashi on 12/17/17.
 * Coin class described in 8.2
 */
public class Coin
{
    private double aValue;
    private String aName;

    public Coin (double aValue, String aName)
    {
        this.aValue = aValue;
        this.aName= aName;

    }
    public double getValue()
    {
        return aValue;
    }
}
