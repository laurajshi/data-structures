/**
 * Created by laurashi on 1/9/18.
 */
public class SkiJumper
{
    private int myNumberOfJumps;
    public int compareTo(Object obj)
    {
        SkiJumper temp = (SkiJumper) obj;
        return this.myNumberOfJumps- temp.myNumberOfJumps;
    }
}
