/**
 * Created by laurashi on 1/9/18.
 */
public class BrassInstrument implements Instrument
{
    private String seatSpot;
    public BrassInstrument(String mySeat)
    {
        this.seatSpot= mySeat;
    }
    public void tune()
    {
        System.out.println("Tuning middle G");
    }

    public void setSeat(String seat)
    {
        seatSpot = seat;
    }
    public String getSeat()
    {
        return seatSpot;
    }

    public static void main (String [] args)
    {
        BrassInstrument myTuba = new BrassInstrument("first chair") ;
        myTuba.tune();
    }

}
