/**
 * Created by laurashi on 11/14/17.
 */

public class generator
{
    public static void main(String[] args)
    {

        int[] a = new int[10];

        for (int i = 0; i < a.length; i++)
            a[i] = 1 + (int) (Math.random() * 100);

        for (int i = 0; i < a.length; i++)
        {
            int number = 1 + (int) (Math.random() * 100);
            int count = 0;
            for (int j = 0; j < i; j++)
            {
                if (a[j] == number)
                {
                    count += 1;
                }
            }
            if (count > 0)
                i -= 1;
            else
                a[i] = number;
        }
    }
}
