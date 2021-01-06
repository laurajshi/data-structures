public class JumpingCrab
{
    public static void main (String [] args)
    {
        int count = 0;
        for (int x =0; x<3; x++)
            for (int y = x; y <3; y++)
                for (int z = y; z<3; z++)
                    count++;
        System.out.println(count);
    }
}