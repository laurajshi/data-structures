/**
 * Problem 3.4
 */
import java.lang.String;

public class Employee
{
    private String employeeName;
    private double firstSalary;
    private double currentSalary;

    public Employee (String e, double c)
    {
        this.employeeName= e;
        this.firstSalary= c;
        this.currentSalary= c;
    }
    public String getName ()
    {
        return employeeName;
    }

    public void raiseSalary (double byPercent)
    {
        currentSalary= currentSalary * (1+(byPercent/100));
    }
    public double getCurrentSalary ()
    {
        return currentSalary;
    }
    public String toString ()
    {
        return "Employee name: " + getName() + ". New Salary after raise: $" + getCurrentSalary();
    }
}

