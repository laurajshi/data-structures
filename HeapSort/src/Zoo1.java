
import java.util.ArrayList;
public class Zoo1
{
    private ArrayList <Animal> theZoo;

    public Zoo1()
    {
        theZoo= new ArrayList<>();
    }

    public void addAnimal(Animal species)
    {
        theZoo.add(species);
    }

    public void sortAnimalAge()
    {
        int[] comparisons = new int[1];
        int[] swaps = new int[1];
        int size = theZoo.size();

        //initialize and populate array for names
        //initialize and populate array for ages
        //call static method heap()

        int[] ages = new int [size];
        String [] names = new String[size];


        int counter =0;
        for (Animal a: theZoo)
        {
            ages[counter] = a.getAge();
            names[counter] = a.getName();

            counter++;
        }

        System.out.println("Before sort by age- " + HeapSort1.toString(ages,names, comparisons, swaps));

        HeapSort1.heap(ages, names, comparisons, swaps);
        System.out.println("After sort by age- " + HeapSort1.toString(ages,names, comparisons, swaps));

    }
    public void sortAnimalHeight()
    {
        int[] comparisons = new int[1];
        int[] swaps = new int[1];
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

        System.out.println("Before sort by height- " + HeapSort1.toString(height,names,comparisons,swaps));

        HeapSort1.heap(height,names,comparisons,swaps);

        System.out.println("After sort by height- " + HeapSort1.toString(height,names,comparisons,swaps));
    }


    public static void main (String [] args)
    {
        Zoo1 rogerWilliams = new Zoo1();
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
