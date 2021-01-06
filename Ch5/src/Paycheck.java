/**
 * Created by laurashi on 10/19/17.
 */

public class Paycheck
{
    private double hourlyWage;
    private double hours;
    double payAmount;

public Paycheck(double hourlyWage,double hours)
        {
            this.hourlyWage=hourlyWage;
            this.hours = hours;
        }

    /**
     *
     * @return amount paid
     */
    public double getPay()

        {
        if (hours>40.0)
        payAmount=(hours * (hourlyWage*1.5));
        else
        payAmount=hours*hourlyWage;
        return payAmount;
        }

}
