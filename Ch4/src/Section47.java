/**
 * Created by laurashi on 9/30/17.
 */
import java.util.Scanner;

public class Section47
{
    public static void main (String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter quantity: ");
        int quantity = in.nextInt();
        System.out.println(Math.pow(quantity, 2));
        Scanner two = new Scanner(System.in);
        System.out.print("Phrase: ");
        String phrase= two.nextLine();
        System.out.println(phrase.replace("e", "").replace("z", ""));
    }
}
