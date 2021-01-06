/**
 * Created by laurashi on 1/28/18.
 */
public class HiddenWord
{
    private String word;
    public HiddenWord (String word)
    {
        this.word = word;
    }

    public String getHint (String guess)
    {
        String hint = "";
        for (int i =0; i < guess.length(); i++)
        {
            if (guess.substring(i, i + 1).equals(word.substring(i, i+1)))
            {
                hint += guess.substring(i, i + 1);
            }
            else if (word.indexOf(guess.substring (i, i+1))!=-1)
            {
                hint += "+";
            }
            else
            {
                hint += "*";
            }

        }
        return hint;
    }
    public static void main (String [] args)
    {
        HiddenWord aWord = new HiddenWord("HARPS");
        System.out.println(aWord.getHint("AAAAA"));
        System.out.println(aWord.getHint("HELLO"));
        System.out.println(aWord.getHint("HEART"));
        System.out.println(aWord.getHint("HARMS"));
        System.out.println(aWord.getHint("HARPS"));

    }
}
