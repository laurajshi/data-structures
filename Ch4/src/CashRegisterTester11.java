/**
 * Created by laurashi on 10/5/17.
 */
public class CashRegisterTester11
{
    public static void main(String[] args)
    {
        CashRegister11 register = new CashRegister11();

        register.recordPurchase(8.37);
        register.enterPayment(10, 0, 0, 0, 0);
        System.out.println("Dollars: " + register.giveDollars());
        System.out.println("Expected: 1");
        System.out.println("Quarters: " + register.giveQuarters());
        System.out.println("Expected: 2");
        System.out.println("Dimes: " + register.giveDimes());
        System.out.println("Expected: 1");
        System.out.println("Nickels: " + register.giveNickels());
        System.out.println("Expected: 0");
        System.out.println("Pennies: " + register.givePennies());
        System.out.println("Expected: 3");
    }
}