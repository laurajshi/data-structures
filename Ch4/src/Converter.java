/**
 * Created by laurashi on 10/4/17.
 */
public class Converter
{
    private double aConversionFactor;
    public Converter (double aConversionFactor)
    {
        this.aConversionFactor= aConversionFactor;
    }
    public double convertTo(double fromMeasurement)
    {
        return (fromMeasurement * aConversionFactor);
    }
    public double convertFrom (double toMeasurement)
    {
        return (toMeasurement / aConversionFactor);
    }
}
