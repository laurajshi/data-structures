/**
 * Created by laurashi on 11/24/17.
 * Programming practice 7.13
 */
import java.util.*;

public class MagicSquare1
{
    private int[][] squareArray;
    private int row = 0;
    private int column = 0;
    private int n;

    //constructor assigns space for a 2-D array
    public MagicSquare1(int n)
    {
        this.n = n;
        this.squareArray = new int[n][n];
        createSquare();
    }

    /**
     * method populates squareArray
     *
     */
    public void createSquare()
    {
        // 1 must be in position n-1, (n-1)/2
        // at (0,0) is k
        //cannot add if we have more than n^2 values

            //start population at bottom middle
            row = n - 1;
            column = (n - 1) / 2;
            // loop n^2 times to populate square array
            for (int k = 1; k <= n * n; k++)
            {
                // 1 must be in position n-1, (n-1)/2
                if (row == (n - 1) && column == (n - 1) / 2)
                    squareArray[row][column] = 1; //when i is 1
                else
                {
                    squareArray[row][column] = k;

                }
                row++;
                column++;
                //System.out.println("row = " + row + "column =" + column);
                if ((row == n && column == n) || (row < n && column < n && squareArray[row][column] > 0))
                {
                    row = row - 2;
                    column--;
                }
                else if (row > (n - 1))
                {
                row = 0;
                }
                else if (column > (n - 1))
                {
                    column = 0;
                }


            }
    }

    public String toString ()
    {
        String sRow = "";
        for (int i = 0; i < n; i++) //row index
        {

            for (int j = 0; j < n; j++) //column index
            {
                sRow +=(squareArray[i][j])+ " ";
            }

            sRow += "\n";
        }
        return sRow;

    }

    public static void main (String [] args)
    {

        Scanner in = new Scanner (System.in);
        System.out.println("Please input n. It must be a positive odd number.");
        int input = in.nextInt();
        if (input % 2==0)
        {
            System.out.println("Please enter positive odd number");
        }
        else
        {
            MagicSquare1 aSqaure = new MagicSquare1(input);

            System.out.println(aSqaure.toString());
        }

    }
}