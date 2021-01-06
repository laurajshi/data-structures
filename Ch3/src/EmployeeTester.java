/**
 * Problem 3.4
 */
public class EmployeeTester
{
    public static void main (String [] args)
    {
        Employee harry= new Employee("Hacker, Harry", 5000);
        harry.raiseSalary(10); //Harry gets a 10% raise!
        System.out.println(harry);
        System.out.println("Expected Value: Employee name: Hacker, Harry. New Salary after raise: $5500.00");
    }
}
