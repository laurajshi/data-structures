/**
 * Created by laurashi on 11/5/17.
 */
public class RootApproximator
{
    private double a;
    private int n;
    private double x; //guess
    private final static double EPSILON = 0.00001;

    public RootApproximator (double a, int n)
    {
        this.a= a;
        this.n =n;
        this.x = a/n;
    }
    public boolean hasMore ()
    {
        if (Math.pow(x, n) - a < EPSILON)
            return true;
        else
            return false;
    }
    public double nextGuess()
    {
        x= x - ((Math.pow(x,n))-a)/ (n*(Math.pow(x, (n-1))));
        return x;

    }
    public static void main (String [] args)
    {
        RootApproximator a = new RootApproximator(3,3);
        while (a.hasMore())
        {
            System.out.println(a.nextGuess());
        }

        System.out.println("The real result is "+ Math.pow(3.0, (1.0/3.0)));
    }
}
