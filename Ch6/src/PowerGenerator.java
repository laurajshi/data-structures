/**
 * Created by laurashi on 11/1/17.
 */
public class PowerGenerator
{
    private double aFactor;

    /**
     * Constructs a power generator.
     * @param aFactor the number that will be multiplied by itself
     */
    public PowerGenerator(double aFactor)
    {
        this.aFactor= aFactor;
    }

    /**
     *
     * @param n is number of times the loop will run
     * @return factor raised to power
     */
    public double nextPower(double n)
    {
       return Math.pow(aFactor, n);
    }
}
