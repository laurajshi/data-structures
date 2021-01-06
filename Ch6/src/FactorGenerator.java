import java.util.Scanner;

public class FactorGenerator
{
    private int numberToFactor;
    private int factor;

    public FactorGenerator(int numberToFactor)
    {
        this.numberToFactor = numberToFactor;
    }

    public void nextFactor()
    {
        do
        {
            if (numberToFactor % 2 == 0)
            {
                numberToFactor = numberToFactor / 2;
                System.out.println("2");
            } else if (numberToFactor % 3 == 0)
            {
                numberToFactor = numberToFactor / 3;
                System.out.println("3");
            } else if (numberToFactor % 5 == 0)
            {
                numberToFactor = numberToFactor / 5;
                System.out.println("5");
            } else if (numberToFactor % 7 == 0)
            {
                numberToFactor = numberToFactor / 7;
                System.out.println("7");
            }
            else
            {
                System.out.println(numberToFactor);
                break;
            }
        } while (numberToFactor >= 2);
    }

    public void hasMoreFactors()
    {

    }
    public static void main (String [] args)
    {
        System.out.println("Give me a number to factor: ");
        Scanner in = new Scanner (System.in);
        FactorGenerator a = new FactorGenerator(in.nextInt());
        a.nextFactor();
    }
}
