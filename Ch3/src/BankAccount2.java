/**
 * Created by laurashi on 9/23/17.
*/
public class BankAccount2
{
    private double balance;
    private double newbalance;
    private double addInterest;

    public BankAccount2 (double b, double r)
    {
        this.balance =b;
        this.newbalance =b;
        this.addInterest= r;
    }
    public void addInterest ()
    {
        newbalance = newbalance * (1+ (addInterest/100));
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