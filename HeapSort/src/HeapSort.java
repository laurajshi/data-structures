/**
 * Created by laurashi on 3/22/18.
 */
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;

public class HeapSort
{

    public static void heapify(int a[], String[] names, int n, int i)
    {
        int max, child;
        child = 2 * i + 1;
        max = i;
        if (child < n)
            if (a[child] > a[max])
                max = child;
        if (child + 1 < n)
            if (a[child + 1] > a[max])
                max = child + 1;
        if (max != i)
        {
            String tempName = names[i];
            names[i] = names[max];
            names[max]=tempName;
            int temp = a[i];
            a[i] = a[max];
            a[max] = temp;
            heapify(a, names, n, max);
        }
    }

    public static void buildheap(int a[], String [] names)
    {
        for (int i = a.length / 2 - 1; i >= 0; i--)
        {
            heapify(a, names, a.length, i);
        }


    }

    public static void heap(int a[], String names[])
    {
        buildheap(a, names);
        for (int i = a.length - 1; i >= 1; i--)
        {
            String tempName = names[0];
            names[0] = names[i];
            names[i] = tempName;
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;
            heapify(a, names, i, 0);
        }
    }


    public static String toString(int[] a, String [] names)
    {
        String output = "";
        if (a.length==names.length)
        {
            for (int i =0; i< a.length; i++)
            {
                 output += names[i] + ":" + a[i] + " ";
            }
        }
        return output;
    }

    //tester method for HeapSort using scanner class
    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of animals");
        int n = sc.nextInt();

        System.out.println("Enter names of animals");
        String names [] = new String[n];
        for (int j= 0; j< n; j++)
        {
            names[j] = sc.next();
        }

        System.out.println("Enter corresponding the ages");
        int arr [] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println("The unsorted array is:");
        //System.out.println(Arrays.toString(arr));
        //System.out.println(Arrays.toString(names));
        System.out.println(toString(arr, names));

        heap(arr, names);

        System.out.println("The sorted array is:");
        //System.out.println(Arrays.toString(arr));
        //System.out.println(Arrays.toString(names));
        System.out.println(toString(arr,names));

    }

}
