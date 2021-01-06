/**
 * Created by laurashi on 1/1/18.
 * Modified DataSet class with a method to compute minimum data element
 */

public class DataSet2
{
    private Measurable maximum;
    private Measurable minimum;
    private double sum;
    private int count;

    public void add(Measurable aValue)
    {
        sum += aValue.getValue();
        if (count ==0 || maximum.getValue() < aValue.getValue())
            maximum = aValue;

        if (count ==0 || minimum.getValue()> aValue.getValue())
            minimum = aValue;

        count++;
    }
    //computes maximum data element
    public Measurable getMaximum()
    {
        return maximum;
    }

    //computes minimum data element
    public Measurable getMinimum()
    {
        return minimum;
    }
    public double getAverage()
    {
        return sum/count;
    }

}
