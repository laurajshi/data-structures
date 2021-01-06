/**
 * Created by laurashi on 1/28/18.
 */
public class ArrayTest
{
    public static int arraySum (int [] array)
    {
        int sum =0;
        for (int elem: array)
            sum+= elem;
        return sum;
    }
    public static int arraySum1 (int [] array1)
    {
        int sum =0;
        for (int i =0; i< array1.length; i++)
        {
            sum += array1[i];
        }
        return sum;
    }
    public static int [] rowSums (int [][] array2D)
    {
        int [] sum = new int [array2D.length];
        int rowNum =0;
        for (int [] row: array2D)
        {
            sum[rowNum] = arraySum(row);
            rowNum++;
        }
        return sum;
    }
    public static String printArray( int [] sum)
    {
        String array = "";
        for (int i =0; i < sum.length; i++)
        {
            array += sum [i] + " ";
        }
        return array;
    }
    public static boolean isDiverse (int [] [] arrayof2D)
    {
        int [] sum = rowSums(arrayof2D);
        for (int i =0; i <sum.length; i++)
        {
            for (int j= i+1; j< sum.length; j++)
            {
                if (sum [i] == sum [j])
                {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main (String [] args)
    {
        ArrayTest myTest = new ArrayTest();
        int [] myArray = {1, 3, 2, 7, 3};
        System.out.println(arraySum(myArray));
        System.out.println(arraySum1(myArray));
        int [][] my2DArray = new int [3][3];
        my2DArray [0][0] = 1;
        my2DArray [0][1] = 2;
        my2DArray [0][2] = 3;
        my2DArray [1][0] = 1;
        my2DArray [1][1] = 5;
        my2DArray [1][2] = 5;
        my2DArray [2][0] = 2;
        my2DArray [2][1] = 1;
        my2DArray [2][2] = 2;
        System.out.println(printArray(rowSums(my2DArray)));
        System.out.println(isDiverse(my2DArray));
    }
}
