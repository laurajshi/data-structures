/**
 * Created by laurashi on 9/23/17.
 */

import java.util.*;

public class VotingMachine
{
    private int dem;
    private int repub;
    private int tally;

    public VotingMachine ()
    {
        clearState();
    }
    public void voteDem ()
    {
        dem ++;
        tally ++;
    }
    public void voteRepub ()
    {
        repub ++;
        tally ++;
    }
    public void clearState ()
    {
        dem =0;
        repub = 0;
        tally =0;
    }

    public String toString ()
    {
        return String.format("Total votes: %d, Democrats: %d, Republicans: %d", tally, dem, repub);
    }
    public static void main (String [] args)
    {
        VotingMachine v = new VotingMachine();
        v.clearState();
        v.voteDem();
        v.voteRepub();
        System.out.println (v);

    }
}
