/**
 * Created by laurashi on 12/17/17.
 * This class was created to calculate and deduct federal and SS taxes given the name, hourly wage, and hours worked of an employee.
 * The algorithm is utilizes a nested if statement to deduct federal taxes for each bracket.
 */

public class Paycheck
{
    private String name;
    private double wage;
    private double hours;
    private final double BRACKET1= 21450;
    private final double BRACKET2= 51900;
    private final double BRACKET1RATE= .15;
    private final double BRACKET2RATE= .28;
    private final double BRACKET3RATE= .31;
    private final double SSRATE = .062;


    public Paycheck (String name, double wage, double hours)
    {
        this.name = name;
        this.wage= wage;
        this.hours = hours;
    }

    public void printPaycheck()
    {
        double income = hours * wage;
        double fedTax =0;
        double ssTax =income * SSRATE;
        if (income >= BRACKET1)
        {
            fedTax+= BRACKET1* BRACKET1RATE;

            if(income >= BRACKET2)
            {
                fedTax += (BRACKET2 -BRACKET1) * BRACKET2RATE;

                // if income to BRACKET2, BRACKET3 fedTax will be 0.
                fedTax+= (income - BRACKET2) * BRACKET3RATE;
            }
            else
            {
                fedTax += (income - BRACKET1) * BRACKET2RATE;
            }
        }
        else
        {
            fedTax+=income * BRACKET1RATE;
        }

        double paycheck = income - fedTax- ssTax;
        System.out.println(String.format("Name: %s. Paycheck Amount: $%.2f. Federal Tax: $%.2f. SS Tax: $%.2f.",
                name, paycheck, fedTax, ssTax));

    }

}


