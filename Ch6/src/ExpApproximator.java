/**
 * Created by laurashi on 11/5/17.
 */
public class ExpApproximator
{

    private int n;
    private double x;
    private double term =1;
    private double sum;
    private final static double EPSILON = 0.00001;
    private double factorial =1;

    public ExpApproximator (double x)
    {
        this.x= x;
    }

    public double nextGuess()
    {
       for (n=1; n<=x; n++)
       {

           factorial = factorial *n;
           term = Math.pow(x,n)/ factorial;
           sum = sum + term;

       }
        return sum;

    }
    public static void main (String [] args)
    {
        ExpApproximator a = new ExpApproximator(3);
        System.out.println(a.nextGuess());
    }
}
