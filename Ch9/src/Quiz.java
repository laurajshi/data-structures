/**
 * Created by laurashi on 1/1/18.
 */
public class Quiz implements Measurable
{
    private double grade;
    private String gradeAsLetter;

    public Quiz (double grade)
    {
        this.grade = grade;
    }
    public double getValue()
    {
        return grade;
    }
    public String getLetter()
    {
        gradeAsLetter= getLetter(grade);
        return gradeAsLetter;
    }
    public static String getLetter(double g)
    {
        String grade;
        if (g > 92.5)
            grade = "A";
        else if (g> 89.5)
            grade = "A-";
        else if (g > 86.5)
            grade = "B+";
        else if (g > 82.5)
            grade = "B";
        else if (g > 79.5)
            grade = "B-";
        else if (g > 75)
            grade = "C";
        else
            grade = "F";

        return grade;
    }


    //tester
    public static void main(String [] args)
    {
        DataSet myDataSet1 = new DataSet();

        Quiz myQuiz = new Quiz(99);
        myDataSet1.add(myQuiz);
        Quiz myQuiz2 = new Quiz(90);
        myDataSet1.add(myQuiz2);
        Quiz myQuiz3 = new Quiz(80);
        myDataSet1.add(myQuiz3);
        Quiz myQuiz4 = new Quiz(70);
        myDataSet1.add(myQuiz4);

        System.out.println(String.format("Maximum: %.2f Letter Grade: %s", myDataSet1.getMaximum().getValue(),((Quiz)myDataSet1.getMaximum()).getLetter()));

        System.out.println(String.format("Average: %.2f Letter Grade: %s ", myDataSet1.getAverage(), Quiz.getLetter(myDataSet1.getAverage())));
    }
}
