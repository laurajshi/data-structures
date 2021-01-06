/**
 * Created by 18shil on 12/21/2017.
 * this program simulates a die and implements the Measurable interface to return the value of the rolled die
 */
import java.util.Random;
public class Die implements Measurable
{
    private int numOfSides;
    private int aValue;

    public Die (int numOfSides)
    {
        this.numOfSides = numOfSides;
    }

    public double cast()
    {
        Random generator = new Random ();
        aValue = 1+ generator.nextInt(numOfSides);
        return aValue;
    }

    public double getValue()
    {
        return aValue;
    }
}

