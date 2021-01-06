
/**
 * Created by laurashi on 12/17/17.
 * Tester class for Paycheck
 */
import java.util.Scanner;

public class PaycheckTester
{
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner (System.in);
        System.out.println("Please enter name: ");
        String name = keyboard.next();
        System.out.println("Please enter hourly wage: ");
        double wage = keyboard.nextDouble();
        System.out.println("Please enter hours worked: ");
        double hours = keyboard.nextDouble();

        Paycheck myPaycheck = new Paycheck(name, wage, hours);
        myPaycheck.printPaycheck();

    }
}
