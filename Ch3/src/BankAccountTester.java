/**
 * Created by laurashi on 9/23/17.
 */
public class BankAccountTester
{
    public static void main(String[] args)
    {
        BankAccount b = new BankAccount(0.00, 1000.00, 500.00, 400.00);
        b.deposit();
        b.withdraw1();
        b.withdraw2();
        System.out.println(b);
        System.out.println("Expected Value: $100.00");
    }
}