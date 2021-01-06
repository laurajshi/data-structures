import java.util.Scanner;

public class FibonacciRunner
{
    public static void main(String[] args)
    {
        FibonacciGenerator fb = new FibonacciGenerator();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = in.nextInt();
        System.out.println("Fibonacci Sequence up to n: "); //prints values in sequence up to the nth number
        for(int i = 1; i<= n; i++)
        {
            int nextNum = fb.nextNumber();
            System.out.println(nextNum);
            fb.deleteNumber();
        }
    }
}
