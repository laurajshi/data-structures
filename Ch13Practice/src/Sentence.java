/**
 * Created by laurashi on 3/4/18.
 * Programming Practice 13.1
 */
public class Sentence
{
    private String input;
    private String output = "";

    public Sentence(String input)
    {
        this.input = input;
    }

    public void reverse()
    {
        if (input.length() != 0)
        {
            output =  input.substring(0,1) + output;
            input = input.substring(1);
            reverse();
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
