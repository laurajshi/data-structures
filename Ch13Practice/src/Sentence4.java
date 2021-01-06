/**
 * Created by laurashi on 3/4/18.
 * Programming Problem 13.5
 */
public class Sentence4
{
    private String aWord;
    public Sentence4(String aWord)
    {
        this.aWord = aWord;
    }


    public int indexOf(String t)
    {
        if (aWord.length() < t.length())
        {
            return -1;
        }

        String sub = aWord.substring(aWord.length()-t.length());
        if (sub.equalsIgnoreCase(t))
        {
            return indexOfHelper(t, aWord.length() - t.length());
        }
        aWord = aWord.substring(0, aWord.length()- 1);
        return indexOf(t);
    }

    public int indexOfHelper(String t, int anIndex)
    {
        if (aWord.indexOf(t) == anIndex)
        {
            return anIndex;
        }
        else
        {
            aWord = aWord.substring(0, aWord.length() -1);
            return indexOf(t);
        }
    }

    //tester class for Sentence4 class
    public static void main (String [] args)
    {
        Sentence4 s = new Sentence4("Mississippi");
        System.out.println(s.indexOf("sip"));
    }
}
