/**
 * Created by laurashi on 2/12/18.
 */
/**
 * Created by laurashi on 2/12/18.
 */
/**
 This program tests the BankAccount class and
 its subclasses.
 */
public class AccountTest
{
    public static void main(String[] args)
    {
        SavingsAccount mySavings
                = new SavingsAccount(0.5);

        CheckingAccount myChecking
                = new CheckingAccount(100);

        mySavings.deposit(10000);

        mySavings.transfer(2000, myChecking);
        myChecking.withdraw(1500);
        myChecking.withdraw(80);

        mySavings.transfer(1000, myChecking);
        myChecking.withdraw(400);

        // Simulate end of month by calling concrete methods endOfMonth
        mySavings.endOfMonth();
        myChecking.endOfMonth();

        System.out.println("My savings balance: "
                + mySavings.getBalance());
        System.out.println("Expected: 7035");

        System.out.println("My checking balance: "
                + myChecking.getBalance());
        System.out.println("Expected: 1116");
    }
}

