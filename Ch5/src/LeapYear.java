/**
 * Created by laurashi on 10/24/17.
 */
import java.util.Scanner;
public class LeapYear
{
    private int year;

    public LeapYear (int year)
    {
        this.year = year;
    }
    public boolean isLeapYear()

    {
        boolean isLeapYear;

        // divisible by 4
        isLeapYear = (year % 4 == 0);

        // divisible by 4 and not 100
        isLeapYear = isLeapYear && (year % 100 != 0);

        // divisible by 4 and not 100 unless divisible by 400
        isLeapYear = isLeapYear || (year % 400 == 0);

        return isLeapYear;
    }

    public void getStatement ()
    {
        if(year < 1582)
            System.out.println("Too small a year");
        else if (isLeapYear())
            System.out.println("Is leap Year");
        else System.out.println("Not leap year");
    }



    public static void main (String [] args)
    {
        Scanner in = new Scanner (System.in);
        System.out.println("Input year: ");
        int year = in.nextInt();
        LeapYear a = new LeapYear(year);
        a.getStatement();

    }

}
