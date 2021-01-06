/**
 * Created by laurashi on 11/24/17.
 * Programming practice 7.12
 */
//16 3 2 13 5 10 11 8 9 6 7 12 4 15 14 1
import java.util.*;

public class MagicSquare
{
    private int[][] squareArray;
    private int row = 0;
    private int column = 0;
    private int n;

    //constructor assigns space for a 2-D array
    public MagicSquare(int n)
    {
        this.n = n;
        this.squareArray = new int[n][n];
        //System.out.println("n is:" + n);
    }

    /**
     * method populates squareArray
     *
     * @param i value added to array
     */
    public void add(int i)
    {
        //cannot add if we have more than n^2 values
        if (row < n && column < n)
        {
            squareArray[row][column] = i;
            column++;
            if (column > n - 1)
            {
                column = 0;
                row++;
            }
        }
        else
            System.out.println("This is NOT a magic square");

    }

    private boolean onlyOnce()
    {
        ArrayList<Integer> base = new ArrayList<Integer>(); //populate array list from 1 to n^2
        for (int k = 0; k < (n * n); k++)
        {
            base.add(k + 1);
        }

        //System.out.println("base is: " + base);
        /*
        loop through two dimensional array to determine if contains number in arraylist
         */
        for (int i = 0; i < n; i++) //row index
        {
            for (int j = 0; j < n; j++) //column index
            {
                if (!base.contains(squareArray[i][j]))
                {
                    //System.out.println("Could not find" + squareArray [i] [j]);
                    return false;
                }
                else
                {
                    //System.out.println("remove" + squareArray [i] [j]);
                    base.remove((Integer)squareArray[i][j]); //remove to ensure no duplicates
                }
            }
        }

        return true;
    }

    private boolean squareSum()
    {
        int[] rowSum = new int[n];
        int[] colSum = new int[n];
        int diagSum1 = 0; //top left to bottom right
        int diagSum2 = 0; //bottom left to top right

        for (int i = 0; i < n; i++) //row index
        {
            for (int j = 0; j < n; j++) //column index
            {
                rowSum[i] += squareArray[i][j];
                colSum[j] += squareArray[i][j];
                if (i == j)
                {
                    diagSum1 += squareArray[i][j];
                }
                if (i + j == n - 1)
                {
                    diagSum2 += squareArray[i][j];
                }
            }
        }
        // always compare with rowSum [0]
        for (int m = 0; m < n; m++)
        {
            if (!(rowSum[m] == rowSum[0]))
            {
                System.out.println("Row sum m: " + rowSum[m] + "does not equal row sum 0" + rowSum[0] );
                return false;

            }
            if (!(colSum[m] == rowSum[0]))
            {
                System.out.println("Column sum m: " + colSum[m] + "does not equal row sum 0" + rowSum[0] );
                return false;
            }
        }
        if (!(diagSum1 == rowSum[0] || !(diagSum2 == rowSum[0])))
        {
            return false;
        }
        return true;
    }

    //checks if array generated is a magic square
    public boolean isMagic()
    {
        if (onlyOnce() && squareSum())

                return true;
        else
            return false;
    }
    public void printSquare ()
    {

        for (int i = 0; i < n; i++) //row index
        {
            String sRow = "";
            for (int j = 0; j < n; j++) //column index
            {
                sRow +=(squareArray[i][j])+ " ";
            }
            System.out.println(sRow);
        }

        //System.out.println("n is:" + n);
        //System.out.println("rowIndex is:" + row);
        //System.out.println("cloIndex is:" + column);
    }

    public static void main (String [] args)
    {
        //read in an array of integers input.
        //allow user to input string
        //read the user input into a String
        Scanner in = new Scanner (System.in);
        System.out.println("Please input numbers separated by spaces.");
        String input = in.nextLine();

        //convert string to array of integers
        String [] anArray = input.split(" ");

        MagicSquare aSqaure = new MagicSquare((int)Math.sqrt(anArray.length));

        for (int i =0; i< anArray.length; i++)
        {
            aSqaure.add(Integer.valueOf(anArray[i]));
        }
        aSqaure.printSquare();
        if (aSqaure.isMagic())
        {
            System.out.println("This is a magic square!");
        }
        else
            System.out.println("This is NOT a magic square!");


    }
}