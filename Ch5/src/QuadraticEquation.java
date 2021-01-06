/**
 * Created by laurashi on 10/14/17.
 */
public class QuadraticEquation
{
    private double a;
    private double b;
    private double c;
    private boolean hasSolutions;
    private double discriminant;
    private double solution1;
    private double solution2;
    private double denom;


/*
Empty constructor with initial values of zero for each coefficient variable
 */
    public QuadraticEquation()
    {
        this.a= 0;
        this.b= 0;
        this.c= 0;
    }

    /**
     *
     * @param a coefficient a of quadratic equation
     * @param b coefficient b of quadratic equation
     * @param c coefficient c of quadratic equation
     */

    public QuadraticEquation(double a, double b, double c)
    {
        this.a= a;
        this.b= b;
        this.c= c;
        this.discriminant = (Math.pow(b,2)- (4*a*c));
        this.denom= 2*a;
    }

    /**
     * determines if there is a solution
     * @return true if there is a solution, false if not
     */
    public boolean hasSolutions ()
    {
        if (discriminant < 0)
            hasSolutions=false;
        else hasSolutions=true;
        return hasSolutions;
    }

    /**
     *
     * @return first solution (smaller of the two). Will return zero if no solution
     */
    public double getSolution1 ()
    {
        if (!hasSolutions)
            solution1=0;
        else solution1= (-b - (Math.sqrt(discriminant)))/ denom;
        return solution1;
    }

    /**
     *
     * @return second solution (larger of the two). Will return zero if no solution
     */
    public double getSolution2 ()
    {
        if (!hasSolutions)
            solution2=0;
        else solution2= (-b + (Math.sqrt(discriminant)))/ denom;
        return solution2;
    }

}
