/**
 * Created by laurashi on 1/22/18.
 */
public class ATest
{
    public static void whatsIt (int n)
    {
        if (n> 10)
            whatsIt(n/10);
          System.out.print(n %10);

    }
    public static void main (String [] args)
    {
        ATest myTest = new ATest();
        whatsIt(347);
    }
}
