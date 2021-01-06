/**
 * Created by laurashi on 11/7/17.
 */
public class Test
{
    public static void main(String[] args)
    {
    String word = "mathematics";
    String vowels = "aeiou";
    String tempWord = "";
    String newWord = "";

    for(
    int i = 0; i<word.length();i++)
    {
        tempWord = word.substring(i, i + 1);
        if (vowels.indexOf(tempWord) >= 0)
        {
            newWord += tempWord;
        }
    }
    System.out.println(newWord);

}
}
