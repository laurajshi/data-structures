/**
 * Created by laurashi on 1/9/18.
 */
public interface Instrument
{
    public default void tune()
    {
        System.out.println("Tuning your instrument-- from interface default");
    }
    public void setSeat(String seat);
    public String getSeat();
}
