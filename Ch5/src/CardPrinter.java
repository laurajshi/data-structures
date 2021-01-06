/**
 * Created by laurashi on 10/14/17.
 */
import java.util.Scanner;

public class CardPrinter
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the card notation:");
        String input = in.nextLine();
        Card card = new Card(input);
        System.out.println(card.getDescription());
    }
}
