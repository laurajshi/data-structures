/**
 * Created by laurashi on 10/4/17.
 */
public class PairTester
{
    public static void main (String [] args)
    {
        Pair a= new Pair (2,3);
        System.out.println("Sum: " + a.getSum()); //expected = 5.0
        System.out.println("Difference: " + a.getDifference()); //expected = 1.0
        System.out.println("Product: " + a.getProduct()); //expected = 6.0
        System.out.println("Average: " + a.getAverage()); //expected = 2.5
        System.out.println("Distance: " + a.getDistance()); //expected = 1.0
        System.out.println("Maximum " + a.getMax()); //expected = 3.0
        System.out.println("Minimum: " + a.getMin()); //expected = 2.0
    }
}
