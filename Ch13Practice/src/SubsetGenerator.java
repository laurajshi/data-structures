import java.util.ArrayList;

public class SubsetGenerator
{
    private String aWord;
    private ArrayList<String> outputWords;

    public SubsetGenerator(String aWord)
    {
        this.aWord = aWord;
    }


    public ArrayList<String> generate()
    {
        outputWords = new ArrayList<>();
        if (aWord.length() <=2)
        {
            outputWords.add(aWord);
        }

        else
        {

            outputWords.add(aWord);

            SubsetGenerator temp = new SubsetGenerator(aWord.substring(1, aWord.length()));
            outputWords.add(temp.generate().toString());


            SubsetGenerator temp1 = new SubsetGenerator(aWord.substring(0, aWord.length()-1));
            outputWords.add(temp1.generate().toString());

            for (int i = 1; i<= aWord.length(); i++)
            {
                SubsetGenerator temp3 = new SubsetGenerator(aWord.substring(i-1,i));
                outputWords.add(temp3.generate().toString());

            }

            // recursive method to get middle of words, not substrings
            for (int j = 0; j<= aWord.length()-2; j++)
            {
                SubsetGenerator temp4 = new SubsetGenerator(aWord.substring(j,j+1) + aWord.substring(j+2));
                outputWords.add(temp4.generate().toString());

            }

            outputWords.remove(outputWords.size()-1);

            outputWords.add("' '");

        }
        return outputWords;

    }




    // tester class for subset generator
    public static void main (String [] args)
    {
        SubsetGenerator myGen = new SubsetGenerator("rum"); //expected: [rum, [um], [ru], [r], [u], [m], [rm], ' ']
        myGen.generate();
        System.out.println((myGen.generate()).toString());
    }
}
