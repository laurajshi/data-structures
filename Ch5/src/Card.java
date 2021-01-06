/**
 * Created by laurashi on 10/14/17.
 */

public class Card
{
    private String type;
    private String suite;
    private String input;

    public Card(String input)
    {
        this.input= input;
    }

    public String getDescription()
    {
        input= input.trim();
        if (input.length()== 2)
        {
            type = input.substring(0, 1);
            suite = input.substring(1);
        }
        else if (input.length()==3)
        {
            type = input.substring(0, 2);
            suite = input.substring(2);
        }
        else return "Unknown";

        String String1= "";

        if (type.equalsIgnoreCase("K"))
        {
            String1 = "King";
        }
        else if (type.equalsIgnoreCase("Q"))
        {
            String1 = "Queen";
        }
        else if (type.equalsIgnoreCase("J"))
        {
            String1 = "Jack";
        }
        else if (type.equals("10"))
        {
            String1 = "Ten";
        }
        else if (type.equals("9"))
        {
            String1 = "Nine";
        }
        else if (type.equals("8"))
        {
            String1 = "Eight";
        }
        else if (type.equals("7"))
        {
            String1 = "Seven";
        }
        else if (type.equals("6"))
        {
            String1 = "Six";
        }
        else if (type.equals("5"))
        {
            String1 = "Five";
        }
        else if (type.equals("4"))
        {
            String1 = "Four";
        }
        else if (type.equals("3"))
        {
            String1 = "Three";
        }
        else if (type.equals("2"))
        {
            String1 = "Two";
        }
        else if (type.equalsIgnoreCase("A"))
        {
            String1 = "Ace";
        }
        else
        {
            return "Unknown";
        }

        String String2= "";
        if (suite.equalsIgnoreCase("D"))
        {
            String2 = "Diamonds";
        }
        else if (suite.equalsIgnoreCase("H"))
        {
            String2 = "Hearts";
        }
        else if (suite.equalsIgnoreCase("C"))
        {
            String2 = "Clubs";
        }
        else if (suite.equalsIgnoreCase("S"))
        {
            String2 = "Spades";
        }
        else
        {
            return "Unknown";
        }

        return String1 + " of " + String2;
    }
}
