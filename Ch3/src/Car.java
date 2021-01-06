/**
Problem 3.5
 */
public class Car
{
    private double beginfuelAmount;
    private double fuelEfficiency;
    private double addGas;
    private double drive;
    private double gasInTank;

    public Car (double f)
    {
        this.beginfuelAmount= 0;
        this.fuelEfficiency= f;

    }
    public void addGas (double gallons)
    {
        gasInTank= beginfuelAmount + gallons;

    }
    public void drive (double miles)
    {
        gasInTank= gasInTank- (miles/ fuelEfficiency);
    }

    public double getgasInTank ()
    {
        return gasInTank;
    }
    public String toString ()
    {
        return "Remaining gas in tank: " + getgasInTank() + " miles";
    }
}
