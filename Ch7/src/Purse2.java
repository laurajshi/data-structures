/**
 * Created by 18shil on 11/20/2017.
 * Programming Practice 7.2
 */
import java.util.*;
public class Purse2
{
    ArrayList<String> contents;

    public Purse2 ()
    {
        contents = new ArrayList<String>();

    }
    public void addCoin (String coinName)
    {
        contents.add(coinName);
    }
    public String toString ()
    {
        return contents.toString();
    }
    public static void main (String [] args)
    {
        Purse2 myPurse = new Purse2();
        myPurse.addCoin("Quarter");
        myPurse.addCoin("Dime");
        myPurse.addCoin("Nickel");
        myPurse.addCoin("Dime");
        System.out.println("Purse" + myPurse);
    }
}
