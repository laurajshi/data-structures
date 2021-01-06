/**
 * Created by laurashi on 10/31/17.
 */
import java.util.Scanner;

public class CurrencyConverter
{
    private double exchangeRate;

    /**
     *
     * @param exchangeRate value inputted by user to be used as conversion factor
     */
    public CurrencyConverter(double exchangeRate)
    {
        this.exchangeRate=exchangeRate;
    }

    /**
     *
     * @param dollar amount to be converted
     * @return converted euro amount
     */
    public double getConvert(double dollar)
    {
        return (dollar * exchangeRate);
    }

    public static void main (String [] args)
    {
        Scanner in = new Scanner (System.in);
        System.out.print("Enter Exchange rate between U.S. dollars and the euro: ");
        CurrencyConverter a= new CurrencyConverter(in.nextDouble());

        Scanner in2 = new Scanner (System.in);
        System.out.print("Enter Dollar Amount: ");
        System.out.print("Euro Amount: €" + a.getConvert(in2.nextDouble()));

        Scanner in3= new Scanner (System.in);
        if (in3.next().equalsIgnoreCase("q"))
        {
            System.out.println("Goodbye");
            System.exit(0);
        }
    }
}
