import java.util.*;
import java.awt.*;

public class YesNoChecker
{
    private String input = "";
    private String output = "";


    public YesNoChecker()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Do you want to continue: ");
        input = in.nextLine();
    }

    public String getAnswer()
    {
        if
        (input.equals("Y")
                || input.equalsIgnoreCase("Yes")
                || input.equalsIgnoreCase("Ok")
                || input.equalsIgnoreCase("Sure")
                || input.equalsIgnoreCase("Why not?"))

        {output ="OK";}
        else if (input.equals("N")
                || input.equals("No"))
        {output= "Terminating.";}
        else
        {output = "Bad input";}
        return output;
    }

    public static void main(String[] args)
    {
        YesNoChecker g= new YesNoChecker ();
        System.out.println(g.getAnswer());
    }
}
