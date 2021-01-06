import java.util.Scanner;

public class HeapSort1
{

    public static void heapify(int a[], String[] names, int n, int i, int[] comparisons, int[] swaps)
    {
        int max, child;
        child = 2 * i + 1;
        max = i;
        comparisons[0] += 1;
        if (child < n) {
            comparisons[0] += 1;
            if (a[child] > a[max])
                max = child;
        }
        comparisons[0] += 1;
        if (child + 1 < n) {
            comparisons[0] += 1;
            if (a[child + 1] > a[max])
                max = child + 1;
        }
        comparisons[0] += 1;
        if (max != i)
        {
            String tempName = names[i];
            names[i] = names[max];
            names[max]=tempName;
            int temp = a[i];
            a[i] = a[max];
            a[max] = temp;
            swaps[0]++;
            heapify(a, names, n, max, comparisons, swaps);
        }
    }

    public static void buildheap(int a[], String [] names, int[] comparisons, int[] swaps)
    {
        for (int i = a.length / 2 - 1; i >= 0; i--)
        {
            heapify(a, names, a.length, i, comparisons, swaps);
        }

    }

    public static void heap(int a[], String names[], int[] comparisons, int[] swaps)
    {
        buildheap(a, names, comparisons, swaps);
        for (int i = a.length - 1; i >= 1; i--)
        {
            String tempName = names[0];
            names[0] = names[i];
            names[i] = tempName;
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;
            swaps[0]++;
            heapify(a, names, i, 0, comparisons, swaps);
        }
    }


    /**override to string method to accommodate for swaps, comparisons, and sorting by age/height
     *
     * @param a int array of either height or ages
     * @param names String array of names
     * @param comparisons stores # of comparisons
     * @param swaps stores # of swaps made
     * @return String of sorted info, comparisons, and swaps
     */
    public static String toString(int[] a, String [] names, int[] comparisons, int[] swaps)
    {
        String output = "";
        if (a.length==names.length)
        {
            for (int i =0; i< a.length; i++)
            {
                output += names[i] + ": " + a[i] + " ";
            }
        }
        return output + "\n" + "Comparisons: " + comparisons[0] + "\n" + "Swaps: " + swaps[0];
    }

    //tester method for HeapSort using scanner class
    public static void main(String args[])
    {
        int[] comparisons = new int[1];
        int[] swaps = new int[1];
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
        System.out.println(toString(arr, names,comparisons,swaps));

        heap(arr, names, comparisons,swaps);

        System.out.println("The sorted array is:");
        System.out.println(toString(arr,names,comparisons,swaps));

    }

}
