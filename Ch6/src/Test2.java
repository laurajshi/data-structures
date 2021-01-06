/**
 * Created by laurashi on 11/7/17.
 */
public class Test2
{
    public static void main (String [] args)
    {
        /*
        for (int i = 4; i>=1; i--)
        {
            for (int j= 4-i+1; j>=1; j--)
                System.out.print(i);
            System.out.println();

        }
        */
        /*
        for (int i =1; i <= 4; i++)
        {
            for (int j= 1; j<=i; j++)
                System.out.print(4-i+1);
            System.out.println();
        }
        */
        for (int i =1; i <= 4; i++)
        {
            for (int j= 4; j>=4- i + 1; j--)
                System.out.print(4-i+1);
            System.out.println();
        }

    }
}
