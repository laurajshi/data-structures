/**
 * Problem 3.3
 */
public class SavingsAccountTester
{
    public static void main (String [] args)
    {
        SavingsAccount a= new SavingsAccount(1000, 10);
        a.addInterest();
        System.out.println(a);
        System.out.println("Expected value: $1100.00");
    }
}
