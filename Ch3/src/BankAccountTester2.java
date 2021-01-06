/**
 * Created by laurashi on 9/23/17.
 */
public class BankAccountTester2
{
    public static void main (String [] args)
    {
        BankAccount2 momsSavings= new BankAccount2 (1000, 10);
        momsSavings.addInterest();
        System.out.println(momsSavings);
        System.out.println("Expected value: $1100.00");
    }
}
