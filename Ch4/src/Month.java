/**
 * Created by laurashi on 10/5/17.
 */

public class Month
{
    private int MonthNum;
    private String allMonths = "January  February March    April    May      June     July     August   SeptemberOctober  November December ";

    /**
     *
     * @param MonthNum number imputed
     */
    public Month (int MonthNum)
    {
        this.MonthNum= MonthNum;
    }

    /**
     *
     * @return name of month
     */
    public String getName()
    {
        String returnValue= "";
        returnValue= allMonths.substring((MonthNum-1)*9,(MonthNum) * 9);
        return returnValue.trim();
    }
    public String toString ()
    {
     return String.format("Month: %s", getName())  ;
    }
    public static void main (String [] args)
    {
        // test for all months (values 1-12)
        for (int i=1; i<=12; i++)
        {
            Month month = new Month(i);
            System.out.println(month);
        }
    }
}


