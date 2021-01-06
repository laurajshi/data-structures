/**
 * Programming Project 3.1 (p. 130)
 */
public class BankAccount3
{
    private double balance;
    private double fee;
    private int freetranNum;
    private int transCount;

    public BankAccount3 (double b, double f, int t)
    {
        this.balance = b;
        this.fee= f;
        this.freetranNum= t;
        this.transCount=0;
    }

    public void deposit (double d)
    {
        transCount++;
           balance= balance + d ;
    }
    public void withdraw (double w)
    {
        transCount++;
            balance= balance - w ;
    }
    public double getMonthlyCharge()
    {
        return ((transCount-freetranNum) * fee);
    }
    public double getBalance()
    {
        return balance;
    }
    public void clearTrans ()
    {
        transCount=0; //clear transaction count at end of month (must be called)
    }
    public String toString ()
    {
        return String.format("New balance at end of month: $%.2f. Total monthly Charge: $%.2f", (getBalance()- getMonthlyCharge()), (getMonthlyCharge()));
    }

}
