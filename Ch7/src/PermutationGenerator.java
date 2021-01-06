/**
 * Created by laurashi on 11/24/17.
 * Programming practice 7.9
 */
import java.util.*;
public class PermutationGenerator
{
    int [] permutation = new int [10];
    ArrayList<Integer> baseArray = new ArrayList<Integer>();

    public PermutationGenerator()
    {
        for (int i= 0; i<10; i++)
        {
            baseArray.add(i+1);
        }
        generate();
    }
    private void generate()
    {
        for (int j=0; j<10; j++)
        {

            int r = (int) Math.round(Math.random() * 10);
            //System.out.println("r is: " + r);
            //System.out.println("base size is: " + baseArray.size());
            if (r >= baseArray.size())
                r = baseArray.size()-1;
            permutation[j] = baseArray.get(r);
            //System.out.println("p="+permutation[j]);
            baseArray.remove(r);
        }
    }

    public int [] nextPermutation()
    {

        return permutation;
    }
    public String toString ()
    {
        String s= "";
        for (int i =0; i<permutation.length; i++)
        {
            s += permutation[i] + " ";
        }
        return s;

    }
    public static void main (String [] args)
    {
        //tests 5 situations
        PermutationGenerator p = new PermutationGenerator();
        System.out.println(p);
        PermutationGenerator p2 = new PermutationGenerator();
        System.out.println(p2);
        PermutationGenerator p3 = new PermutationGenerator();
        System.out.println(p3);
        PermutationGenerator p4 = new PermutationGenerator();
        System.out.println(p4);
        PermutationGenerator p5 = new PermutationGenerator();
        System.out.println(p5);

    }


}
