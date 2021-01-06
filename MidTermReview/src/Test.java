/**
 * Created by laurashi on 1/24/18.
 */
import java.util.*;

public class Test
{


    public static void main (String [] args)
    {
        List <String> students = new ArrayList <String>();
        students.add("Alex");
        students.add("Bob");
        students.add("Carl");

        for (int k =0; k< students.size(); k++)
        {
            System.out.print(students.set(k, "Alex") + " ");

        }
        System.out.println();

        for (String str: students)
        {
            System.out.print(str + " ");
        }
    }
}
