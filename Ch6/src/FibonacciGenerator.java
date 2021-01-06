public class FibonacciGenerator
{
    private int fOld1;
    private int fOld2;
    private int fNew;

    /**
     * Constructs object with starting values of 0 and 1
     */
    public FibonacciGenerator()
    {
        this.fOld1 = 0;
        this.fOld2 = 1;
    }

    /**
     * method used to get next number in sequence
     *
     * @return new number
     */
    public int nextNumber()
    {
        fNew = fOld1 + fOld2;
        return fNew;
    }

    /**
     * assigns fOld2 to fNew to allow for only three variables.
     */
    public void deleteNumber()
    {
        fOld1 = fOld2;
        fOld2 = fNew;
    }
}