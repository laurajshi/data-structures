/**
 * Created by laurashi on 11/14/17.
 */
import java.util.Scanner;
public class ArrayPract
{
    public static void main(String[] args)
    {
        Scanner keybd = new Scanner (System.in);
        int i;
        int [ ] count = new int[10];
        System.out.println("please enter 10 numbers:  ");
        for (i = 1; i < 10; i++)
            count[i] = keybd.nextInt();


        /*
        int [ ] nums = new int[10];
        int i;
        for (i = 9 ; i >= 0 ; i--)
        {
            nums[i] = 5 * (i + 1);
            System.out.print(nums[i] + "  ");
        }
        System.out.println();
        for (i = 0 ; i < 10 ; i++)
            System.out.print(nums[i] + "  ");
        System.out.println();

        for (i = 0 ; i < 9 ; i++)
            nums[i+1] = nums[i];

        for (i = 0 ; i < 10 ; i++)
            System.out.print(nums[i] + "   ");
        System.out.println();

*/
        /*
        int [] nums = new int[10];
        int i;
        for (i = 9 ; i >= 0 ; i--) {
            nums[i] = 5 * (i + 1);
            System.out.print(nums[i] + "  ");
        }
        System.out.println();
        for (i = 0 ; i < 10 ; i++)
            System.out.print(nums[i] + "  ");
        System.out.println();
        for (i = 8 ; i >= 0 ; i--)
            nums[i+1] = nums[i];
        for (i = 0 ; i < 10 ; i++)
            System.out.print(nums[i] + "   ");
        System.out.println();
        */
    }

}


