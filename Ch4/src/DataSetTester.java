/**
 * Created by laurashi on 10/4/17.
 */
public class DataSetTester
{
    public static void main(String[] args)
    {
        DataSet a = new DataSet();

       a.addValue(1);
       a.addValue(2);
       a.addValue(-3);
       a.addValue(4);

        int larg = a.getLargest();
        int sml = a.getSmallest();

        System.out.println("Largest value: " + larg);
        System.out.println("Expected: 4");

        System.out.println("Smallest value: " + sml);
        System.out.println("Expected: -3");
    }
}
/*public class DataSetTester

{
    public static void main (String [] args)
    {
        DataSet a= new DataSet();
        a.addValue(4);
        a.addValue(-4);
        a.addValue(3);
        a.addValue(5);
        System.out.println("Sum: " + a.getSum());
        System.out.println("Expected Sum: 8");
        System.out.println("Average: " +a.getAverage());
        System.out.println("Expected Average: 2");
        System.out.println("Largest: " +a.getLargest());
        System.out.println("Expected Largest: 5 ");
        System.out.println("Smallest: " +a.getSmallest());
        System.out.println("Expected Smallest: -4");
    }
}
*/