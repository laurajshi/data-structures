/**
 * Created by 18shil on 12/15/2017.
 */
import java.util.InputMismatchException;
import java.util.Scanner;
public class Input
{
    public static int readInt(
            Scanner in, String prompt, String
            error, int min, int max)
    {
        System.out.println(prompt);
        int num = in.nextInt();

        if (num > min && num < max)
            {
                System.out.println("Yes! That number is between the max and the min. Goodbye");
                return num;
            }
            else
            {
                System.out.println(error);
                readInt(in, prompt, error, min, max);
            }
        return num;
        }

    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner (System.in);
        String prompt = "Please enter a number";
        String error = "WRONG! Try again inputting an integer";
        int min = 1;
        int max = 3;
        Input.readInt(keyboard, prompt, error, min, max );

    }
}
