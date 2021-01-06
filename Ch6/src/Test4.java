/**
 * Created by laurashi on 11/7/17.
 */
public class Test4
{
    public static void main (String [] args)
    {
        String word = "computer";
        String tempWord = "";
        for (int i= word.length()-1; i >= 0; i--)
        {
            tempWord = word.substring(i, i+1) + tempWord;
        }
        System.out.println(tempWord);
    }
}
