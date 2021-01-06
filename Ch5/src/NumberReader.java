import java.util.Scanner;
public class NumberReader {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Input floating-point number: ");
        double a = in.nextDouble();
        System.out.print("Input floating-point another number: ");
        double b = in.nextDouble();
/*
Round first number to ones place
 */
        a = Math.round(a * 1000);
        a = a / 1000;
/*
Round second number to ones place
 */
        b = Math.round(b * 1000);
        b = b / 1000;

        if (a == b)
        {
            System.out.println("They are the same up to three decimal places");
        }

        else
        {
            System.out.println("They are different");
        }
    }
}