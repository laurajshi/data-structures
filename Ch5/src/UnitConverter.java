public class UnitConverter
{
    /*
    final conversion variables
     */
    final double INCHES = 39.37;
    final double FEET = 3.28;
    final double MILES = 0.00062;
    final double MILLIMETERS = 1000;
    final double CENTIMETERS = 100;
    final double METERS = 1;
    final double KILOMETERS = 0.001;
    private double input, meters, converted;
    String fromUnit, toUnit;

    public UnitConverter(String afromUnit)
    {
        fromUnit = afromUnit;
        toUnit = afromUnit;
    }

    /**
     *
     * @param input value for conversion
     * @return converted value
     */
    public double toMeters(double input)
    {
        if (toUnit.equals("in"))
        {
            meters = (1 / INCHES);
        } else if (toUnit.equals("ft"))
        {
            meters = (1 / FEET);
        } else if (toUnit.equals("mi"))
        {
            meters = (1 / MILES);
        } else if (toUnit.equals("mm"))
        {
            meters = (1 / MILLIMETERS);
        } else if (toUnit.equals("cm"))
        {
            meters = (1 / CENTIMETERS);
        } else if (toUnit.equals("m"))
        {
            meters = (1 / METERS);
        } else
        {
            meters = (1 / KILOMETERS);
        }
        return meters;
    }

    public double fromMeters(double meters)
    {
        if (fromUnit.equals("in"))
        {
            converted = Math.round(meters * 100 * input);
        } else if (fromUnit.equals("ft"))
        {
            converted = Math.round(meters * 100 * input);
        } else if (fromUnit.equals("mi"))
        {
            converted = Math.round(meters * 100 * input);
        } else if (fromUnit.equals("mm"))
        {
            converted = Math.round(meters * 100 * input);
        } else if (fromUnit.equals("cm"))
        {
            converted = Math.round(CENTIMETERS * input);
        } else if (fromUnit.equals("m"))
        {
            converted = Math.round(METERS * input);
        } else
        {
            converted = Math.round(KILOMETERS * input);
        }
        return converted;
    }

/*
tests class
 */
    public static void main(String[] args)
    {
        UnitConverter a= new UnitConverter("cm");
        System.out.print(a.toMeters(4.0));

    }
}