/**
 * Created by laurashi on 11/7/17.
 */
import java.util.Scanner;
public class Test5
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String vowel = "aeiou";
        String word = in.next();
        int count = 0;
/*
        for (int j = 0; j < vowel.length(); j++)
        {
            String temp = vowel.substring(j, j + 1);
            if (word.indexOf(temp) != -1)
            {
                count++;
            }
        }
        System.out.println(count);
        */

        for (int i = 0; i< word.length(); i++)
        {
            for (int k=0; k < vowel.length(); k++)
            {
                if (word.substring (i, i+1).equals(vowel.substring(k, k+1)))
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

