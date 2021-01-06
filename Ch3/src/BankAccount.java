/**
 * Created by laurashi on 9/23/17.
 */
public class BankAccount
{
    private double balance;
    private double newbalance;
    private double deposit;
    private double withdraw1;
    private double withdraw2;

    public BankAccount (double b, double d, double w1, double w2)
    {
        this.balance =b;
        this.newbalance= b;
        this.deposit= d;
        this.withdraw1= w1;
        this.withdraw2= w2;
    }
    public void deposit ()
    {
        newbalance= newbalance + deposit;
    }
    public void withdraw1 ()
    {
        newbalance= newbalance - withdraw1;
    }
    public void withdraw2 ()
    {
        newbalance= newbalance - withdraw2;
    }
    public double getbalance ()
    {
        return newbalance;
    }
    public String toString ()
    {
        return "New Balance: $" + getbalance();
    }
}