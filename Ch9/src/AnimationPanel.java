/**
 * Created by 18shil on 1/3/2018.
 */
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class AnimationPanel implements MoveableShape
{
    private Rectangle myObject;

    private static final int OBJ_X = 22;
    private static final int OBJ_Y = 22;
    private static final int OBJ_WIDTH = 100;
    private static final int OBJ_HEIGHT = 200;

    private int move_x;
    private int move_y;

    /*
    empty constructor for animation panel
     */
    public AnimationPanel()
    {

    }
    public void draw()
    {
        myObject.translate(move_x, move_y);

    }
    public void moveMyObject(int x, int y)
    {
        myObject.setLocation(x, y);

    }
    public void paintComponent(Graphics aGraphic)
    {
        Graphics2D aGraphic2 = (Graphics2D) aGraphic;

        aGraphic2.draw(myObject);
    }

    public void translateObject(int dx, int dy)
    {
        myObject.translate(dx, dy);
        draw();
    }

}
