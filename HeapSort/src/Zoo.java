/**
 * Created by laurashi on 3/25/18.
 */
import java.util.ArrayList;
public class Zoo
{
    private ArrayList <Animal> theZoo;
    public Zoo()
    {
        theZoo= new ArrayList<>();
    }

    public void addAnimal(Animal species)
    {
        theZoo.add(species);
    }

    public void sortAnimalAge()
    {
        int size = theZoo.size();

        int[] ages = new int [size];
        String [] names = new String[size];

        int counter =0;

        //initialize and populate array for names
        //initialize and populate array for ages
        for (Animal a: theZoo)
        {
            ages[counter] = a.getAge();
            names[counter] = a.getName();

            counter++;
        }

        System.out.println("Before sort by age- " + HeapSort.toString(ages,names));

        //call static method heap()
        HeapSort.heap(ages, names);
        System.out.println("After sort by age- " + HeapSort.toString(ages,names));

    }
    public void sortAnimalHeight()
    {
        int size = theZoo.size();

        //initialize and populate array for names
        //initialize and populate array for height
        //call static method heap()

        int[] height = new int [size];
        String [] names = new String[size];


        int counter=0;
        for (Animal a: theZoo)
        {
            height[counter] = a.getHeight();
            names[counter] = a.getName();

            counter++;
        }

        System.out.println("Before sort by height- " + HeapSort.toString(height,names));

        HeapSort.heap(height, names);
        System.out.println("After sort by height- " + HeapSort.toString(height,names));

    }


    public static void main (String [] args)
    {
        Zoo rogerWilliams = new Zoo();
        Animal giraffe = new Animal("Melman", 38, 209);
        Animal turtle = new Animal ("Crush", 202, 15);
        Animal rat = new Animal ("Remy", 18, 2);
        Animal panda = new Animal("George", 4, 67);
        Animal hippo = new Animal ("Gloria", 32, 30);

        rogerWilliams.addAnimal(giraffe);
        rogerWilliams.addAnimal(turtle);
        rogerWilliams.addAnimal(rat);
        rogerWilliams.addAnimal(panda);
        rogerWilliams.addAnimal(hippo);


        rogerWilliams.sortAnimalAge();
        System.out.println();
        rogerWilliams.sortAnimalHeight();


    }
}
