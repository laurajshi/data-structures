import java.util.Scanner;


public class Grade6
{
    private double number=0;
    private String grade = "";

    public Grade6()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number: ");
        number = in.nextDouble();
    }

    /**
     * @return Letter Grade
     */
    public String getLetterGrade()
    {

        if (number == 4.0)
        {
            grade = "A+";
        }
        else if (number < 4.0)
        {
            grade = "A";
        }
        else if (number <= 3.3)
        {
            grade = "B+";
        }
        else if (number <= 3.0)
        {
            grade = "B";
        }
        else if (number <= 2.7)
        {
            grade = "B-";
        }
        else if (number <= 2.3)
        {
            grade = "C+";
        }
        else if (number <= 2.0)
        {
           grade = "C";
        }
        else if (number <=1.7)
        {
            grade = "C-";
        }
        else if (number <= 1.3)
        {
            grade = "D+";
        }
        else if (number <=1.0)
        {
            grade = "D";
        }
        else if (number <=0)
        {
            grade = "F";
        }
        else
        {
            System.out.println("No negative numbers allowed");
        }
        return grade;
    }

    /*
     *tests class
     */
    public static void main (String [] args)
    {
        Grade6 g= new Grade6 ();
        System.out.println (g.getLetterGrade());
    }

}