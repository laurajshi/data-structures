public class PrimeGenerator
{
    public int n;
    public PrimeGenerator(int n)
    {
        this.n= n;
    }
    public void nextPrime()
    {
        if (n > 2)
        {
            System.out.println("2");
        }
        if (n > 3)
        {
            System.out.println("3");
        }
        if (n > 5)
        {
            System.out.println("5");
        }
        if (n >7)
        {
            System.out.println("7");
        }
        if (n >11)
        {
            System.out.println("11");
        }
        if (n >13)
        {
            System.out.println("13");
        }
        if (n >17)
        {
            System.out.println("17");
        }
        if (n >19)
        {
            System.out.println("19");
        }

    }
    public static void main(String [] args)
    {
        PrimeGenerator pg = new PrimeGenerator(20);
        pg.nextPrime();
    }
}
