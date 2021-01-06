/**
 * Created by laurashi on 1/29/18.
 */
import java.util.ArrayList;
public class MultipleGroups implements NumberGroup
{
    private ArrayList<NumberGroup> groupList;


    public boolean contains(int num)
    {
        for (NumberGroup group: groupList)
        {
            if (group.contains(num))
            {
                return true;
            }
        }
        return false;
    }
}
