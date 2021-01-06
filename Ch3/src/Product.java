/**
 * Problem 3.7
 */
public class Product
{
    private String name;
    private double price;

    public Product (String n, double p)
    {
        this.name= n;
        this.price= p;
    }
    public void priceReduce (double byValue)
    {
        price= price- byValue;
    }

    public String getName ()
    {
        return name;
    }
   public double getPrice()
    {
        return price;
    }
    public String toString ()
    {
        return String.format ("Name: %s at $%.2f", name, price);
    }
    public static void main (String [] args)
    {
        Product t= new Product ("Toaster", 29.99);
        System.out.println (t);
        t.priceReduce(5.00);
        System.out.println(t);

        Product c= new Product ("Coffee Maker", 100.00);
        System.out.println (c);
        c.priceReduce(5.00);
        System.out.println(c);
    }
}
