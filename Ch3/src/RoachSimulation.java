/**
 * Created by laurashi on 9/23/17.
 */
public class RoachSimulation
{
    public static void main (String [] args)
    {
        RoachPopulation p = new RoachPopulation (10,2.0, 0.1);
        p.breed();
        p.spray();
        System.out.println(p);

        int loop = 3;
        for (int i=0; i<loop; i++)
        {
            p.breed();
            p.spray();
            System.out.println(p);
        }
    }
}
