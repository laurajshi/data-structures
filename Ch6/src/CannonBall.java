/**
 * Created by laurashi on 11/1/17.
 */
public class CannonBall
{
    private double initialSpeed;
    private double s;//vert distance
    private double v; //velocity
    private double t; // time
    final double g= 9.81;

    public CannonBall (double initialSpeed)
    {
        this.initialSpeed= initialSpeed;
        this.v = initialSpeed;

    }

    public void movement()
    {
        double deltaT= 0.01;
        do
        {
            v = v - g * deltaT;
            s = s + v * deltaT;
            t = t + deltaT;
            if (Math.round(t*100) % 100 == 0)
            {
                reportPoints();
            }

        } while (s > 0);
    }

    public double formula()
    {
       return (-.5 * g * Math.pow(t,2) + initialSpeed * t);
    }
    public void reportPoints()
    {
        System.out.println("Located at " + Math.round(s) + " at time " + Math.round(t)+ " Difference is " + Math.round(s-formula()));
    }

    public double height()
    {
        return s;
    }

    public static void main(String[] args) {

        CannonBall a = new CannonBall(100);
        a.movement();

    }
}

