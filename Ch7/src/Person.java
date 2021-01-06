import java.util.*;

public class Person
{
    private String aname;
    private int howOld;

    public Person(String aname, int howOld)
    {
        this.aname= aname;
        this.howOld = howOld;
    }
    public String getName ()
    {
        return aname;
    }
    public int getAge()
    {
        return howOld;
    }
    public String toString ()
    {

        return String.format("Name is %s, Age is %d", aname, howOld);
    }

    public static void main (String [] args)
    {
        ArrayList <Person> people = new ArrayList<Person>();
        people.add(new Person ("anna", 23));
        people.add(new Person ("thomas", 17));
        people.add(new Person ("lara", 19));
        people.add(new Person ("david", 34));
        people.add(new Person ("karen", 22));

        Iterator <Person> it = people.iterator();

        it.next();
        it.next();
        Person temp = it.next();
        it.remove();
        temp = it.next();
        System.out.println(temp.getName());

        System.out.println(people);


        Collections.reverse(people);
        System.out.println(people);

    }
}