/**
 * Created by laurashi on 3/4/18.
 * Programming Practice 13.3
 */
public class Sentence2
{
    private String input;
    private String output = "";

    public Sentence2(String input)
    {
        this.input = input;
    }

    public void reverse()
    {
        for (int i =0; i<input.length(); i++)
        {
            output+= input.substring(i, i+1);
        }
    }

    public String getText()
    {
        return output;
    }

    public static void main (String [] args)
    {
        Sentence greeting = new Sentence ("Hello!");
        greeting.reverse();
        System.out.println(greeting.getText());
    }
}
