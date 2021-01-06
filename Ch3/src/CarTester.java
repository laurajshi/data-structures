/**
 * Problem 3.5
 */
public class CarTester
{
    public static void main (String [] args)
    {
        Car myHybrid = new Car (50);
        myHybrid.addGas(20); //add 20 gallons
        myHybrid.drive(100); // drive 100 miles
        System.out.println(myHybrid);
        System.out.println("Expected value: 18.0 miles");
    }
}
