/**
 * Created by laurashi on 3/13/18.
 */
public class Test
{
    public static void mys1(int n)
    {
        if (n>0)
        {
            mys1(n-1);
        }
        System.out.print(n);
    }
    public static void mys2(int n)
    {
        if (n>0)
        {
            mys2(n-1);
            System.out.print(n);
        }

    }
    public static void mys3(int n)
    {
        if (n>0)
        {
            mys3(n-1);

        }
        else
        {
            System.out.print(n);
        }

    }
    public static void main (String [] args)
    {
        Test aTest = new Test();
        mys1(5);
        System.out.println();
        mys2(5);
        System.out.println();
        mys3(5);
    }

}
