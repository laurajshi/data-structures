/**
 * Created by laurashi on 10/5/17.
 */
public class CashRegister11
{
    public static final double QUARTER_VALUE = .25;
    public static final double DIME_VALUE = .1;
    public static final double NICKEL_VALUE = .05;
    public static final double PENNY_VALUE = .01;

    private double purchase;
    private double payment;
    private double change;

    /*
    Constructs cash register with no money initially
     */
    public CashRegister11()
    {
        this.purchase = 0;
        this.payment = 0;
    }

    public void recordPurchase(double amount)
    {
        purchase= purchase+ amount;
    }
    /**
     Enter the payment received from the customer.
     * @param dollars the number of dollars in payment
     * @param quarters the number of quarters in payment
     * @param dimes the number of dimes in payment
     * @param nickels the number of nickels in payment
     * @param pennies the number of pennies in payment
     */
    public void enterPayment (int dollars, int quarters, int dimes, int nickels, int pennies)
    {
        payment = dollars + (quarters * QUARTER_VALUE) + (dimes * DIME_VALUE) + (nickels * NICKEL_VALUE) + (pennies * PENNY_VALUE);
    }

    /**
     *
     * @return is change due to the buyer
     */
    public double giveChange()
    {
        double change= payment- purchase;
        return change;
    }

    public int giveDollars()
    {
        change= payment- purchase;
        int changeInDollars= (int)(change);
        change= change- changeInDollars;
        return changeInDollars;
    }
    public int giveQuarters()
    {
        int changeInQuarters=(int) (change/QUARTER_VALUE);
        change= change- (changeInQuarters * QUARTER_VALUE);
        return changeInQuarters;
    }
    public int giveDimes()
    {
        int changeInDimes = (int) (change/DIME_VALUE);
        change= change- (changeInDimes * DIME_VALUE);
        return changeInDimes;
    }
    public int giveNickels()
    {
        int changeInNickels = (int) (change/NICKEL_VALUE);
        change= change- (changeInNickels * NICKEL_VALUE);
        return changeInNickels;
    }
    public int givePennies()
    {
        int changeInPennies= (int) (change/PENNY_VALUE);
        purchase=0;
        payment=0;
        return changeInPennies;
    }
}
