/**
 * Created by laurashi on 4/4/18.
 */
public class TestCode
{
    // method that is twice as likely (2/3 chance) to flip a head
    public static String flip()
    {
        if (Math.random() > .3333)
        {
            return "head";
        }
        else
            {
            return "tails";
        }
    }

    /**
     *
     * @param array1 first array to compare
     * @param array2 second array to compare
     * @return true if arrays are permutations of each other, false otherwise
     */
    public static boolean arePermutations (int[] array1, int[] array2)
    {
        for (int i = 0; i < array1.length; i++)
        {
            boolean temp = false;

            for(int k = 0; k < array2.length; k++)
            {
                if(array1[i] == array2[k])
                {
                     temp = true;
                }

            }
                return temp;

        }
        return false;
    }


    public static void main (String [] args)
    {
        /*
        for (int i=0; i< 10; i++)
        {
            System.out.println(flip());
        }
        */
         int [] array1 = {1,2,5,6};
         int [] array2 = {6,2,5,2};
        System.out.println(arePermutations(array1, array2));
    }
}
