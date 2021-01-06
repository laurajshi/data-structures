/**
 * Created by laurashi on 9/27/17.
 */

import java.lang.String;

public class Marshmallow
{
    private String name;
    private int age;
    private double weight;
    private String color;

    public Marshmallow(String name, int age, double weight)
    {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    /**
     * constructor with the following parameters
     * @param n
     * @param a
     * @param w
     * @param c
     */
    public Marshmallow (String n, int a, double w, String c)
    {
        this.name = n;
        this.age = a;
        this.weight = w;
        this.color = c;
    }

    /**
     * empty constructor
     */
    public Marshmallow ()
    {

    }
    /**
     *
     * @return
     */
    public String getName()
    {
        return name;
    }

    /**
     *
     * @param name
     */

    public void setName(String name)
    {
        this.name = name;
    }

    /**
     *
     * @return
     */

    public int getAge()
    {
        return age;
    }

    /**
     *
     * @param age
     */

    public void setAge(int age)
    {
        this.age = age;
    }

    /**
     *
     * @return
     */

    public double getWeight()
    {
        return weight;
    }

    /**
     *
     * @param weight
     */

    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    /**
     *
     * @return
     */

    public String getColor()
    {
        return color;
    }

    /**
     * set color of marshmallow
     * @param color
     */

    public void setColor(String color)
    {
        this.color = color;
    }

    public String toString()
    {
        return String.format ("I made a marshmallow named %s that is %d years old and weighs %.2f pounds and is %s in color.",
                getName(),getAge(), getWeight(), getColor() );
    }
    public static void main (String [] args)
    {
        Marshmallow a= new Marshmallow();
        a.setAge(3);
        a.setColor("pink");
        a.setName("mom");
        a.setWeight(200.35);
        System.out.println(a);
    }

}
