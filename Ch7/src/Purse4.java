/**
 * Created by 18shil on 11/20/2017.
 * Programming Practice 7.4
 */

import java.util.*;
public class Purse4
{
    ArrayList<String> contents;

    public Purse4 ()
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

    public void transfer (Purse4 other)
    {
       ArrayList<String> otherContents = other.getContents();
       for (int i= 0; i < otherContents.size(); i++)
       {
           contents.add(otherContents.get(i));
       }
        otherContents.clear();
    }
    public static void main (String [] args)
    {
        Purse4 myPurse = new Purse4();
        myPurse.addCoin("Quarter");
        myPurse.addCoin("Dime");
        myPurse.addCoin("Nickel");
        myPurse.addCoin("Dime");
        System.out.println("Purse" + myPurse); //original contents in purse1

        Purse4 otherPurse = new Purse4(); //other purse whose contents will be transferred
        otherPurse.addCoin("Dime");
        otherPurse.addCoin("Nickel");
        System.out.println("Purse" + otherPurse); //original contents in otherPurse

        myPurse.transfer(otherPurse); //transfer contents from otherPurse to purse1
        System.out.println("Purse" + myPurse); // post-transfer purse1
        System.out.println("Purse" + otherPurse); //post-transfer otherPurse


    }
}
