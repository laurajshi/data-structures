import java.util.Scanner;


public class Grade
{
    private double numericValue = 0;
    private String grade = "";

    public Grade()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Grade: ");
        grade = in.nextLine().toUpperCase();
    }

    /**
     * @return Numeric Grade
     */
    public double getNumericGrade()
    {

        if (grade.equals("A+") || grade.equals("A"))
        {
            numericValue = 4.0;
        } else if (grade.equals("A-"))
        {
            numericValue = 3.7;
        } else if (grade.equals("B+"))
        {
            numericValue = 3.3;
        } else if (grade.equals("B"))
        {
            numericValue = 3.0;
        } else if (grade.equals("B-"))
        {
            numericValue = 2.7;
        } else if (grade.equals("C+"))
        {
            numericValue = 2.3;
        } else if (grade.equals("C"))
        {
            numericValue = 2.0;
        } else if (grade.equals("C-"))
        {
            numericValue = 1.7;
        } else if (grade.equals("D+"))
        {
            numericValue = 1.3;
        } else if (grade.equals("D"))
        {
            numericValue = 1.0;
        } else if (grade.equals("F"))
        {
            numericValue = 0;
        } else
        {
            System.out.println("Letter not in grading system");
        }
        return numericValue;
    }

    /*
     *tests class
     */
    public static void main (String [] args)
    {
        Grade g= new Grade ();
        System.out.println (g.getNumericGrade());
    }

}