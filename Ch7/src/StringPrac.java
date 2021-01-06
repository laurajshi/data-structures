/**
 * Created by laurashi on 11/14/17.
 */

import java.util.*;
public class StringPrac
{
    public static void main (String [] args)
    {
        System.out.println("Please insert ten strings: ");

        Scanner in = new Scanner (System.in);
        String s = in.nextLine();

        String [] sArray = s.split(" ");

        //populate arraylist
        ArrayList <String> words = new ArrayList <String> ();

        for (int i=0; i<10; i++) //loop that takes ten strings and adds them to an array
        {
            words.add(sArray[i]);
        }

       //print arraylist in backwards order
        for (int n=9; n >=0; n--)
        {
            System.out.print(words.get(n) +" ");
        }

    }
}
