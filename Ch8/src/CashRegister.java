/**
 * Created by 18shil on 12/14/2017.
 */
/**
 A cash register totals up sales and computes change due.
 */
public class CashRegister
{
    /**
     Constructs a cash register with no money in it.
     */
    public CashRegister()
    {
        purchase = 0;
        payment = 0;
    }

    /**
     Records the purchase price of an item.
     @param amount the price of the purchased item
     */
    public void recordPurchase(double amount)
    {
        purchase = purchase + amount;
    }

    /**
     Enters the payment received from the customer.
     @param dollars the number of dollars in the payment
     @param quarters the number of quarters in the payment
     @param dimes the number of dimes in the payment
     @param nickels the number of nickels in the payment
     @param pennies the number of pennies in the payment
     */


    public void enterPayment(int dollars, int quarters,
                             int dimes, int nickels, int pennies)
    {
        payment = dollars + quarters * QUARTER_VALUE + dimes * DIME_VALUE
                + nickels * NICKEL_VALUE + pennies * PENNY_VALUE;
    }

    public void enterPayment(int moneyCount, Money moneyType)
    {
        payment += moneyCount * moneyType.getValue();
    }

    /**
     Computes the change due and resets the machine for the next customer.
     @return the change due to the customer
     */
    public double giveChange()
    {
        double change = payment - purchase;
        purchase = 0;
        payment = 0;
        return change;
    }

    public int giveChange(Money coinType)
    {
        double change = payment - purchase;
        int amount = (int) (change / coinType.getValue());
        purchase = 0;
        payment = 0;
        return amount;
    }


    public static final double QUARTER_VALUE = 0.25;
    public static final double DIME_VALUE = 0.1;
    public static final double NICKEL_VALUE = 0.05;
    public static final double PENNY_VALUE = 0.01;
    public static final double DOLLAR_VALUE = 1.00;

    private double purchase;
    private double payment;
    public static void main (String [] args)
    {
        CashRegister moneymoneymoney = new CashRegister();
        Money dollar = new Money(DOLLAR_VALUE, "dollar");
        Money quarter = new Money (QUARTER_VALUE, "quarter");
        Money dime = new Money (DIME_VALUE, "dime");
        Money nickel = new Money (NICKEL_VALUE, "nickel");
        Money penny = new Money (PENNY_VALUE, "penny");
        //test dollars
        moneymoneymoney.enterPayment(101, penny);
        System.out.println(moneymoneymoney.giveChange(dollar));

        //test nickels
        moneymoneymoney.enterPayment(5, quarter);
        System.out.println(moneymoneymoney.giveChange(nickel));


    }
}
