/**
 * Created by 18shil on 12/21/2017.
 */
public class DieTester
{
    public static void main (String [] args)
    {
        DataSet myDataSet = new DataSet();

        Die myDie = new Die (6);
        myDie.cast();

        myDataSet.add(myDie);
        // number of tries desired
        final int NUM_OF_ROLLS = 10;

        // simulates rolling the die TRIES amount of times
        for (int i =1; i <= NUM_OF_ROLLS; i++)
        {
            myDie.cast();
            int n = (int) myDie.getValue();
            System.out.print(n + " ");
        }
        System.out.println("\nAverage: " + myDataSet.getAverage());

    }
}
