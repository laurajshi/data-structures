/**
 * Created by laurashi on 2/15/18.
 */
public class Cake extends Food
{
    /** The size of a bite */
    private final int BITE;
    /**
     * Constructs a <code>Cake</code> actor.  The Cake.gif is
     * displayed for this actor without tinting.
     */

    public Cake()
    {
        BITE = 2;
        super(BITE);
    }
}

