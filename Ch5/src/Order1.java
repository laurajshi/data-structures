/**
 * Created by laurashi on 10/19/17.
 */

import java.util.*;
public class Order1
{

public static void main(String[] args)
        {

        Scanner wordInput = new Scanner(System.in);
        String firstWord;
        String secondWord;
        String thirdWord;


        System.out.println("Enter three words separated by spaces: ");

        firstWord = wordInput.next();
        secondWord = wordInput.next();
        thirdWord = wordInput.next();


        String top = firstWord;
        String bottom = firstWord;
        if( top.compareTo(secondWord) > 0)
        {
        top = secondWord;
        }
        if( top.compareTo(thirdWord) > 0)
        {
        top = thirdWord;
        }
        if( bottom.compareTo(secondWord) < 0)
        {
        bottom = secondWord;
        }
        if( bottom.compareTo(thirdWord) < 0)
        {
        bottom = thirdWord;
        }

        String middle;
        if( !firstWord.equals(bottom) && !firstWord.equals(top) )
        {
            middle = firstWord;
        }
        else if( !secondWord.equals(bottom) && !secondWord.equals(top) )
        {
            middle = secondWord;
        }
        else
        {
            middle = thirdWord;
        }

        System.out.println( top );
        System.out.println( middle );
        System.out.println( bottom );

        }
        }