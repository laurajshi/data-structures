/**
 * Created by laurashi on 11/14/17.
 */
public class ArrayPrac
{
    public static void main(String args[])
    {

        int[] a = {100,1,22,33}; //construct array with 4 values
        int min = a[0]; // set min var to first int in array
        int max = a[0]; // set max var to first int in array
        for (int i = 0; i < a.length; i++)
        {
            if (min > a[i])
                min = a[i];
            if (max < a[i])
                max = a[i];
        }
        System.out.println("Min value is " +min);
        System.out.println("Max value is " + max);
    }
}
