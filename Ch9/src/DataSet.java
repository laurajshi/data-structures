/**
 * Created by laurashi on 1/1/18.
 */
public class DataSet
{
    private Measurable maximum;
    private double sum;
    private int count;

    public void add(Measurable aValue)
    {
        sum += aValue.getValue();
        if (count ==0 || maximum.getValue() < aValue.getValue())
        {
            maximum = aValue;
        }
        count++;
    }
    public Measurable getMaximum()
    {
        return maximum;
    }
    public double getAverage()
    {
        return sum/count;
    }

}
