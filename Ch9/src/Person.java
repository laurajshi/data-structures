/**
 * Created by laurashi on 1/1/18.
 * This program takes peoples names and heights (in cm) to calculate the average height among the data.
 * It also finds the maximum height and returns the name of that person
 */
public class Person implements Measurable
{
    private String name;
    private double height;
    public Person(String name, double height)
    {
        this.name= name;
        this.height= height;
    }

    public double getValue()
    {
        return height;
    }
    public String getName()
    {
        return name;
    }

    public static void main (String [] args)
    {
        DataSet2 myData = new DataSet2();

        myData.add(new Person("Lizzy", 100));
        myData.add(new Person ("Shaque", 500));
        myData.add(new Person ("Stuart Little", 20));


        System.out.println(String.format("Average Height: %.2f", myData.getAverage()));
        System.out.println(String.format("Maximum: %s, %.2f", ((Person)myData.getMaximum()).getName(), myData.getMaximum().getValue()));
        System.out.println(String.format("Minimum: %s, %.2f", ((Person)myData.getMinimum()).getName(), myData.getMinimum().getValue()));

    }

}
