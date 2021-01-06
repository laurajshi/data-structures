/**
 * Created by laurashi on 10/4/17.
 */
public class CashRegister
{
    private double payment;
    private int itemCount;
    public CashRegister(double a) //initialize item count as 0
    {
        this.payment= a;
        this.itemCount=0;
    }

    public static final double QUARTER_VALUE= .25;
    public static final double DIME_VALUE= .1;
    public static final double NICKEL_VALUE= .05;
    public static final double PENNY_VALUE= .01;

    /**
     *
     * @param dollars
     */
    public void enterDollars (double dollars)
    {
        payment= payment + dollars;
        itemCount++;
    }

    /**
     *
     * @param quarters
     */
    public void enterQuarters (double quarters)
    {
        payment= payment +quarters *QUARTER_VALUE;
        itemCount++;
    }

    /**
     *
     * @param dimes
     */
    public void enterDimes (double dimes)
    {
        payment= payment +dimes *DIME_VALUE;
        itemCount++;
    }

    /**
     *
     * @param nickels
     */
    public void enterNickels (double nickels)
    {
        payment = payment + nickels *NICKEL_VALUE;
        itemCount++;
    }

    /**
     *
     * @param pennies
     */
    public void enterPennies (double pennies)
    {
        payment = payment + pennies *PENNY_VALUE;
        itemCount++;
    }

    /**
     *
     * @return itemCount
     */
    public int getItemCount()
    {
        return itemCount;
    }
}
/*
import java.util.Scanner;

public class Section47
{
    public static void main (String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter quantity: ");
        int quantity = in.nextInt();
        System.out.println(Math.pow(quantity, 2));
        Scanner two = new Scanner(System.in);
        System.out.print("Phrase: ");
        String phrase= two.nextLine();
        System.out.println(phrase.replace("e", "").replace("z", ""));
    }
}
 */
/*
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

 */