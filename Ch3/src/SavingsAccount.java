/**
 * Problem 3.3
 */
public class SavingsAccount
{
        private double balance;
        private double newbalance;
        private double addInterest;

    public SavingsAccount (double b, double i)
        {
            this.balance = b;
            this.newbalance= b;
            this.addInterest= i;
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

