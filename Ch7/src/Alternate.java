/**
 * Created by 18shil on 11/22/2017.
 * Programming practice 7.8
 */
import java.util.*;
public class Alternate
{
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

    int sum=0;
    // assign pos/neg sign to value depending on index
    for (int i=0; i< anArray.length; i++)
    {
        if (i % 2 ==0)
            sum+= Integer.valueOf(anArray[i]).intValue();
        else
            sum-= Integer.valueOf(anArray[i]).intValue();
    }
    System.out.println("Alternating sum: " + sum); //compute sum
}
}
