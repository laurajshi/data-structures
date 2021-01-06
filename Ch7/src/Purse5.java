/**
 * Created by 18shil on 11/20/2017.
 * Programming Practice 7.5
 */

import java.util.*;
public class Purse5
{
    ArrayList<String> contents;

    public Purse5 ()
    {
        contents = new ArrayList<String>();
    }
    public ArrayList<String> getContents()
    {
        return contents;
    }
    public void addCoin (String coinName)
    {
        contents.add(coinName);

    }
    public String toString ()
    {
        return contents.toString();
    }

    public boolean sameContents (Purse5 other)
    {
       ArrayList<String> otherContents = other.getContents();
       for (int i= 0; i < otherContents.size(); i++)
       {
           if (!contents.get(i).equalsIgnoreCase(otherContents.get(i)))
           {
               return false;
           }
       }
       return true;
    }
    public static void main (String [] args)
    {
        Purse5 myPurse = new Purse5();
        myPurse.addCoin("Quarter");
        myPurse.addCoin("Dime");
        myPurse.addCoin("Nickel");
        myPurse.addCoin("Dime");
        System.out.println("Purse" + myPurse);

        /*
        tests a purse with same contents but different order
         */
        Purse5 otherPurse = new Purse5();
        otherPurse.addCoin("Quarter");
        otherPurse.addCoin("Dime");
        otherPurse.addCoin("Dime");
        otherPurse.addCoin("Nickel");

        System.out.println("Purse" + otherPurse);
        if (myPurse.sameContents(otherPurse) == true)
            System.out.println("Purses have same contents in the same order.");
        else
            System.out.println("Purses do NOT have same contents in the same order.");

    }
}