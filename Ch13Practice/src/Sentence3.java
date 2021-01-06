/**
 * Created by laurashi on 3/4/18.
 * Programming Problem 13.4
 */
public class Sentence3
{
    private String aWord;
    public Sentence3(String aWord)
    {
        this.aWord = aWord;
    }

    public boolean find(String t)
    {

        if (aWord.length() < t.length())
            return false;
         if (aWord.substring(0, t.length()).equals(t))
        return true;

        else
        {
            aWord = aWord.substring(1);
            return find(t);
        }


    }

    //tester class for Sentence3 class
    public static void main (String [] args)
    {
        Sentence3 s = new Sentence3("Mississippi");
        System.out.println(s.find("sip"));
    }
}
