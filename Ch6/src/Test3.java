/**
 * Created by laurashi on 11/7/17.
 */
import java.util.Scanner;
public class Test3
{
    public static void main (String [] args)
    {
        Scanner in = new Scanner (System.in);
        int n= in.nextInt();
        int a= 0;
        while (n>0)
        {
            a+= n%10;
            n/=10;
        }
        System.out.println("answer is: " + a);


    }


}
