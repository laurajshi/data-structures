/**
 * Created by laurashi on 11/5/17.
 */
import java.util.Scanner;
public class DataSet
{
    private int count;
    private double sum;
    private double sumSquared;
    private double std;
    private double average;

    public DataSet()
    {
    }

    public void addNum(double d)
    {
        sum = sum + d;
        sumSquared = sumSquared + Math.pow(d,2);
        count++;
    }

    public void calculateAll ()
    {
        std = Math.sqrt((sumSquared - (1 / count)* Math.pow(sum, 2)) / (count-1));
        average = sum/ count;
        System.out.println("Total count: " + count);
        System.out.println("Average: " + average);
        System.out.println("Standard Deviation: " + std);

    }
    public static void main (String [] args)
    {
        DataSet ds = new DataSet();

        Scanner in = new Scanner (System.in);
        System.out.println("Enter numbers separated by spaces. Enter 'end' when done: ");

        int count = 0;
        while (in.hasNext())
        {
            String s = in.next();
            if (s.equals("end"))
                break;
            else
            {
                double d = Double.parseDouble(s);
                ds.addNum(d);
            }
        }
        ds.calculateAll();
    }
}


