/**
 * Created by laurashi on 11/1/17.
 */
import java.util.Scanner;

public class PowerGeneratorRunner
{
    public static void main (String [] args)
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter factor you would like to multiply by: ");
        PowerGenerator myGenerator = new PowerGenerator(in.nextDouble());
        int n;
        for (n=1; n<=12; n++)
        {
            System.out.println(myGenerator.nextPower(n));
        }
    }
}
