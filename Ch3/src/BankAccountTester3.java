/**
 * Programming Project 3.1 (p. 130)
 */
public class BankAccountTester3
{
    public static void main (String [] args)
    {
        BankAccount3 septAccount =  new BankAccount3(500, 2, 10);
        for (int i=0; i<10; i++) //deposit ten times (fees should not apply)
        {
            septAccount.deposit(200);
        }
        for (int i=0; i<10; i++) //withdraw ten times (fees should apply)
        {
            septAccount.withdraw(198);
        }
        System.out.println(septAccount); //resultant balance should be $500.00. monthly charge total should be $20.00.
        septAccount.clearTrans(); //clear transaction counter b/c new month

        BankAccount3 octAccount= new BankAccount3(800, 5, 8); //establish account for new month
        for (int i=0; i<8; i++) //deposit eight times (fees should not apply)
        {
            octAccount.deposit(100);
        }
        for (int i=0; i<8; i++) //withdraw eight times (fees should apply)
        {
            octAccount.withdraw(95);
        }
        System.out.println(octAccount); //resultant balance should be $800. monthly charge total should be $40.00

    }
}
