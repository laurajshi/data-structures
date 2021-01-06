/**
 * Created by laurashi on 11/7/17.
 */
public class Test1
{
    public static void main (String [] args)
    {
        for (int i= 0; i<5; i++)
        {
            for (int j=0; j<5; j++)
                System.out.print(i * j % 5);
            System.out.println();
        }
    }
}
