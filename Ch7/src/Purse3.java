/**
 * Created by 18shil on 11/20/2017.
 * Programming Practice 7.3
 */

import java.util.*;
public class Purse3
{
    ArrayList<String> contents;

    public Purse3 ()
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
    public void reverse()
    {
        ArrayList <String> contents2= new ArrayList <String> ();
        for (int i=contents.size()-1; i>= 0; i--)
        {
            contents2.add(contents.get(i));
        }
        contents= contents2;
        //Or could call method of Collections: Collections.reverse(contents);
    }
    public static void main (String [] args)
    {
        Purse3 myPurse = new Purse3();
        myPurse.addCoin("Quarter");
        myPurse.addCoin("Dime");
        myPurse.addCoin("Nickel");
        myPurse.addCoin("Dime");

        System.out.println("Purse" + myPurse); // original purse
        myPurse.reverse();
        System.out.println("Purse" + myPurse); //reversed purse
    }
}
