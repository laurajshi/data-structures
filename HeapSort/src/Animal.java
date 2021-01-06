/**
 * Created by laurashi on 3/25/18.
 */
public class Animal
{
    private int age;
    private String name;
    private int height;

    public Animal (String name, int age, int height)
    {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public int getHeight()
    {
        return height;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
