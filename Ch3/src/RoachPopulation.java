/**
 * Created by laurashi on 9/23/17.
 */
public class RoachPopulation
{
    private double initialPop;
    private double currentPop;
    private double breedRate;
    private double sprayRate;

    public RoachPopulation (double i, double b, double s)
    {
        this.initialPop = i;
        this.currentPop = i;
        this.breedRate= b;
        this.sprayRate= s;
    }
    public void breed ()
    {
        currentPop = currentPop * breedRate;
    }
    public void spray ()
    {
        currentPop= currentPop * (1-sprayRate);
    }
    public double getCurrentPop ()
    {
        return currentPop;
    }
    public String toString ()
    {
        return "New Population: " + getCurrentPop() + " roaches";
    }
}

