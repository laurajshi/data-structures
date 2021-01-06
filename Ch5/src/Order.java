/**
 * Created by laurashi on 10/19/17.
 */
import java.util.*;

public class Order
{
    private String first ="";
    private String second = "";
    private String third= "";
    private String order;

    public Order()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter First Word: ");
        first = in.next();
        System.out.print("Enter Second Word: ");
        second = in.next();
        System.out.print("Enter Third Word: ");
        third = in.next();

        first.length();

        if (first.compareTo(second)<0 && first.compareTo(third)<0 && second.compareTo(third)<0)
        {
            order= first + second + third;
        }

    }
}
