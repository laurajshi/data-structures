/**
 * Created by laurashi on 9/30/17.
 */
public class Review44
{
    public static void main (String [] args)
    {
        int n= 491969;
        int lastDigit = n % 10;
        System.out.println(lastDigit);

        int firstDigit = n / (int)( Math.pow( 10, (int)( Math.log(n) / Math.log(10))));
        System.out.println(firstDigit);
        double y= -1.5;
        int x= (int) Math.round(y);
        System.out.println(x);

    }
}
