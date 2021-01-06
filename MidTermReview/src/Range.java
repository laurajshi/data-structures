/**
 * Created by laurashi on 1/29/18.
 */
public class Range implements NumberGroup
{
    private int minValue;
    private int maxValue;

    public Range (int minValue, int maxValue)
    {
        this.minValue = minValue;
        this.maxValue = maxValue;
    }
    public boolean contains (int num)
    {
        return (num >= minValue && num <=maxValue);
    }
}
