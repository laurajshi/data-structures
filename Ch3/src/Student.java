/**
 * Problem 3.6
 */
public class Student
{
    private String name;
    private int totalScore;
    private int averageScore;
    private int quizNum;

    public Student (String n)
    {
        this.name =n;
        this.totalScore= 0;
        this.averageScore= 0;
        this.quizNum= 0;
    }
    public String getName ()
    {
        return name;
    }
    public void addQuiz (int score)
    {
        quizNum++;
        totalScore= score + totalScore;
        averageScore = totalScore/quizNum;

    }
    public double getTotalScore ()
    {
        return totalScore;
    }
    public double getAverageScore()
    {
        return averageScore;
    }
    public String toString ()
    {
        return String.format ("Student: %s, Total Score: %d, Average Score %d",name, totalScore, averageScore);
    }



}
