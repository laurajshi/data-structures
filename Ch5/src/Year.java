/**
 * Created by laurashi on 10/19/17.
 */
import java.util.Scanner;
public class Year
{
    private int input;
    private String result = "";

    public Year ()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("I can tell you if a year is a leap year or not. Please enter a year after 1582: ");
        int input = in.nextInt();

    }

    public String isLeapYear()
    {
        if (input < 1582)
        {
            result = "Sorry, I can only evaluate years after 1582.";
        } else if ((input % 4 == 0 && input % 100 > 0) || (input % 400 == 0))
        {
            result = (input + " is a leap year.");
        } else
        {
            result = input + " is not a leap year.";
        }
        return result;

    }

    public static void main(String[] args)
    {
        Year a = new Year();
        System.out.println(a.isLeapYear());
    }
}




